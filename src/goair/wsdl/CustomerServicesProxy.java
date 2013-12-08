package goair.wsdl;

public class CustomerServicesProxy implements goair.wsdl.CustomerServices {
  private String _endpoint = null;
  private goair.wsdl.CustomerServices customerServices = null;
  
  public CustomerServicesProxy() {
    _initCustomerServicesProxy();
  }
  
  public CustomerServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerServicesProxy();
  }
  
  private void _initCustomerServicesProxy() {
    try {
      customerServices = (new goair.wsdl.CustomerServicesServiceLocator()).getCustomerServices();
      if (customerServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerServices != null)
      ((javax.xml.rpc.Stub)customerServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public goair.wsdl.CustomerServices getCustomerServices() {
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    customerServices.main(args);
  }
  
  public goair.model.flight.Flight[] searchFlights(goair.util.SearchParametersForFlights searchFlightParam) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.searchFlights(searchFlightParam);
  }
  
  public goair.model.customer.Customer customerLogin(java.lang.String emailId, java.lang.String password) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.customerLogin(emailId, password);
  }
  
  public goair.model.reservation.Reservation[] viewAllReservations(goair.util.SearchParametersForReservation searchParam) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.viewAllReservations(searchParam);
  }
  
  public int addReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.addReservation(reservation);
  }
  
  public int cancelReservation(goair.model.reservation.Reservation reservation) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.cancelReservation(reservation);
  }
  
  public int editCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.editCustomer(customer);
  }
  
  public int addCustomer(goair.model.customer.Customer customer) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.addCustomer(customer);
  }
  
  public int createReservation(goair.model.customer.Customer customer, goair.model.flight.Flight flight) throws java.rmi.RemoteException{
    if (customerServices == null)
      _initCustomerServicesProxy();
    return customerServices.createReservation(customer, flight);
  }
  
  
}