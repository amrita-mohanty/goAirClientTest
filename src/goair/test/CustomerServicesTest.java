package goair.test;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import goair.model.customer.Customer;
import goair.model.flight.Flight;
import goair.model.reservation.Reservation;
import goair.util.SearchParametersForFlights;
import goair.util.SearchParametersForReservation;
import goair.wsdl.CustomerServicesProxy;

public class CustomerServicesTest 
{
	public static CustomerServicesProxy customerServicesProxy = 
			new CustomerServicesProxy("http://localhost:8080/goAir/services/CustomerServices");
	
	public static void testGetAllReservation()
	{
		SearchParametersForReservation searchParam = new SearchParametersForReservation();
		searchParam.setCustomerId(10000);
		searchParam.setFlightId(1);
		
		System.out.println(searchParam.toString());
		try {
			for (Reservation reservation : customerServicesProxy.viewAllReservations(searchParam))
			{
				System.out.println("Reservation : "+reservation.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void testValidateCustomer()
	{
		try {
			Customer validCustomer = customerServicesProxy.customerLogin("a@gmail.com", "test");
			if(validCustomer != null)
			{
				System.out.println("Valid customer : "+validCustomer.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testGetAllFlightsForCustomer()
	{
		try {
			SearchParametersForFlights searchParametersForFlights = new 
					SearchParametersForFlights();
			searchParametersForFlights.setSource("Los Angeles");
			searchParametersForFlights.setDestination("San Diego");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance(); cal.setTime(dateFormat.parse("2013-11-04"));
			searchParametersForFlights.setDateOfFlying(cal);
			for(Flight flight : customerServicesProxy.searchFlights(searchParametersForFlights))
			{
				System.out.println("Flight : "+flight.toString());
			}
		} catch (RemoteException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ParseException
	{
//		CustomerServicesTest.testGetAllReservation();
		CustomerServicesTest.testValidateCustomer();
		CustomerServicesTest.testGetAllFlightsForCustomer();
		
	}

}
