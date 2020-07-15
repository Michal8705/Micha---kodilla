package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompanyWithNameParts(String name) {
        return companyDao.retrieveCompaniesWithNameParts(name);
    }

    public List<Employee> searchEmployeeWithLastnameParts(String lastname) {
        return employeeDao.retrieveEmployeesWithLastnameParts(lastname);
    }
}