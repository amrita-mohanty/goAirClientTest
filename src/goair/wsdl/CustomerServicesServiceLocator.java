/**
 * CustomerServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public class CustomerServicesServiceLocator extends org.apache.axis.client.Service implements goair.wsdl.CustomerServicesService {

    public CustomerServicesServiceLocator() {
    }


    public CustomerServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerServices
    private java.lang.String CustomerServices_address = "http://localhost:8080/goAir1/services/CustomerServices";

    public java.lang.String getCustomerServicesAddress() {
        return CustomerServices_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerServicesWSDDServiceName = "CustomerServices";

    public java.lang.String getCustomerServicesWSDDServiceName() {
        return CustomerServicesWSDDServiceName;
    }

    public void setCustomerServicesWSDDServiceName(java.lang.String name) {
        CustomerServicesWSDDServiceName = name;
    }

    public goair.wsdl.CustomerServices getCustomerServices() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerServices_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerServices(endpoint);
    }

    public goair.wsdl.CustomerServices getCustomerServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            goair.wsdl.CustomerServicesSoapBindingStub _stub = new goair.wsdl.CustomerServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomerServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerServicesEndpointAddress(java.lang.String address) {
        CustomerServices_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (goair.wsdl.CustomerServices.class.isAssignableFrom(serviceEndpointInterface)) {
                goair.wsdl.CustomerServicesSoapBindingStub _stub = new goair.wsdl.CustomerServicesSoapBindingStub(new java.net.URL(CustomerServices_address), this);
                _stub.setPortName(getCustomerServicesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerServices".equals(inputPortName)) {
            return getCustomerServices();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wsdl.goair", "CustomerServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wsdl.goair", "CustomerServices"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerServices".equals(portName)) {
            setCustomerServicesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
