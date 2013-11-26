package goair.wsdl;

public class EmployeeServicesProxy implements goair.wsdl.EmployeeServices {
  private String _endpoint = null;
  private goair.wsdl.EmployeeServices employeeServices = null;
  
  public EmployeeServicesProxy() {
    _initEmployeeServicesProxy();
  }
  
  public EmployeeServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeServicesProxy();
  }
  
  private void _initEmployeeServicesProxy() {
    try {
      employeeServices = (new goair.wsdl.EmployeeServicesServiceLocator()).getEmployeeServices();
      if (employeeServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeServices != null)
      ((javax.xml.rpc.Stub)employeeServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public goair.wsdl.EmployeeServices getEmployeeServices() {
    if (employeeServices == null)
      _initEmployeeServicesProxy();
    return employeeServices;
  }
  
  public goair.model.employee.Employee employeeLogin(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, goair.Exception.AirlineException{
    if (employeeServices == null)
      _initEmployeeServicesProxy();
    return employeeServices.employeeLogin(userName, password);
  }
  
  public goair.model.flight.Flight[] viewEmployeeFlight(goair.util.SearchParametersForFlights searchFlightParam) throws java.rmi.RemoteException{
    if (employeeServices == null)
      _initEmployeeServicesProxy();
    return employeeServices.viewEmployeeFlight(searchFlightParam);
  }
  
  public int editEmployeeProfile(goair.model.employee.Employee employeeBean) throws java.rmi.RemoteException{
    if (employeeServices == null)
      _initEmployeeServicesProxy();
    return employeeServices.editEmployeeProfile(employeeBean);
  }
  
  
}