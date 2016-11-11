//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.06 at 03:19:28 PM KST 
//


package com.netmng.websvc.soap.svc.services.description;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ogf.schemas.nsi._2013._07.services.description package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceDescription_QNAME = new QName("http://schemas.ogf.org/nsi/2013/07/services/description", "serviceDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ogf.schemas.nsi._2013._07.services.description
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceDescriptionType }
     * 
     */
    public ServiceDescriptionType createServiceDescriptionType() {
        return new ServiceDescriptionType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link SchemaType }
     * 
     */
    public SchemaType createSchemaType() {
        return new SchemaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ogf.org/nsi/2013/07/services/description", name = "serviceDescription")
    public JAXBElement<ServiceDescriptionType> createServiceDescription(ServiceDescriptionType value) {
        return new JAXBElement<ServiceDescriptionType>(_ServiceDescription_QNAME, ServiceDescriptionType.class, null, value);
    }

}