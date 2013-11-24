/**
 * Reservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.model.reservation;

import java.text.SimpleDateFormat;

public class Reservation  implements java.io.Serializable {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
//    @Override
//	public String toString() {
//		return "Reservation [creditCardNumber="
//				+ creditCardNumber + ", currentStatus=" + currentStatus
//				+ ", customer=" + customerDetails 
//				+ ", dateOfBooking=" + dateOfBooking != null ? dateFormat.format(dateOfBooking.getTime()) : null 
//				+ ", dateOfFlying=" + dateOfFlying != null ? dateFormat.format(dateOfFlying.getTime()) : null
//				+ ", flight=" + flightDetails.toString() + ", numberOfSeatsBooked="
//				+ numberOfSeatsBooked + ", pnr=" + pnr + ", totalPrice="
//				+ totalPrice + "]";
//	}
    
    private long creditCardNumber;

    private java.lang.String currentStatus;

    private goair.model.customer.Customer customerDetails;

    private java.util.Calendar dateOfBooking;

    private java.util.Calendar dateOfFlying;

    private goair.model.flight.Flight flightDetails;

    private int numberOfSeatsBooked;

    private long pnr;

    private double totalPrice;

    public Reservation() {
    }

    public Reservation(
           long creditCardNumber,
           java.lang.String currentStatus,
           goair.model.customer.Customer customerDetails,
           java.util.Calendar dateOfBooking,
           java.util.Calendar dateOfFlying,
           goair.model.flight.Flight flightDetails,
           int numberOfSeatsBooked,
           long pnr,
           double totalPrice) {
           this.creditCardNumber = creditCardNumber;
           this.currentStatus = currentStatus;
           this.customerDetails = customerDetails;
           this.dateOfBooking = dateOfBooking;
           this.dateOfFlying = dateOfFlying;
           this.flightDetails = flightDetails;
           this.numberOfSeatsBooked = numberOfSeatsBooked;
           this.pnr = pnr;
           this.totalPrice = totalPrice;
    }


    /**
     * Gets the creditCardNumber value for this Reservation.
     * 
     * @return creditCardNumber
     */
    public long getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this Reservation.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(long creditCardNumber) {
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
     * Gets the customerDetails value for this Reservation.
     * 
     * @return customerDetails
     */
    public goair.model.customer.Customer getCustomerDetails() {
        return customerDetails;
    }


    /**
     * Sets the customerDetails value for this Reservation.
     * 
     * @param customerDetails
     */
    public void setCustomerDetails(goair.model.customer.Customer customerDetails) {
        this.customerDetails = customerDetails;
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
     * Gets the flightDetails value for this Reservation.
     * 
     * @return flightDetails
     */
    public goair.model.flight.Flight getFlightDetails() {
        return flightDetails;
    }


    /**
     * Sets the flightDetails value for this Reservation.
     * 
     * @param flightDetails
     */
    public void setFlightDetails(goair.model.flight.Flight flightDetails) {
        this.flightDetails = flightDetails;
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
            this.creditCardNumber == other.getCreditCardNumber() &&
            ((this.currentStatus==null && other.getCurrentStatus()==null) || 
             (this.currentStatus!=null &&
              this.currentStatus.equals(other.getCurrentStatus()))) &&
            ((this.customerDetails==null && other.getCustomerDetails()==null) || 
             (this.customerDetails!=null &&
              this.customerDetails.equals(other.getCustomerDetails()))) &&
            ((this.dateOfBooking==null && other.getDateOfBooking()==null) || 
             (this.dateOfBooking!=null &&
              this.dateOfBooking.equals(other.getDateOfBooking()))) &&
            ((this.dateOfFlying==null && other.getDateOfFlying()==null) || 
             (this.dateOfFlying!=null &&
              this.dateOfFlying.equals(other.getDateOfFlying()))) &&
            ((this.flightDetails==null && other.getFlightDetails()==null) || 
             (this.flightDetails!=null &&
              this.flightDetails.equals(other.getFlightDetails()))) &&
            this.numberOfSeatsBooked == other.getNumberOfSeatsBooked() &&
            this.pnr == other.getPnr() &&
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
        _hashCode += new Long(getCreditCardNumber()).hashCode();
        if (getCurrentStatus() != null) {
            _hashCode += getCurrentStatus().hashCode();
        }
        if (getCustomerDetails() != null) {
            _hashCode += getCustomerDetails().hashCode();
        }
        if (getDateOfBooking() != null) {
            _hashCode += getDateOfBooking().hashCode();
        }
        if (getDateOfFlying() != null) {
            _hashCode += getDateOfFlying().hashCode();
        }
        if (getFlightDetails() != null) {
            _hashCode += getFlightDetails().hashCode();
        }
        _hashCode += getNumberOfSeatsBooked();
        _hashCode += new Long(getPnr()).hashCode();
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
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "creditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "currentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "customerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://customer.model.goair", "Customer"));
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
        elemField.setFieldName("flightDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reservation.model.goair", "flightDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flight.model.goair", "Flight"));
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
