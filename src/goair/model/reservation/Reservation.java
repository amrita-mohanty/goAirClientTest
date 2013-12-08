/**
 * Reservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.model.reservation;

public class Reservation  implements java.io.Serializable {
    private java.lang.String airlineName;

    private java.lang.String creditCardNumber;

    private java.lang.String currentStatus;

    private java.lang.String customerFirstName;

    private int customerId;

    private java.lang.String customerLastName;

    private java.util.Calendar dateOfBooking;

    private java.util.Calendar dateOfFlying;

    private java.util.Calendar departureTime;

    private java.lang.String destination;

    private int flightId;

    private java.lang.String flightName;

    private int numberOfSeatsBooked;

    private long pnr;

    private java.lang.String source;

    private double totalPrice;

    public Reservation() {
    }

    public Reservation(
           java.lang.String airlineName,
           java.lang.String creditCardNumber,
           java.lang.String currentStatus,
           java.lang.String customerFirstName,
           int customerId,
           java.lang.String customerLastName,
           java.util.Calendar dateOfBooking,
           java.util.Calendar dateOfFlying,
           java.util.Calendar departureTime,
           java.lang.String destination,
           int flightId,
           java.lang.String flightName,
           int numberOfSeatsBooked,
           long pnr,
           java.lang.String source,
           double totalPrice) {
           this.airlineName = airlineName;
           this.creditCardNumber = creditCardNumber;
           this.currentStatus = currentStatus;
           this.customerFirstName = customerFirstName;
           this.customerId = customerId;
           this.customerLastName = customerLastName;
           this.dateOfBooking = dateOfBooking;
           this.dateOfFlying = dateOfFlying;
           this.departureTime = departureTime;
           this.destination = destination;
           this.flightId = flightId;
           this.flightName = flightName;
           this.numberOfSeatsBooked = numberOfSeatsBooked;
           this.pnr = pnr;
           this.source = source;
           this.totalPrice = totalPrice;
    }


    /**
     * Gets the airlineName value for this Reservation.
     * 
     * @return airlineName
     */
    public java.lang.String getAirlineName() {
        return airlineName;
    }


    /**
     * Sets the airlineName value for this Reservation.
     * 
     * @param airlineName
     */
    public void setAirlineName(java.lang.String airlineName) {
        this.airlineName = airlineName;
    }


    /**
     * Gets the creditCardNumber value for this Reservation.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this Reservation.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the currentStatus value for this Reservation.
     * 
     * @return currentStatus
     */
    public java.lang.String getCurrentStatus() {
        return currentStatus;
    }


    /**
     * Sets the currentStatus value for this Reservation.
     * 
     * @param currentStatus
     */
    public void setCurrentStatus(java.lang.String currentStatus) {
        this.currentStatus = currentStatus;
    }


    /**
     * Gets the customerFirstName value for this Reservation.
     * 
     * @return customerFirstName
     */
    public java.lang.String getCustomerFirstName() {
        return customerFirstName;
    }


    /**
     * Sets the customerFirstName value for this Reservation.
     * 
     * @param customerFirstName
     */
    public void setCustomerFirstName(java.lang.String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }


    /**
     * Gets the customerId value for this Reservation.
     * 
     * @return customerId
     */
    public int getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Reservation.
     * 
     * @param customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerLastName value for this Reservation.
     * 
     * @return customerLastName
     */
    public java.lang.String getCustomerLastName() {
        return customerLastName;
    }


    /**
     * Sets the customerLastName value for this Reservation.
     * 
     * @param customerLastName
     */
    public void setCustomerLastName(java.lang.String customerLastName) {
        this.customerLastName = customerLastName;
    }


    /**
     * Gets the dateOfBooking value for this Reservation.
     * 
     * @return dateOfBooking
     */
    public java.util.Calendar getDateOfBooking() {
        return dateOfBooking;
    }


    /**
     * Sets the dateOfBooking value for this Reservation.
     * 
     * @param dateOfBooking
     */
    public void setDateOfBooking(java.util.Calendar dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }


    /**
     * Gets the dateOfFlying value for this Reservation.
     * 
     * @return dateOfFlying
     */
    public java.util.Calendar getDateOfFlying() {
        return dateOfFlying;
    }


    /**
     * Sets the dateOfFlying value for this Reservation.
     * 
     * @param dateOfFlying
     */
    public void setDateOfFlying(java.util.Calendar dateOfFlying) {
        this.dateOfFlying = dateOfFlying;
    }


    /**
     * Gets the departureTime value for this Reservation.
     * 
     * @return departureTime
     */
    public java.util.Calendar getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this Reservation.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.util.Calendar departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the destination value for this Reservation.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this Reservation.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the flightId value for this Reservation.
     * 
     * @return flightId
     */
    public int getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this Reservation.
     * 
     * @param flightId
     */
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the flightName value for this Reservation.
     * 
     * @return flightName
     */
    public java.lang.String getFlightName() {
        return flightName;
    }


    /**
     * Sets the flightName value for this Reservation.
     * 
     * @param flightName
     */
    public void setFlightName(java.lang.String flightName) {
        this.flightName = flightName;
    }


    /**
     * Gets the numberOfSeatsBooked value for this Reservation.
     * 
     * @return numberOfSeatsBooked
     */
    public int getNumberOfSeatsBooked() {
        return numberOfSeatsBooked;
    }


    /**
     * Sets the numberOfSeatsBooked value for this Reservation.
     * 
     * @param numberOfSeatsBooked
     */
    public void setNumberOfSeatsBooked(int numberOfSeatsBooked) {
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }


    /**
     * Gets the pnr value for this Reservation.
     * 
     * @return pnr
     */
    public long getPnr() {
        return pnr;
    }


    /**
     * Sets the pnr value for this Reservation.
     * 
     * @param pnr
     */
    public void setPnr(long pnr) {
        this.pnr = pnr;
    }


    /**
     * Gets the source value for this Reservation.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Reservation.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the totalPrice value for this Reservation.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this Reservation.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reservation)) return false;
        Reservation other = (Reservation) obj;
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
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.currentStatus==null && other.getCurrentStatus()==null) || 
             (this.currentStatus!=null &&
              this.currentStatus.equals(other.getCurrentStatus()))) &&
            ((this.customerFirstName==null && other.getCustomerFirstName()==null) || 
             (this.customerFirstName!=null &&
              this.customerFirstName.equals(other.getCustomerFirstName()))) &&
            this.customerId == other.getCustomerId() &&
            ((this.customerLastName==null && other.getCustomerLastName()==null) || 
             (this.customerLastName!=null &&
              this.customerLastName.equals(other.getCustomerLastName()))) &&
            ((this.dateOfBooking==null && other.getDateOfBooking()==null) || 
             (this.dateOfBooking!=null &&
              this.dateOfBooking.equals(other.getDateOfBooking()))) &&
            ((this.dateOfFlying==null && other.getDateOfFlying()==null) || 
             (this.dateOfFlying!=null &&
              this.dateOfFlying.equals(other.getDateOfFlying()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.flightId == other.getFlightId() &&
            ((this.flightName==null && other.getFlightName()==null) || 
             (this.flightName!=null &&
              this.flightName.equals(other.getFlightName()))) &&
            this.numberOfSeatsBooked == other.getNumberOfSeatsBooked() &&
            this.pnr == other.getPnr() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.totalPrice == other.getTotalPrice();
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
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getCurrentStatus() != null) {
            _hashCode += getCurrentStatus().hashCode();
        }
        if (getCustomerFirstName() != null) {
            _hashCode += getCustomerFirstName().hashCode();
        }
        _hashCode += getCustomerId();
        if (getCustomerLastName() != null) {
            _hashCode += getCustomerLastName().hashCode();
        }
        if (getDateOfBooking() != null) {
            _hashCode += getDateOfBooking().hashCode();
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
        _hashCode += getFlightId();
        if (getFlightName() != null) {
            _hashCode += getFlightName().hashCode();
        }
        _hashCode += getNumberOfSeatsBooked();
        _hashCode += new Long(getPnr()).hashCode();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += new Double(getTotalPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reservation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://reservation.model.goair", "Reservation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "airlineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "creditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "currentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "customerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "customerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBooking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "dateOfBooking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfFlying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "dateOfFlying"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "flightName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfSeatsBooked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "numberOfSeatsBooked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "pnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
