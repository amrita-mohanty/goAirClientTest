package goair.test;

import java.rmi.RemoteException;
import java.text.ParseException;

import goair.model.reservation.Reservation;
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
	public static void main(String[] args) throws ParseException
	{
		CustomerServicesTest.testGetAllReservation();
		
	}

}
