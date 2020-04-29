//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 03:04:02 PM EST 
//


package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parameterDescription" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}defaultValueExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" />
 *       &lt;attribute name="nestedType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isForPrompting" default="true">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property",
    "parameterDescription",
    "defaultValueExpression"
})
@XmlRootElement(name = "parameter")
public class Parameter {

    protected List<Property> property;
    protected ParameterDescription parameterDescription;
    protected DefaultValueExpression defaultValueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "nestedType")
    protected String nestedType;
    @XmlAttribute(name = "isForPrompting")
    protected String isForPrompting;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the parameterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterDescription }
     *     
     */
    public ParameterDescription getParameterDescription() {
        return parameterDescription;
    }

    /**
     * Sets the value of the parameterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterDescription }
     *     
     */
    public void setParameterDescription(ParameterDescription value) {
        this.parameterDescription = value;
    }

    /**
     * Gets the value of the defaultValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueExpression }
     *     
     */
    public DefaultValueExpression getDefaultValueExpression() {
        return defaultValueExpression;
    }

    /**
     * Sets the value of the defaultValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueExpression }
     *     
     */
    public void setDefaultValueExpression(DefaultValueExpression value) {
        this.defaultValueExpression = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        if (clazz == null) {
            return "java.lang.String";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the nestedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNestedType() {
        return nestedType;
    }

    /**
     * Sets the value of the nestedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNestedType(String value) {
        this.nestedType = value;
    }

    /**
     * Gets the value of the isForPrompting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsForPrompting() {
        if (isForPrompting == null) {
            return "true";
        } else {
            return isForPrompting;
        }
    }

    /**
     * Sets the value of the isForPrompting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsForPrompting(String value) {
        this.isForPrompting = value;
    }

}
