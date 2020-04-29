//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 03:04:02 PM EST 
//


package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pen" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}topPen" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}leftPen" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bottomPen" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rightPen" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="border">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="padding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="topBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="topBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="leftBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="leftBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leftPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="bottomBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bottomBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bottomPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="rightBorder">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Thin"/>
 *             &lt;enumeration value="1Point"/>
 *             &lt;enumeration value="2Point"/>
 *             &lt;enumeration value="4Point"/>
 *             &lt;enumeration value="Dotted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rightBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rightPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pen",
    "topPen",
    "leftPen",
    "bottomPen",
    "rightPen"
})
@XmlRootElement(name = "box")
public class Box {

    protected Pen pen;
    protected TopPen topPen;
    protected LeftPen leftPen;
    protected BottomPen bottomPen;
    protected RightPen rightPen;
    @XmlAttribute(name = "border")
    protected String border;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "padding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String padding;
    @XmlAttribute(name = "topBorder")
    protected String topBorder;
    @XmlAttribute(name = "topBorderColor")
    protected String topBorderColor;
    @XmlAttribute(name = "topPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String topPadding;
    @XmlAttribute(name = "leftBorder")
    protected String leftBorder;
    @XmlAttribute(name = "leftBorderColor")
    protected String leftBorderColor;
    @XmlAttribute(name = "leftPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftPadding;
    @XmlAttribute(name = "bottomBorder")
    protected String bottomBorder;
    @XmlAttribute(name = "bottomBorderColor")
    protected String bottomBorderColor;
    @XmlAttribute(name = "bottomPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bottomPadding;
    @XmlAttribute(name = "rightBorder")
    protected String rightBorder;
    @XmlAttribute(name = "rightBorderColor")
    protected String rightBorderColor;
    @XmlAttribute(name = "rightPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightPadding;

    /**
     * Gets the value of the pen property.
     * 
     * @return
     *     possible object is
     *     {@link Pen }
     *     
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Sets the value of the pen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pen }
     *     
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * Gets the value of the topPen property.
     * 
     * @return
     *     possible object is
     *     {@link TopPen }
     *     
     */
    public TopPen getTopPen() {
        return topPen;
    }

    /**
     * Sets the value of the topPen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopPen }
     *     
     */
    public void setTopPen(TopPen value) {
        this.topPen = value;
    }

    /**
     * Gets the value of the leftPen property.
     * 
     * @return
     *     possible object is
     *     {@link LeftPen }
     *     
     */
    public LeftPen getLeftPen() {
        return leftPen;
    }

    /**
     * Sets the value of the leftPen property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeftPen }
     *     
     */
    public void setLeftPen(LeftPen value) {
        this.leftPen = value;
    }

    /**
     * Gets the value of the bottomPen property.
     * 
     * @return
     *     possible object is
     *     {@link BottomPen }
     *     
     */
    public BottomPen getBottomPen() {
        return bottomPen;
    }

    /**
     * Sets the value of the bottomPen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BottomPen }
     *     
     */
    public void setBottomPen(BottomPen value) {
        this.bottomPen = value;
    }

    /**
     * Gets the value of the rightPen property.
     * 
     * @return
     *     possible object is
     *     {@link RightPen }
     *     
     */
    public RightPen getRightPen() {
        return rightPen;
    }

    /**
     * Sets the value of the rightPen property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightPen }
     *     
     */
    public void setRightPen(RightPen value) {
        this.rightPen = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the topBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopBorder() {
        return topBorder;
    }

    /**
     * Sets the value of the topBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopBorder(String value) {
        this.topBorder = value;
    }

    /**
     * Gets the value of the topBorderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopBorderColor() {
        return topBorderColor;
    }

    /**
     * Sets the value of the topBorderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopBorderColor(String value) {
        this.topBorderColor = value;
    }

    /**
     * Gets the value of the topPadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopPadding() {
        return topPadding;
    }

    /**
     * Sets the value of the topPadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopPadding(String value) {
        this.topPadding = value;
    }

    /**
     * Gets the value of the leftBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftBorder() {
        return leftBorder;
    }

    /**
     * Sets the value of the leftBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftBorder(String value) {
        this.leftBorder = value;
    }

    /**
     * Gets the value of the leftBorderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftBorderColor() {
        return leftBorderColor;
    }

    /**
     * Sets the value of the leftBorderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftBorderColor(String value) {
        this.leftBorderColor = value;
    }

    /**
     * Gets the value of the leftPadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftPadding() {
        return leftPadding;
    }

    /**
     * Sets the value of the leftPadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftPadding(String value) {
        this.leftPadding = value;
    }

    /**
     * Gets the value of the bottomBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomBorder() {
        return bottomBorder;
    }

    /**
     * Sets the value of the bottomBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomBorder(String value) {
        this.bottomBorder = value;
    }

    /**
     * Gets the value of the bottomBorderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomBorderColor() {
        return bottomBorderColor;
    }

    /**
     * Sets the value of the bottomBorderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomBorderColor(String value) {
        this.bottomBorderColor = value;
    }

    /**
     * Gets the value of the bottomPadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomPadding() {
        return bottomPadding;
    }

    /**
     * Sets the value of the bottomPadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomPadding(String value) {
        this.bottomPadding = value;
    }

    /**
     * Gets the value of the rightBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightBorder() {
        return rightBorder;
    }

    /**
     * Sets the value of the rightBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightBorder(String value) {
        this.rightBorder = value;
    }

    /**
     * Gets the value of the rightBorderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightBorderColor() {
        return rightBorderColor;
    }

    /**
     * Sets the value of the rightBorderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightBorderColor(String value) {
        this.rightBorderColor = value;
    }

    /**
     * Gets the value of the rightPadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightPadding() {
        return rightPadding;
    }

    /**
     * Sets the value of the rightPadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightPadding(String value) {
        this.rightPadding = value;
    }

}
