package goair.test;

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
import goair.wsdl.AdminServicesProxy;

public class AdminServicesTest 
{
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public static AdminServicesProxy adminServicesProxy = 
			new AdminServicesProxy();
	static {
		adminServicesProxy.setEndpoint("http://localhost:8080/goAir/services/AdminServices");
	}
	
	public static void testAddCustomer()
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		Customer customer = new Customer();
		customer.setEmailId("a@gmail.com");customer.setPassword("test"); 
		customer.setFirstName("Russel");customer.setLastName("Dumbar");
		customer.setGender("Male"); customer.setAddress("1010 Morse Raod");
		customer.setCity("Santa Clara");customer.setState("CA");
		customer.setZipcode("95051");customer.setDob(cal);
		customer.setNationality("American");customer.setPassportNum("CX456871");
		try {
			adminServicesProxy.addCustomer(customer);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void testAddEmployee()
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		Employee employee = new Employee();
		employee.setEmailId("russel1@gmail.com");employee.setPassword("test"); 
		employee.setFirstName("Russel");employee.setLastName("Dumbar");
		employee.setGender("Male"); employee.setAddress("1010 Morse Raod");
		employee.setCity("Santa Clara");employee.setState("CA");
		employee.setZipcode("95051");employee.setDob(cal);
		employee.setAirlineName("American");employee.setHireDate(cal);
		employee.setJobDesc("Testing");employee.setPosition("Ground Staff");
		try {
			adminServicesProxy.addEmployee(employee);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testAddFlight() throws ParseException
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		Flight flight = new Flight();
		flight.setArrivalTime(cal);
		Employee crew = new Employee();
		crew.setEmployeeId(10000);
		flight.setCrewDetails(new Employee[]{crew});
		flight.setCurrentStatus("ACTIVE");flight.setDaysOfWeek("Monday,Tuesday");
		flight.setDepartureTime(cal);flight.setDestination("San Francisco");
		flight.setFlightName("CX987");flight.setFlightStatus("Started");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = dateFormat.parse("01-11-2013");
		cal.setTime(date1);
		flight.setFlyingStartDate(cal);
		cal = Calendar.getInstance();
		date1 = dateFormat.parse("01-01-2014");
		cal.setTime(date1);
		flight.setFlyingEndDate(cal);
		Customer passenger = new Customer(); passenger.setCustomerId(10000);
		flight.setPassengers(new Customer[]{passenger});
		flight.setSeatsAvailable(400);flight.setSeatsReserved(100);
		flight.setSource("Los Angeles");flight.setTicketPrice(450.56);
		flight.setTotalSeats(500);
		try {
			adminServicesProxy.addFlight(flight);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testAddReservation()
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		Reservation reservation = new Reservation();
		Customer customer = new Customer();customer.setCustomerId(10000);
		System.out.println(customer.toString());
		reservation.setCustomerId(10000);
		Flight flight = new Flight();
		flight.setFlightId(1);
		System.out.println(flight.toString());
		reservation.setFlightId(1);
		reservation.setCreditCardNumber(346576857);
		reservation.setDateOfBooking(cal);
		reservation.setDateOfFlying(cal);
		reservation.setNumberOfSeatsBooked(46);
		reservation.setPnr(45689745);
		reservation.setTotalPrice(46*450.56);
		reservation.setCurrentStatus("ACTIVE");
		try {
			System.out.println(reservation.toString());
			adminServicesProxy.addReservation(reservation);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testEditCustomer()
	{
		try {
			Customer customer = new Customer();
			customer.setCustomerId(10000);
			customer.setAddress("6754 Ellie Ave");
			int retrunCode = adminServicesProxy.editCustomer(customer);
			System.out.println("Edit customer completed with return code : "+retrunCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testEditEmployee()
	{
		try {
			Employee employee = new Employee();
			employee.setEmployeeId(10000);
			employee.setAddress("6754 Ellie Ave");
			Calendar cal = Calendar.getInstance();
			employee.setHireDate(cal);
			int retrunCode = adminServicesProxy.editEmployee(employee);
			System.out.println("Edit customer completed with return code : "+retrunCode);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testEditFlights() throws ParseException
	{
		try {
			Flight flight = new Flight();
			flight.setFlightId(1);
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date(System.currentTimeMillis()));
			flight.setArrivalTime(cal);
			Employee crew = new Employee();
			crew.setEmployeeId(10000);
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
			Customer passenger = new Customer(); passenger.setCustomerId(10000);
			flight.setPassengers(new Customer[]{passenger});
			flight.setSeatsAvailable(400);flight.setSeatsReserved(100);
			flight.setSource("Los Angeles");flight.setTicketPrice(450.56);
			flight.setTotalSeats(500);
			int retrunCode = adminServicesProxy.editFlight(flight);
			System.out.println("Edit customer completed with return code : "+retrunCode);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testDeleteCustomer()
	{
		try {
			Customer customer = new Customer();
			customer.setCustomerId(10000);
			int retrunCode = adminServicesProxy.deleteCustomer(customer);
			System.out.println("Delete customer completed with return code : "+retrunCode);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testDeleteEmployee()
	{
		try {
			Employee employee = new Employee();
			employee.setEmployeeId(10000);
			int retrunCode = adminServicesProxy.deleteEmployee(employee);
			System.out.println("Delete employee completed with return code : "+retrunCode);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testDeleteFlight()
	{
		try {
			Flight flight = new Flight();
			flight.setFlightId(1);
			int retrunCode = adminServicesProxy.deleteFlight(flight);
			System.out.println("Delete Flight completed with return code : "+retrunCode);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testCancelReservation()
	{
		try {
			Reservation reservation = new Reservation();
			reservation.setPnr(1);
			reservation.setFlightId(1);
			reservation.setNumberOfSeatsBooked(46);
			int retrunCode = adminServicesProxy.cancelReservation(reservation);
			System.out.println("Cancel Reservation completed with return code : "+retrunCode);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ParseException
	{
		AdminServicesTest.testAddCustomer();
		AdminServicesTest.testAddEmployee();
		AdminServicesTest.testAddFlight();
		AdminServicesTest.testAddReservation();
		
		AdminServicesTest.testGetAllCustomer();
		AdminServicesTest.testGetAllEmployee();
		AdminServicesTest.testGetAllFlights();
		AdminServicesTest.testGetAllReservation();
		
		AdminServicesTest.testEditCustomer();
		AdminServicesTest.testEditEmployee();
		AdminServicesTest.testEditFlights();
		
		AdminServicesTest.testDeleteCustomer();
		AdminServicesTest.testDeleteEmployee();
		AdminServicesTest.testDeleteFlight();
		AdminServicesTest.testCancelReservation();
		
		AdminServicesTest.testGetAllCustomer();
		AdminServicesTest.testGetAllEmployee();
		AdminServicesTest.testGetAllFlights();
		AdminServicesTest.testGetAllReservation();
	}

}
