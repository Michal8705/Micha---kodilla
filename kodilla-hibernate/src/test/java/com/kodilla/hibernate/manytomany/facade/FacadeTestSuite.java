package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    Facade facade;

    @Test
    public void testQueryFacade() {
        //Given
        Employee employee1 = new Employee("Adam", "Kowalski");
        Employee employee2 = new Employee("Marcin", "Nowak");
        Employee employee3 = new Employee("Darek", "Musiał");

        Company company1 = new Company("Google");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("Microtech");

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);

        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();
        companyDao.save(company3);
        int company3Id = company3.getId();

        //When
        List<Company> companiesName = facade.searchCompanyWithNameParts("%Goo%");
        List<Employee> employeesLastname = facade.searchEmployeeWithLastnameParts("%Kow%");

        //Then
        Assert.assertEquals(1, companiesName.size());
        Assert.assertEquals(1, employeesLastname.size());


        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            companyDao.deleteById(company3Id);
        } catch (Exception e) {
            //do nothing
        }
        //CleanUp
    }
}
