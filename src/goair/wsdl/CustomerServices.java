/**
 * CustomerServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public interface CustomerServices extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public goair.model.flight.Flight[] searchFlights(goair.util.SearchParametersForFlights searchFlightParam) throws java.rmi.RemoteException;
    public goair.model.customer.Customer customerLogin(java.lang.String emailId, java.lang.String password) throws java.rmi.RemoteException;
    public goair.model.reservation.Reservation[] viewAllReservations(goair.util.SearchParametersForReservation searchParam) throws java.rmi.RemoteException;
    public int addReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException;
    public int cancelReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException;
    public int editCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException;
    public int addCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException;
    public int createReservation(goair.model.customer.Customer customer, goair.model.flight.Flight flight) throws java.rmi.RemoteException;
}
