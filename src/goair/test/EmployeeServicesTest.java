package goair.test;

import goair.Exception.AirlineException;
import goair.model.employee.Employee;
import goair.model.flight.Flight;
import goair.util.SearchParametersForFlights;
import goair.wsdl.EmployeeServicesProxy;

public class EmployeeServicesTest {
	
	
	public static EmployeeServicesProxy employeeServicesProxy = 
			new EmployeeServicesProxy();
	static {
		employeeServicesProxy.setEndpoint("http://localhost:8080/goAir1/services/EmployeeServices");
	}
	
	public static void viewEmployeeFlights(int employeeId) {
		
		try {
			SearchParametersForFlights searchFlightParam = new SearchParametersForFlights();
			searchFlightParam.setEmployeeId(employeeId);
			for (Flight flight : employeeServicesProxy.viewEmployeeFlight(searchFlightParam))
			{
				System.out.println("Flight : "+flight.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Employee validateLogin(String username, String password) {
		
		Employee emp = null;
		try {
			emp = employeeServicesProxy.employeeLogin(username, password);
		} catch (AirlineException e) {
			System.out.println("***** INSIDE EXCEPTION *******");
			System.out.println("Error Code: " + e.getErrorCode());
			e.printStackTrace();
			//System.out.println(e.getMessage1());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("OUTPUT: " + emp);
		
		return emp;
	}
	
	public static void main(String[] args) {
		//EmployeeServicesTest.viewEmployeeFlights(1);
		EmployeeServicesTest.validateLogin("russel1@gmail.com", "testt");
	}
	
	
}
