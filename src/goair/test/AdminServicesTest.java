package goair.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.rmi.RemoteException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import goair.model.customer.Customer;
import goair.model.employee.Employee;
import goair.model.flight.Flight;
import goair.model.reservation.Reservation;
import goair.util.SearchParametersForCustomers;
import goair.util.SearchParametersForEmployees;
import goair.util.SearchParametersForFlights;
import goair.util.SearchParametersForReservation;
import goair.wsdl.AdminServicesProxy;

public class AdminServicesTest 
{
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static AdminServicesProxy adminServicesProxy = 
			new AdminServicesProxy();
	static {
		adminServicesProxy.setEndpoint("http://localhost:8080/goAir/services/AdminServices");
	}

	@Test
	public static void testAddCustomer()
	{
		for(int i=1;i<=100000;i++){

			long startCustId = 863100000 + i;

			String custid = "" + startCustId;

			String customerIdInSNNFormat = custid.substring(0,3) +"-"+custid.substring(3,5) + "-"+custid.substring(5,9);

			//System.out.println("customerIdInSNNFormat = " + customerIdInSNNFormat);

			Calendar cal = Calendar.getInstance();

			cal.setTime(new Date(System.currentTimeMillis()));

			Customer customer = new Customer();

			customer.setCustomerId(customerIdInSNNFormat);

			customer.setEmailId("a@gmail.com" + startCustId);customer.setPassword("test" + i); 

			customer.setFirstName("Russel" + i);customer.setLastName("Dumbar" + i);

			customer.setGender("Male"); customer.setAddress("1010 Morse Raod" + i);

			customer.setCity("Santa Clara");customer.setState("CA");

			customer.setZipcode("95051");customer.setDob(cal);

			customer.setNationality("American");customer.setPassportNum("CX456871" + i);

			try {

				int j = adminServicesProxy.addCustomer(customer);
				if(j != 1)
					fail("Cannot add customer");

			} catch (RemoteException e) {

				e.printStackTrace();

			}

		}

	}



	@Test
	public static void testAddEmployee()
	{

		for(int i=1;i<=5000;i++){

			long startEmpId = 883100000 + i;

			String empid = "" + startEmpId;

			String empIdInSNNFormat = empid.substring(0,3) +"-"+empid.substring(3,5) + "-"+empid.substring(5,9);

			Calendar cal = Calendar.getInstance();

			cal.setTime(new Date(System.currentTimeMillis()));

			Employee employee = new Employee();

			employee.setEmployeeId(empIdInSNNFormat);

			employee.setAirlineName("GoAir");

			employee.setEmailId("russel1@gmail.com" + startEmpId );employee.setPassword("test" + i); 

			employee.setFirstName("Andrew" + i);employee.setLastName("Peters" + i);

			employee.setGender("Male"); employee.setAddress("1010 Morse Raod" + i);

			employee.setCity("Santa Clara");employee.setState("CA");

			employee.setZipcode("95051");employee.setDob(cal);

			employee.setAirlineName("American");employee.setHireDate(cal);

			employee.setJobDesc("Testing");employee.setPosition("Ground Staff");

			try {

				int j= adminServicesProxy.addEmployee(employee);
				if(j != 1)
					fail("Cannot add employee");

			} catch (RemoteException e) {

				e.printStackTrace();

			}
		}
	}

	@Test
	public static void testAddFlight() throws ParseException
	{
		for(int j=2;j<=5000;j++) {
			long startEmpId = 883100000 + j;
			String empid = "" + startEmpId;
			String empIdInSNNFormat = empid.substring(0,3) +"-"+empid.substring(3,5) + "-"+empid.substring(5,9);
			
			long startCustId = 863100000 + j;
			String custid = "" + startCustId;
			String customerIdInSNNFormat = custid.substring(0,3) +"-"+custid.substring(3,5) + "-"+custid.substring(5,9);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date(System.currentTimeMillis()));
			Flight flight = new Flight();
			flight.setArrivalTime(cal);
			Employee crew = new Employee();
			crew.setEmployeeId(empIdInSNNFormat);
			flight.setCrewDetails(new Employee[]{crew});
			flight.setAirlineName("GoAir");
			flight.setCurrentStatus("ACTIVE");flight.setDaysOfWeek("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday");
			flight.setDepartureTime(cal);flight.setDestination("San Francisco");
			flight.setFlightName("CX987"+j);flight.setFlightStatus("Started");
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date1 = dateFormat.parse("01-11-2013");
			cal.setTime(date1);
			flight.setFlyingStartDate(cal);
			cal = Calendar.getInstance();
			date1 = dateFormat.parse("01-01-2014");
			cal.setTime(date1);
			flight.setFlyingEndDate(cal);
			Customer passenger = new Customer(); passenger.setCustomerId(customerIdInSNNFormat);
			flight.setPassengers(new Customer[]{passenger});
			flight.setSeatsAvailable(400);flight.setSeatsReserved(100);
			flight.setSource("Los Angeles");flight.setTicketPrice(450.56);
			flight.setTotalSeats(500);
			try {
				int i= adminServicesProxy.addFlight(flight);
				if(i != 1)
					fail("Cannot add flight");
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public static void testAddReservation()
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		Reservation reservation = new Reservation();
		Customer customer = new Customer();customer.setCustomerId("987-98-9876");
		System.out.println(customer.toString());
		reservation.setCustomerId("987-98-9876");
		Flight flight = new Flight();
		flight.setFlightId(1);
		System.out.println(flight.toString());
		reservation.setFlightId(1);
		reservation.setCreditCardNumber("1234123412341234");
		reservation.setDateOfBooking(cal);
		reservation.setDateOfFlying(cal);
		reservation.setNumberOfSeatsBooked(46);
		reservation.setPnr(45689745);
		reservation.setTotalPrice(46*450.56);
		reservation.setCurrentStatus("ACTIVE");
		try {
			System.out.println(reservation.toString());
			int i= adminServicesProxy.addReservation(reservation);
			if(i != 1)
				fail("Cannot add reservation");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testGetAllCustomer()
	{
		try {
			Customer[] customers = adminServicesProxy.getAllCustomersForAdmin();
			if(customers != null)
			{
				for (Customer customer : customers)
				{
					System.out.println("Customer : "+customer.toString());
				}
			}
			else  {
				fail("Cannot get customers for admin");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testGetAllEmployee()
	{
		try {
			Employee[] employees = adminServicesProxy.getAllEmployeesForAdmin();
			if(employees != null)
			{
				for (Employee employee : employees)
				{
					System.out.println("Employee : "+employee.toString());
				}
			}
			else  {
				fail("Cannot get employees for admin");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testGetAllFlights()
	{
		try {
			Flight[] flights = adminServicesProxy.getAllFlightsForAdmin();
			if(flights != null)
			{
				for (Flight flight : flights)
				{
					System.out.println("Flight : "+flight.toString());
				}
			}
			else   {
				fail("Cannot get flights for admin");
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testGetAllReservation()
	{
		try {
			Reservation[] reservations = adminServicesProxy.getAllReservationsForAdmin();
			if(reservations != null)
			{
				for (Reservation reservation : reservations)
				{
					System.out.println("Reservation : "+reservation.toString());
				}
			}
			else   {
				fail("Cannot get reservations for admin");
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testEditCustomer()
	{
		try {
			Customer customer = new Customer();
			customer.setCustomerId("987-98-9876");
			customer.setAddress("6754 Ellie Ave");
			int returnCode = adminServicesProxy.editCustomer(customer);
			System.out.println("Edit customer completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot edit customer");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testEditEmployee()
	{
		try {
			Employee employee = new Employee();
			employee.setEmployeeId("123-12-1234");
			employee.setAddress("6754 Ellie Ave");
			Calendar cal = Calendar.getInstance();
			employee.setHireDate(cal);
			int returnCode = adminServicesProxy.editEmployee(employee);
			System.out.println("Edit employee completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot edit employee");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testEditFlights() throws ParseException
	{
		try {
			Flight flight = new Flight();
			flight.setFlightId(1);
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date(System.currentTimeMillis()));
			flight.setArrivalTime(cal);
			Employee crew = new Employee();
			crew.setEmployeeId("123-12-1234");
			flight.setCrewDetails(new Employee[]{crew});
			flight.setCurrentStatus("ACTIVE");flight.setDaysOfWeek("Monday");
			flight.setDepartureTime(cal);flight.setDestination("San Diego");
			flight.setFlightName("CX987");flight.setFlightStatus("Started");
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date1 = dateFormat.parse("01-11-2013");
			cal.setTime(date1);
			flight.setFlyingStartDate(cal);
			cal = Calendar.getInstance();
			date1 = dateFormat.parse("01-01-2014");
			cal.setTime(date1);
			flight.setFlyingEndDate(cal);
			Customer passenger = new Customer(); passenger.setCustomerId("987-98-9876");
			flight.setPassengers(new Customer[]{passenger});
			flight.setSeatsAvailable(400);flight.setSeatsReserved(100);
			flight.setSource("Los Angeles");flight.setTicketPrice(450.56);
			flight.setTotalSeats(500);
			int returnCode = adminServicesProxy.editFlight(flight);
			System.out.println("Edit flight completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot edit flight");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testDeleteCustomer()
	{
		try {
			Customer customer = new Customer();
			customer.setCustomerId("987-98-9876");
			int returnCode = adminServicesProxy.deleteCustomer(customer);
			System.out.println("Delete customer completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot delete customer");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testDeleteEmployee()
	{
		try {
			Employee employee = new Employee();
			employee.setEmployeeId("123-12-1234");
			int returnCode = adminServicesProxy.deleteEmployee(employee);
			System.out.println("Delete employee completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot delete employee");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testDeleteFlight()
	{
		try {
			Flight flight = new Flight();
			flight.setFlightId(1);
			int returnCode = adminServicesProxy.deleteFlight(flight);
			System.out.println("Delete Flight completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot delete flight");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testCancelReservation()
	{
		try {
			Reservation reservation = new Reservation();
			reservation.setPnr(1);
			reservation.setFlightId(1);
			reservation.setNumberOfSeatsBooked(46);
			int returnCode = adminServicesProxy.cancelReservation(reservation);
			System.out.println("Cancel Reservation completed with return code : "+returnCode);
			if(returnCode != 1)
				fail("Cannot cancel reservation");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testSearchCustomer()
	{
		try {
			SearchParametersForCustomers searchParameters = new SearchParametersForCustomers();
			searchParameters.setCustomerId("987-98-9876");
			Customer[] customers = adminServicesProxy.searchCustomersForAdmin(searchParameters);
			System.out.println("Search customer completed for search parameter : "+searchParameters.toString());
			if(customers != null)
			{
				for (Customer customer : customers)
				{
					System.out.println("Customer : "+customer.toString());
				}
			}
			else  {
				fail("Cannot search customer");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testSearchEmployee()
	{
		try {
			SearchParametersForEmployees searchParameters = new SearchParametersForEmployees();
			searchParameters.setEmployeeId("883-10-1001");
			Employee[] employees = adminServicesProxy.searchEmployeesForAdmin(searchParameters);
			System.out.println("Search employees completed for search parameter : "+searchParameters.toString());
			if(employees != null)
			{
				for (Employee employee : employees)
				{
					System.out.println("Employee : "+employee.toString());
				}
			}
			else  {
				fail("Cannot search employee");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testSearchFlight()
	{
		try {
			SearchParametersForFlights searchParameters = new SearchParametersForFlights();
			searchParameters.setFlightId(1);
			searchParameters.setSource("Los Angeles");
			Flight[] flights = adminServicesProxy.searchFlightsForAdmin(searchParameters);
			System.out.println("Search flights completed for search parameter : "+searchParameters.toString());
			if(flights != null)
			{
				for (Flight flight : flights)
				{
					System.out.println("Flight : "+flight.toString());
				}
			}
			else  {
				fail("Cannot search flight");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void testSearchReservation()
	{
		try {
			SearchParametersForReservation searchParameters = new SearchParametersForReservation();
			searchParameters.setFlightId(1);
			Reservation[] reservations = adminServicesProxy.searchReservationsForAdmin(searchParameters);
			System.out.println("Search reservation completed for search parameter : "+searchParameters.toString());
			if(reservations != null)
			{
				for (Reservation reservation : reservations)
				{
					System.out.println("Reservation : "+reservation.toString());
				}
			}
			else  {
				fail("Cannot search reservation");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ParseException
	{
		//AdminServicesTest.testAddCustomer();
		//AdminServicesTest.testAddEmployee();
		//AdminServicesTest.testAddFlight();
		//AdminServicesTest.testAddReservation();

		//		AdminServicesTest.testGetAllCustomer();
		//		AdminServicesTest.testGetAllEmployee();
		//		AdminServicesTest.testGetAllFlights();
		//		AdminServicesTest.testGetAllReservation();
		//		
		//		AdminServicesTest.testEditCustomer();
		//		AdminServicesTest.testEditEmployee();
		//		AdminServicesTest.testEditFlights();
		//		
		//		AdminServicesTest.testSearchCustomer();
				AdminServicesTest.testSearchEmployee();
		//		AdminServicesTest.testSearchFlight();
		//		AdminServicesTest.testSearchReservation();
		//		
		//		AdminServicesTest.testDeleteCustomer();
		//		AdminServicesTest.testDeleteEmployee();
		//		AdminServicesTest.testDeleteFlight();
		//		AdminServicesTest.testCancelReservation();
		//		
		//		AdminServicesTest.testGetAllCustomer();
		//		AdminServicesTest.testGetAllEmployee();
		//		AdminServicesTest.testGetAllFlights();
		//		AdminServicesTest.testGetAllReservation();

	}

}
