
package com.netmng.websvc.soap.param.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A holder element containing a list of children NSA and their
 *                 associated connection information. 
 *                 
 *                 Elements:
 *                 
 *                 child - Summary path information for a child NSA.  Each child
 *                 element is ordered and contains a connection segment in the
 *                 overall path.
 *             
 * 
 * <p>ChildSummaryListType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ChildSummaryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="child" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}ChildSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildSummaryListType", propOrder = {
    "child"
})
public class ChildSummaryListType {

    protected List<ChildSummaryType> child;

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildSummaryType }
     * 
     * 
     */
    public List<ChildSummaryType> getChild() {
        if (child == null) {
            child = new ArrayList<ChildSummaryType>();
        }
        return this.child;
    }

}
