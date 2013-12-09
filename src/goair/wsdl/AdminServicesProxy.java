package goair.wsdl;

public class AdminServicesProxy implements goair.wsdl.AdminServices {
  private String _endpoint = null;
  private goair.wsdl.AdminServices adminServices = null;
  
  public AdminServicesProxy() {
    _initAdminServicesProxy();
  }
  
  public AdminServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdminServicesProxy();
  }
  
  private void _initAdminServicesProxy() {
    try {
      adminServices = (new goair.wsdl.AdminServicesServiceLocator()).getAdminServices();
      if (adminServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adminServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adminServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adminServices != null)
      ((javax.xml.rpc.Stub)adminServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public goair.wsdl.AdminServices getAdminServices() {
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    adminServices.main(args);
  }
  
  public goair.model.customer.Customer[] searchCustomersForAdmin(goair.util.SearchParametersForCustomers searchParameters) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.searchCustomersForAdmin(searchParameters);
  }
  
  public goair.model.customer.Customer[] getAllCustomersForAdmin() throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.getAllCustomersForAdmin();
  }
  
  public goair.model.employee.Employee[] searchEmployeesForAdmin(goair.util.SearchParametersForEmployees searchParameters) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.searchEmployeesForAdmin(searchParameters);
  }
  
  public goair.model.employee.Employee[] getAllEmployeesForAdmin() throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.getAllEmployeesForAdmin();
  }
  
  public goair.model.reservation.Reservation[] searchReservationsForAdmin(goair.util.SearchParametersForReservation searchParameters) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.searchReservationsForAdmin(searchParameters);
  }
  
  public goair.model.reservation.Reservation[] getAllReservationsForAdmin() throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.getAllReservationsForAdmin();
  }
  
  public int editEmployee(goair.model.employee.Employee employee) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.editEmployee(employee);
  }
  
  public int deleteEmployee(goair.model.employee.Employee employee) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.deleteEmployee(employee);
  }
  
  public int addReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.addReservation(reservation);
  }
  
  public int editReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.editReservation(reservation);
  }
  
  public int cancelReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.cancelReservation(reservation);
  }
  
  public int deleteFlight(goair.model.flight.Flight flight) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.deleteFlight(flight);
  }
  
  public int addEmployee(goair.model.employee.Employee employee) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.addEmployee(employee);
  }
  
  public int deleteCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.deleteCustomer(customer);
  }
  
  public int editCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.editCustomer(customer);
  }
  
  public goair.model.flight.Flight[] searchFlightsForAdmin(goair.util.SearchParametersForFlights searchParameters) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.searchFlightsForAdmin(searchParameters);
  }
  
  public int addCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.addCustomer(customer);
  }
  
  public int editFlight(goair.model.flight.Flight flight) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.editFlight(flight);
  }
  
  public int addFlight(goair.model.flight.Flight flight) throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.addFlight(flight);
  }
  
  public goair.model.flight.Flight[] getAllFlightsForAdmin() throws java.rmi.RemoteException{
    if (adminServices == null)
      _initAdminServicesProxy();
    return adminServices.getAllFlightsForAdmin();
  }
  
  
}