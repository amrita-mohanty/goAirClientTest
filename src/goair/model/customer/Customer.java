/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.model.customer;

public class Customer  extends goair.model.general.Person  implements java.io.Serializable {
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", nationality="
				+ nationality + ", passportNum=" + passportNum + "]";
	}
	
    private int customerId;

    private java.lang.String nationality;

    private java.lang.String passportNum;

    public Customer() {
    }

    public Customer(
           java.lang.String address,
           java.lang.String city,
           java.lang.String currentStatus,
           java.util.Calendar dob,
           java.lang.String emailId,
           java.lang.String firstName,
           java.lang.String gender,
           java.lang.String lastName,
           java.lang.String password,
           java.lang.String state,
           java.lang.String zipcode,
           int customerId,
           java.lang.String nationality,
           java.lang.String passportNum) {
        super(
            address,
            city,
            currentStatus,
            dob,
            emailId,
            firstName,
            gender,
            lastName,
            password,
            state,
            zipcode);
        this.customerId = customerId;
        this.nationality = nationality;
        this.passportNum = passportNum;
    }


    /**
     * Gets the customerId value for this Customer.
     * 
     * @return customerId
     */
    public int getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Customer.
     * 
     * @param customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the nationality value for this Customer.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this Customer.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the passportNum value for this Customer.
     * 
     * @return passportNum
     */
    public java.lang.String getPassportNum() {
        return passportNum;
    }


    /**
     * Sets the passportNum value for this Customer.
     * 
     * @param passportNum
     */
    public void setPassportNum(java.lang.String passportNum) {
        this.passportNum = passportNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.customerId == other.getCustomerId() &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.passportNum==null && other.getPassportNum()==null) || 
             (this.passportNum!=null &&
              this.passportNum.equals(other.getPassportNum())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getCustomerId();
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getPassportNum() != null) {
            _hashCode += getPassportNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://customer.model.goair", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://customer.model.goair", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://customer.model.goair", "nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://customer.model.goair", "passportNum"));
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
