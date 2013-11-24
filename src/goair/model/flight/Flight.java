/**
 * Flight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package goair.model.flight;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Flight  implements java.io.Serializable {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat dateFormatTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
    @Override
	public String toString() {
		return "Flight [airlineName="
				+ airlineName + ", arrivalTime=" + dateFormatTime.format(arrivalTime.getTime())
				+ ", crewDetails=" + Arrays.toString(crewDetails)
				+ ", currentStatus=" + currentStatus + ", daysOfWeek="
				+ daysOfWeek + ", departureTime=" + dateFormatTime.format(departureTime.getTime())
				+ ", destination=" + destination + ", flightId=" + flightId
				+ ", flightName=" + flightName + ", flightStatus="
				+ flightStatus + ", flyingEndDate=" + dateFormat.format(flyingEndDate.getTime())
				+ ", flyingStartDate=" + dateFormat.format(flyingStartDate.getTime()) 
				+ ", flyingDate=" + dateFormat.format(flyingDate.getTime())
				+ ", passengers="
				+ Arrays.toString(passengers) + ", seatsAvailable="
				+ seatsAvailable + ", seatsReserved=" + seatsReserved
				+ ", source=" + source + ", ticketPrice=" + ticketPrice
				+ ", totalSeats=" + totalSeats + "]";
	}
    
    private java.lang.String airlineName;

    private java.util.Calendar arrivalTime;

    private goair.model.employee.Employee[] crewDetails;

    private java.lang.String currentStatus;

    private java.lang.String daysOfWeek;

    private java.util.Calendar departureTime;

    private java.lang.String destination;

    private java.lang.Integer flightId;

    private java.lang.String flightName;

    private java.lang.String flightStatus;

    private java.util.Calendar flyingDate;

    private java.util.Calendar flyingEndDate;

    private java.util.Calendar flyingStartDate;

    private goair.model.customer.Customer[] passengers;

    private int seatsAvailable;

    private int seatsReserved;

    private java.lang.String source;

    private java.lang.Double ticketPrice;

    private int totalSeats;

    public Flight() {
    }

    public Flight(
           java.lang.String airlineName,
           java.util.Calendar arrivalTime,
           goair.model.employee.Employee[] crewDetails,
           java.lang.String currentStatus,
           java.lang.String daysOfWeek,
           java.util.Calendar departureTime,
           java.lang.String destination,
           java.lang.Integer flightId,
           java.lang.String flightName,
           java.lang.String flightStatus,
           java.util.Calendar flyingDate,
           java.util.Calendar flyingEndDate,
           java.util.Calendar flyingStartDate,
           goair.model.customer.Customer[] passengers,
           int seatsAvailable,
           int seatsReserved,
           java.lang.String source,
           java.lang.Double ticketPrice,
           int totalSeats) {
           this.airlineName = airlineName;
           this.arrivalTime = arrivalTime;
           this.crewDetails = crewDetails;
           this.currentStatus = currentStatus;
           this.daysOfWeek = daysOfWeek;
           this.departureTime = departureTime;
           this.destination = destination;
           this.flightId = flightId;
           this.flightName = flightName;
           this.flightStatus = flightStatus;
           this.flyingDate = flyingDate;
           this.flyingEndDate = flyingEndDate;
           this.flyingStartDate = flyingStartDate;
           this.passengers = passengers;
           this.seatsAvailable = seatsAvailable;
           this.seatsReserved = seatsReserved;
           this.source = source;
           this.ticketPrice = ticketPrice;
           this.totalSeats = totalSeats;
    }


    /**
     * Gets the airlineName value for this Flight.
     * 
     * @return airlineName
     */
    public java.lang.String getAirlineName() {
        return airlineName;
    }


    /**
     * Sets the airlineName value for this Flight.
     * 
     * @param airlineName
     */
    public void setAirlineName(java.lang.String airlineName) {
        this.airlineName = airlineName;
    }


    /**
     * Gets the arrivalTime value for this Flight.
     * 
     * @return arrivalTime
     */
    public java.util.Calendar getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this Flight.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.util.Calendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the crewDetails value for this Flight.
     * 
     * @return crewDetails
     */
    public goair.model.employee.Employee[] getCrewDetails() {
        return crewDetails;
    }


    /**
     * Sets the crewDetails value for this Flight.
     * 
     * @param crewDetails
     */
    public void setCrewDetails(goair.model.employee.Employee[] crewDetails) {
        this.crewDetails = crewDetails;
    }


    /**
     * Gets the currentStatus value for this Flight.
     * 
     * @return currentStatus
     */
    public java.lang.String getCurrentStatus() {
        return currentStatus;
    }


    /**
     * Sets the currentStatus value for this Flight.
     * 
     * @param currentStatus
     */
    public void setCurrentStatus(java.lang.String currentStatus) {
        this.currentStatus = currentStatus;
    }


    /**
     * Gets the daysOfWeek value for this Flight.
     * 
     * @return daysOfWeek
     */
    public java.lang.String getDaysOfWeek() {
        return daysOfWeek;
    }


    /**
     * Sets the daysOfWeek value for this Flight.
     * 
     * @param daysOfWeek
     */
    public void setDaysOfWeek(java.lang.String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }


    /**
     * Gets the departureTime value for this Flight.
     * 
     * @return departureTime
     */
    public java.util.Calendar getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this Flight.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.util.Calendar departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the destination value for this Flight.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this Flight.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the flightId value for this Flight.
     * 
     * @return flightId
     */
    public java.lang.Integer getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this Flight.
     * 
     * @param flightId
     */
    public void setFlightId(java.lang.Integer flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the flightName value for this Flight.
     * 
     * @return flightName
     */
    public java.lang.String getFlightName() {
        return flightName;
    }


    /**
     * Sets the flightName value for this Flight.
     * 
     * @param flightName
     */
    public void setFlightName(java.lang.String flightName) {
        this.flightName = flightName;
    }


    /**
     * Gets the flightStatus value for this Flight.
     * 
     * @return flightStatus
     */
    public java.lang.String getFlightStatus() {
        return flightStatus;
    }


    /**
     * Sets the flightStatus value for this Flight.
     * 
     * @param flightStatus
     */
    public void setFlightStatus(java.lang.String flightStatus) {
        this.flightStatus = flightStatus;
    }


    /**
     * Gets the flyingDate value for this Flight.
     * 
     * @return flyingDate
     */
    public java.util.Calendar getFlyingDate() {
        return flyingDate;
    }


    /**
     * Sets the flyingDate value for this Flight.
     * 
     * @param flyingDate
     */
    public void setFlyingDate(java.util.Calendar flyingDate) {
        this.flyingDate = flyingDate;
    }


    /**
     * Gets the flyingEndDate value for this Flight.
     * 
     * @return flyingEndDate
     */
    public java.util.Calendar getFlyingEndDate() {
        return flyingEndDate;
    }


    /**
     * Sets the flyingEndDate value for this Flight.
     * 
     * @param flyingEndDate
     */
    public void setFlyingEndDate(java.util.Calendar flyingEndDate) {
        this.flyingEndDate = flyingEndDate;
    }


    /**
     * Gets the flyingStartDate value for this Flight.
     * 
     * @return flyingStartDate
     */
    public java.util.Calendar getFlyingStartDate() {
        return flyingStartDate;
    }


    /**
     * Sets the flyingStartDate value for this Flight.
     * 
     * @param flyingStartDate
     */
    public void setFlyingStartDate(java.util.Calendar flyingStartDate) {
        this.flyingStartDate = flyingStartDate;
    }


    /**
     * Gets the passengers value for this Flight.
     * 
     * @return passengers
     */
    public goair.model.customer.Customer[] getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this Flight.
     * 
     * @param passengers
     */
    public void setPassengers(goair.model.customer.Customer[] passengers) {
        this.passengers = passengers;
    }


    /**
     * Gets the seatsAvailable value for this Flight.
     * 
     * @return seatsAvailable
     */
    public int getSeatsAvailable() {
        return seatsAvailable;
    }


    /**
     * Sets the seatsAvailable value for this Flight.
     * 
     * @param seatsAvailable
     */
    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }


    /**
     * Gets the seatsReserved value for this Flight.
     * 
     * @return seatsReserved
     */
    public int getSeatsReserved() {
        return seatsReserved;
    }


    /**
     * Sets the seatsReserved value for this Flight.
     * 
     * @param seatsReserved
     */
    public void setSeatsReserved(int seatsReserved) {
        this.seatsReserved = seatsReserved;
    }


    /**
     * Gets the source value for this Flight.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Flight.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the ticketPrice value for this Flight.
     * 
     * @return ticketPrice
     */
    public java.lang.Double getTicketPrice() {
        return ticketPrice;
    }


    /**
     * Sets the ticketPrice value for this Flight.
     * 
     * @param ticketPrice
     */
    public void setTicketPrice(java.lang.Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


    /**
     * Gets the totalSeats value for this Flight.
     * 
     * @return totalSeats
     */
    public int getTotalSeats() {
        return totalSeats;
    }


    /**
     * Sets the totalSeats value for this Flight.
     * 
     * @param totalSeats
     */
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Flight)) return false;
        Flight other = (Flight) obj;
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
            ((this.crewDetails==null && other.getCrewDetails()==null) || 
             (this.crewDetails!=null &&
              java.util.Arrays.equals(this.crewDetails, other.getCrewDetails()))) &&
            ((this.currentStatus==null && other.getCurrentStatus()==null) || 
             (this.currentStatus!=null &&
              this.currentStatus.equals(other.getCurrentStatus()))) &&
            ((this.daysOfWeek==null && other.getDaysOfWeek()==null) || 
             (this.daysOfWeek!=null &&
              this.daysOfWeek.equals(other.getDaysOfWeek()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.flightId==null && other.getFlightId()==null) || 
             (this.flightId!=null &&
              this.flightId.equals(other.getFlightId()))) &&
            ((this.flightName==null && other.getFlightName()==null) || 
             (this.flightName!=null &&
              this.flightName.equals(other.getFlightName()))) &&
            ((this.flightStatus==null && other.getFlightStatus()==null) || 
             (this.flightStatus!=null &&
              this.flightStatus.equals(other.getFlightStatus()))) &&
            ((this.flyingDate==null && other.getFlyingDate()==null) || 
             (this.flyingDate!=null &&
              this.flyingDate.equals(other.getFlyingDate()))) &&
            ((this.flyingEndDate==null && other.getFlyingEndDate()==null) || 
             (this.flyingEndDate!=null &&
              this.flyingEndDate.equals(other.getFlyingEndDate()))) &&
            ((this.flyingStartDate==null && other.getFlyingStartDate()==null) || 
             (this.flyingStartDate!=null &&
              this.flyingStartDate.equals(other.getFlyingStartDate()))) &&
            ((this.passengers==null && other.getPassengers()==null) || 
             (this.passengers!=null &&
              java.util.Arrays.equals(this.passengers, other.getPassengers()))) &&
            this.seatsAvailable == other.getSeatsAvailable() &&
            this.seatsReserved == other.getSeatsReserved() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.ticketPrice==null && other.getTicketPrice()==null) || 
             (this.ticketPrice!=null &&
              this.ticketPrice.equals(other.getTicketPrice()))) &&
            this.totalSeats == other.getTotalSeats();
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
        if (getCrewDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrewDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrewDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentStatus() != null) {
            _hashCode += getCurrentStatus().hashCode();
        }
        if (getDaysOfWeek() != null) {
            _hashCode += getDaysOfWeek().hashCode();
        }
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getFlightId() != null) {
            _hashCode += getFlightId().hashCode();
        }
        if (getFlightName() != null) {
            _hashCode += getFlightName().hashCode();
        }
        if (getFlightStatus() != null) {
            _hashCode += getFlightStatus().hashCode();
        }
        if (getFlyingDate() != null) {
            _hashCode += getFlyingDate().hashCode();
        }
        if (getFlyingEndDate() != null) {
            _hashCode += getFlyingEndDate().hashCode();
        }
        if (getFlyingStartDate() != null) {
            _hashCode += getFlyingStartDate().hashCode();
        }
        if (getPassengers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSeatsAvailable();
        _hashCode += getSeatsReserved();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTicketPrice() != null) {
            _hashCode += getTicketPrice().hashCode();
        }
        _hashCode += getTotalSeats();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Flight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flight.model.goair", "Flight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "airlineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crewDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "crewDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://employee.model.goair", "Employee"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://wsdl.goair", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "currentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "daysOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "flightName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "flightStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flyingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "flyingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flyingEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "flyingEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flyingStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "flyingStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://customer.model.goair", "Customer"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://wsdl.goair", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "seatsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatsReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "seatsReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "ticketPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flight.model.goair", "totalSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
