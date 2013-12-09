/**
 * AdminServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public interface AdminServices extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public goair.model.customer.Customer[] searchCustomersForAdmin(goair.util.SearchParametersForCustomers searchParameters) throws java.rmi.RemoteException;
    public goair.model.customer.Customer[] getAllCustomersForAdmin() throws java.rmi.RemoteException;
    public goair.model.employee.Employee[] searchEmployeesForAdmin(goair.util.SearchParametersForEmployees searchParameters) throws java.rmi.RemoteException;
    public goair.model.employee.Employee[] getAllEmployeesForAdmin() throws java.rmi.RemoteException;
    public goair.model.reservation.Reservation[] searchReservationsForAdmin(goair.util.SearchParametersForReservation searchParameters) throws java.rmi.RemoteException;
    public goair.model.reservation.Reservation[] getAllReservationsForAdmin() throws java.rmi.RemoteException;
    public int editEmployee(goair.model.employee.Employee employee) throws java.rmi.RemoteException;
    public int deleteEmployee(goair.model.employee.Employee employee) throws java.rmi.RemoteException;
    public int addReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException;
    public int editReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException;
    public int cancelReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException;
    public int deleteFlight(goair.model.flight.Flight flight) throws java.rmi.RemoteException;
    public int addEmployee(goair.model.employee.Employee employee) throws java.rmi.RemoteException;
    public int deleteCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException;
    public int editCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException;
    public goair.model.flight.Flight[] searchFlightsForAdmin(goair.util.SearchParametersForFlights searchParameters) throws java.rmi.RemoteException;
    public int addCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException;
    public int editFlight(goair.model.flight.Flight flight) throws java.rmi.RemoteException;
    public int addFlight(goair.model.flight.Flight flight) throws java.rmi.RemoteException;
    public goair.model.flight.Flight[] getAllFlightsForAdmin() throws java.rmi.RemoteException;
    public goair.model.employee.Employee[] getEmpployeesForFlight(int flightId) throws java.rmi.RemoteException;
    public goair.model.customer.Customer[] getCustomersForFlight(int flightId) throws java.rmi.RemoteException;
}
