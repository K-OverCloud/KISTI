
package com.netmng.websvc.soap.param.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type contains the common reservation elements and detailed
 *                 path data for "Recursive" query results.
 *                 
 *                 Elements:
 *                 
 *                 connectionId - The Provider NSA assigned connectionId for this
 *                 reservation. This value will be unique within the context
 *                 of the Provider NSA.
 *                 
 *                 globalReservationId - An optional global reservation id that can be
 *                 used to correlate individual related service reservations through
 *                 the network. This must be populated with a Universally Unique
 *                 Identifier (UUID) URN as per ITU-T Rec. X.667 | ISO/IEC 9834-8:2005
 *                 and IETF RFC 4122.
 *                 
 *                 description - An optional description for the service reservation.
 *                 
 *                 criteria - A set of versioned reservation criteria information.
 * 
 *                 requesterNSA - The requester NSA associated with the reservation.
 * 
 *                 connectionStates - The reservation's overall connection states.
 *                 
 *                 notificationId - If present represents the notification identifier
 *                 of the most recent error notification against this reservation.
 *                 The notificationId can be used in the queryNotification operation
 *                 to retrieve the associated notification.
 *             
 * 
 * <p>QueryRecursiveResultType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="QueryRecursiveResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionId" type="{http://schemas.ogf.org/nsi/2013/07/framework/types}ConnectionIdType"/>
 *         &lt;element name="globalReservationId" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}GlobalReservationIdType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}QueryRecursiveResultCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requesterNSA" type="{http://schemas.ogf.org/nsi/2013/07/framework/types}NsaIdType"/>
 *         &lt;element name="connectionStates" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}ConnectionStatesType"/>
 *         &lt;element name="notificationId" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}NotificationIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRecursiveResultType", propOrder = {
    "connectionId",
    "globalReservationId",
    "description",
    "criteria",
    "requesterNSA",
    "connectionStates",
    "notificationId"
})
public class QueryRecursiveResultType {

    @XmlElement(required = true)
    protected String connectionId;
    protected String globalReservationId;
    protected String description;
    protected List<QueryRecursiveResultCriteriaType> criteria;
    @XmlElement(required = true)
    protected String requesterNSA;
    @XmlElement(required = true)
    protected ConnectionStatesType connectionStates;
    protected Integer notificationId;

    /**
     * connectionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * connectionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * globalReservationId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalReservationId() {
        return globalReservationId;
    }

    /**
     * globalReservationId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalReservationId(String value) {
        this.globalReservationId = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryRecursiveResultCriteriaType }
     * 
     * 
     */
    public List<QueryRecursiveResultCriteriaType> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<QueryRecursiveResultCriteriaType>();
        }
        return this.criteria;
    }

    /**
     * requesterNSA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterNSA() {
        return requesterNSA;
    }

    /**
     * requesterNSA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterNSA(String value) {
        this.requesterNSA = value;
    }

    /**
     * connectionStates 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionStatesType }
     *     
     */
    public ConnectionStatesType getConnectionStates() {
        return connectionStates;
    }

    /**
     * connectionStates 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionStatesType }
     *     
     */
    public void setConnectionStates(ConnectionStatesType value) {
        this.connectionStates = value;
    }

    /**
     * notificationId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotificationId() {
        return notificationId;
    }

    /**
     * notificationId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotificationId(Integer value) {
        this.notificationId = value;
    }

}
