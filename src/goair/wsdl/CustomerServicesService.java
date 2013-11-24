/**
 * CustomerServicesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.wsdl;

public interface CustomerServicesService extends javax.xml.rpc.Service {
    public java.lang.String getCustomerServicesAddress();

    public goair.wsdl.CustomerServices getCustomerServices() throws javax.xml.rpc.ServiceException;

    public goair.wsdl.CustomerServices getCustomerServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
