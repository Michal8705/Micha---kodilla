package com.kodilla.good.patterns.challenges.Airline;

public final class Transfer {

    private final String departure;
    private final String arrival;
    private final String transfer;

    public Transfer(final String departure, final String arrival, final String transfer) {
        this.departure = departure;
        this.arrival = arrival;
        this.transfer = transfer;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getTransfer() {
        return transfer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transfer tran = (Transfer) o;

        if (!transfer.equals(tran.transfer)) return false;
        if (!departure.equals(tran.departure)) return false;
        return arrival.equals(tran.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 7 * result + arrival.hashCode()+ transfer.hashCode();
        return result;
    }
}
