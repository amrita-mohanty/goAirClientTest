/**
 * SearchParametersForFlights.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.util;

public class SearchParametersForFlights  implements java.io.Serializable {
    private java.lang.String airlineName;

    private java.util.Calendar arrivalTime;

    private java.lang.Integer customerId;

    private java.util.Calendar dateOfFlying;

    private java.util.Calendar departureTime;

    private java.lang.String destination;

    private java.lang.Integer employeeId;

    private java.lang.Integer flightId;

    private java.lang.String flightName;

    private java.lang.Integer numberOfSeatsAvialable;

    private java.lang.String source;

    public SearchParametersForFlights() {
    }

    public SearchParametersForFlights(
           java.lang.String airlineName,
           java.util.Calendar arrivalTime,
           java.lang.Integer customerId,
           java.util.Calendar dateOfFlying,
           java.util.Calendar departureTime,
           java.lang.String destination,
           java.lang.Integer employeeId,
           java.lang.Integer flightId,
           java.lang.String flightName,
           java.lang.Integer numberOfSeatsAvialable,
           java.lang.String source) {
           this.airlineName = airlineName;
           this.arrivalTime = arrivalTime;
           this.customerId = customerId;
           this.dateOfFlying = dateOfFlying;
           this.departureTime = departureTime;
           this.destination = destination;
           this.employeeId = employeeId;
           this.flightId = flightId;
           this.flightName = flightName;
           this.numberOfSeatsAvialable = numberOfSeatsAvialable;
           this.source = source;
    }


    /**
     * Gets the airlineName value for this SearchParametersForFlights.
     * 
     * @return airlineName
     */
    public java.lang.String getAirlineName() {
        return airlineName;
    }


    /**
     * Sets the airlineName value for this SearchParametersForFlights.
     * 
     * @param airlineName
     */
    public void setAirlineName(java.lang.String airlineName) {
        this.airlineName = airlineName;
    }


    /**
     * Gets the arrivalTime value for this SearchParametersForFlights.
     * 
     * @return arrivalTime
     */
    public java.util.Calendar getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this SearchParametersForFlights.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.util.Calendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the customerId value for this SearchParametersForFlights.
     * 
     * @return customerId
     */
    public java.lang.Integer getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this SearchParametersForFlights.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the dateOfFlying value for this SearchParametersForFlights.
     * 
     * @return dateOfFlying
     */
    public java.util.Calendar getDateOfFlying() {
        return dateOfFlying;
    }


    /**
     * Sets the dateOfFlying value for this SearchParametersForFlights.
     * 
     * @param dateOfFlying
     */
    public void setDateOfFlying(java.util.Calendar dateOfFlying) {
        this.dateOfFlying = dateOfFlying;
    }


    /**
     * Gets the departureTime value for this SearchParametersForFlights.
     * 
     * @return departureTime
     */
    public java.util.Calendar getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this SearchParametersForFlights.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.util.Calendar departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the destination value for this SearchParametersForFlights.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this SearchParametersForFlights.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the employeeId value for this SearchParametersForFlights.
     * 
     * @return employeeId
     */
    public java.lang.Integer getEmployeeId() {
        return employeeId;
    }


    /**
     * Sets the employeeId value for this SearchParametersForFlights.
     * 
     * @param employeeId
     */
    public void setEmployeeId(java.lang.Integer employeeId) {
        this.employeeId = employeeId;
    }


    /**
     * Gets the flightId value for this SearchParametersForFlights.
     * 
     * @return flightId
     */
    public java.lang.Integer getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this SearchParametersForFlights.
     * 
     * @param flightId
     */
    public void setFlightId(java.lang.Integer flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the flightName value for this SearchParametersForFlights.
     * 
     * @return flightName
     */
    public java.lang.String getFlightName() {
        return flightName;
    }


    /**
     * Sets the flightName value for this SearchParametersForFlights.
     * 
     * @param flightName
     */
    public void setFlightName(java.lang.String flightName) {
        this.flightName = flightName;
    }


    /**
     * Gets the numberOfSeatsAvialable value for this SearchParametersForFlights.
     * 
     * @return numberOfSeatsAvialable
     */
    public java.lang.Integer getNumberOfSeatsAvialable() {
        return numberOfSeatsAvialable;
    }


    /**
     * Sets the numberOfSeatsAvialable value for this SearchParametersForFlights.
     * 
     * @param numberOfSeatsAvialable
     */
    public void setNumberOfSeatsAvialable(java.lang.Integer numberOfSeatsAvialable) {
        this.numberOfSeatsAvialable = numberOfSeatsAvialable;
    }


    /**
     * Gets the source value for this SearchParametersForFlights.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this SearchParametersForFlights.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchParametersForFlights)) return false;
        SearchParametersForFlights other = (SearchParametersForFlights) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineName==null && other.getAirlineName()==null) || 
             (this.airlineName!=null &&
              this.airlineName.equals(other.getAirlineName()))) &&
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.dateOfFlying==null && other.getDateOfFlying()==null) || 
             (this.dateOfFlying!=null &&
              this.dateOfFlying.equals(other.getDateOfFlying()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.employeeId==null && other.getEmployeeId()==null) || 
             (this.employeeId!=null &&
              this.employeeId.equals(other.getEmployeeId()))) &&
            ((this.flightId==null && other.getFlightId()==null) || 
             (this.flightId!=null &&
              this.flightId.equals(other.getFlightId()))) &&
            ((this.flightName==null && other.getFlightName()==null) || 
             (this.flightName!=null &&
              this.flightName.equals(other.getFlightName()))) &&
            ((this.numberOfSeatsAvialable==null && other.getNumberOfSeatsAvialable()==null) || 
             (this.numberOfSeatsAvialable!=null &&
              this.numberOfSeatsAvialable.equals(other.getNumberOfSeatsAvialable()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())));
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
        if (getAirlineName() != null) {
            _hashCode += getAirlineName().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getDateOfFlying() != null) {
            _hashCode += getDateOfFlying().hashCode();
        }
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getEmployeeId() != null) {
            _hashCode += getEmployeeId().hashCode();
        }
        if (getFlightId() != null) {
            _hashCode += getFlightId().hashCode();
        }
        if (getFlightName() != null) {
            _hashCode += getFlightName().hashCode();
        }
        if (getNumberOfSeatsAvialable() != null) {
            _hashCode += getNumberOfSeatsAvialable().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchParametersForFlights.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://util.goair", "SearchParametersForFlights"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "airlineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfFlying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "dateOfFlying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "employeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "flightName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfSeatsAvialable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "numberOfSeatsAvialable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.goair", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
