/**
 * AirlineServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public interface AirlineServices extends java.rmi.Remote {
    public int cancelReservation(goair.model.reservation.Reservation booking) throws java.rmi.RemoteException;
    public int createReservation(goair.model.customer.Customer customer, goair.model.flight.Flight flight) throws java.rmi.RemoteException;
}
