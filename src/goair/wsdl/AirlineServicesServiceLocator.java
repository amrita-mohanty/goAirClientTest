/**
 * AirlineServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public class AirlineServicesServiceLocator extends org.apache.axis.client.Service implements goair.wsdl.AirlineServicesService {

    public AirlineServicesServiceLocator() {
    }


    public AirlineServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AirlineServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AirlineServices
    private java.lang.String AirlineServices_address = "http://localhost:8080/goAir/services/AirlineServices";

    public java.lang.String getAirlineServicesAddress() {
        return AirlineServices_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AirlineServicesWSDDServiceName = "AirlineServices";

    public java.lang.String getAirlineServicesWSDDServiceName() {
        return AirlineServicesWSDDServiceName;
    }

    public void setAirlineServicesWSDDServiceName(java.lang.String name) {
        AirlineServicesWSDDServiceName = name;
    }

    public goair.wsdl.AirlineServices getAirlineServices() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AirlineServices_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAirlineServices(endpoint);
    }

    public goair.wsdl.AirlineServices getAirlineServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            goair.wsdl.AirlineServicesSoapBindingStub _stub = new goair.wsdl.AirlineServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getAirlineServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAirlineServicesEndpointAddress(java.lang.String address) {
        AirlineServices_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (goair.wsdl.AirlineServices.class.isAssignableFrom(serviceEndpointInterface)) {
                goair.wsdl.AirlineServicesSoapBindingStub _stub = new goair.wsdl.AirlineServicesSoapBindingStub(new java.net.URL(AirlineServices_address), this);
                _stub.setPortName(getAirlineServicesWSDDServiceName());
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
        if ("AirlineServices".equals(inputPortName)) {
            return getAirlineServices();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wsdl.goair", "AirlineServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wsdl.goair", "AirlineServices"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AirlineServices".equals(portName)) {
            setAirlineServicesEndpointAddress(address);
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
