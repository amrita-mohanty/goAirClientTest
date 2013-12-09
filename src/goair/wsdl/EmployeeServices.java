/**
 * EmployeeServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public interface EmployeeServices extends java.rmi.Remote {
    public goair.model.employee.Employee employeeLogin(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public int editEmployeeProfile(goair.model.employee.Employee employeeBean) throws java.rmi.RemoteException;
    public goair.model.flight.Flight[] viewEmployeeFlight(goair.util.SearchParametersForFlights searchFlightParam) throws java.rmi.RemoteException;
}
