package goair.wsdl;

public class AirlineServicesProxy implements goair.wsdl.AirlineServices {
  private String _endpoint = null;
  private goair.wsdl.AirlineServices airlineServices = null;
  
  public AirlineServicesProxy() {
    _initAirlineServicesProxy();
  }
  
  public AirlineServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initAirlineServicesProxy();
  }
  
  private void _initAirlineServicesProxy() {
    try {
      airlineServices = (new goair.wsdl.AirlineServicesServiceLocator()).getAirlineServices();
      if (airlineServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)airlineServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)airlineServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (airlineServices != null)
      ((javax.xml.rpc.Stub)airlineServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public goair.wsdl.AirlineServices getAirlineServices() {
    if (airlineServices == null)
      _initAirlineServicesProxy();
    return airlineServices;
  }
  
  public int cancelReservation(goair.model.reservation.Reservation booking) throws java.rmi.RemoteException{
    if (airlineServices == null)
      _initAirlineServicesProxy();
    return airlineServices.cancelReservation(booking);
  }
  
  public int createReservation(goair.model.customer.Customer customer, goair.model.flight.Flight flight) throws java.rmi.RemoteException{
    if (airlineServices == null)
      _initAirlineServicesProxy();
    return airlineServices.createReservation(customer, flight);
  }
  
  
}