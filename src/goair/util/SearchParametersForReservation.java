/**
 * SearchParametersForReservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.util;

public class SearchParametersForReservation  implements java.io.Serializable {
    private long pnr;

    private long flightId;

    private java.util.Calendar dateOfFlying;

    public SearchParametersForReservation() {
    }

    public SearchParametersForReservation(
           long pnr,
           long flightId,
           java.util.Calendar dateOfFlying) {
           this.pnr = pnr;
           this.flightId = flightId;
           this.dateOfFlying = dateOfFlying;
    }


    /**
     * Gets the pnr value for this SearchParametersForReservation.
     * 
     * @return pnr
     */
    public long getPnr() {
        return pnr;
    }


    /**
     * Sets the pnr value for this SearchParametersForReservation.
     * 
     * @param pnr
     */
    public void setPnr(long pnr) {
        this.pnr = pnr;
    }


    /**
     * Gets the flightId value for this SearchParametersForReservation.
     * 
     * @return flightId
     */
    public long getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this SearchParametersForReservation.
     * 
     * @param flightId
     */
    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the dateOfFlying value for this SearchParametersForReservation.
     * 
     * @return dateOfFlying
     */
    public java.util.Calendar getDateOfFlying() {
        return dateOfFlying;
    }


    /**
     * Sets the dateOfFlying value for this SearchParametersForReservation.
     * 
     * @param dateOfFlying
     */
    public void setDateOfFlying(java.util.Calendar dateOfFlying) {
        this.dateOfFlying = dateOfFlying;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchParametersForReservation)) return false;
        SearchParametersForReservation other = (SearchParametersForReservation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pnr == other.getPnr() &&
            this.flightId == other.getFlightId() &&
            ((this.dateOfFlying==null && other.getDateOfFlying()==null) || 
             (this.dateOfFlying!=null &&
              this.dateOfFlying.equals(other.getDateOfFlying())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getPnr()).hashCode();
        _hashCode += new Long(getFlightId()).hashCode();
        if (getDateOfFlying() != null) {
            _hashCode += getDateOfFlying().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchParametersForReservation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://util.goair", "SearchParametersForReservation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "pnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfFlying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "dateOfFlying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
