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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}paragraph" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}conditionalStyle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isDefault">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Opaque"/>
 *             &lt;enumeration value="Transparent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="forecolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pen">
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
 *       &lt;attribute name="fill">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Solid"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="scaleImage">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Clip"/>
 *             &lt;enumeration value="FillFrame"/>
 *             &lt;enumeration value="RetainShape"/>
 *             &lt;enumeration value="RealHeight"/>
 *             &lt;enumeration value="RealSize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Center"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="Justified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Top"/>
 *             &lt;enumeration value="Middle"/>
 *             &lt;enumeration value="Bottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
 *       &lt;attribute name="rotation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Left"/>
 *             &lt;enumeration value="Right"/>
 *             &lt;enumeration value="UpsideDown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="lineSpacing">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="1_1_2"/>
 *             &lt;enumeration value="Double"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isStyledText">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="markup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="isBold">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isItalic">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isUnderline">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isStrikeThrough">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfFontName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pdfEncoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isPdfEmbedded">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isBlankWhenNull">
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
    "box",
    "paragraph",
    "conditionalStyle"
})
@XmlRootElement(name = "style")
public class Style {

    protected Box box;
    protected Paragraph paragraph;
    protected List<ConditionalStyle> conditionalStyle;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "isDefault")
    protected String isDefault;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "forecolor")
    protected String forecolor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "pen")
    protected String pen;
    @XmlAttribute(name = "fill")
    protected String fill;
    @XmlAttribute(name = "radius")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String radius;
    @XmlAttribute(name = "scaleImage")
    protected String scaleImage;
    @XmlAttribute(name = "hAlign")
    protected String hAlign;
    @XmlAttribute(name = "vAlign")
    protected String vAlign;
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
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "isStyledText")
    protected String isStyledText;
    @XmlAttribute(name = "markup")
    protected String markup;
    @XmlAttribute(name = "fontName")
    protected String fontName;
    @XmlAttribute(name = "fontSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fontSize;
    @XmlAttribute(name = "isBold")
    protected String isBold;
    @XmlAttribute(name = "isItalic")
    protected String isItalic;
    @XmlAttribute(name = "isUnderline")
    protected String isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected String isStrikeThrough;
    @XmlAttribute(name = "pdfFontName")
    protected String pdfFontName;
    @XmlAttribute(name = "pdfEncoding")
    protected String pdfEncoding;
    @XmlAttribute(name = "isPdfEmbedded")
    protected String isPdfEmbedded;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "isBlankWhenNull")
    protected String isBlankWhenNull;

    /**
     * Gets the value of the box property.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Gets the value of the paragraph property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getParagraph() {
        return paragraph;
    }

    /**
     * Sets the value of the paragraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setParagraph(Paragraph value) {
        this.paragraph = value;
    }

    /**
     * Gets the value of the conditionalStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionalStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionalStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionalStyle }
     * 
     * 
     */
    public List<ConditionalStyle> getConditionalStyle() {
        if (conditionalStyle == null) {
            conditionalStyle = new ArrayList<ConditionalStyle>();
        }
        return this.conditionalStyle;
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
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the forecolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecolor() {
        return forecolor;
    }

    /**
     * Sets the value of the forecolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecolor(String value) {
        this.forecolor = value;
    }

    /**
     * Gets the value of the backcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Sets the value of the backcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Gets the value of the pen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPen() {
        return pen;
    }

    /**
     * Sets the value of the pen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPen(String value) {
        this.pen = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadius(String value) {
        this.radius = value;
    }

    /**
     * Gets the value of the scaleImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleImage() {
        return scaleImage;
    }

    /**
     * Sets the value of the scaleImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleImage(String value) {
        this.scaleImage = value;
    }

    /**
     * Gets the value of the hAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAlign() {
        return hAlign;
    }

    /**
     * Sets the value of the hAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAlign(String value) {
        this.hAlign = value;
    }

    /**
     * Gets the value of the vAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAlign() {
        return vAlign;
    }

    /**
     * Sets the value of the vAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAlign(String value) {
        this.vAlign = value;
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

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the lineSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Sets the value of the lineSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSpacing(String value) {
        this.lineSpacing = value;
    }

    /**
     * Gets the value of the isStyledText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStyledText() {
        return isStyledText;
    }

    /**
     * Sets the value of the isStyledText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStyledText(String value) {
        this.isStyledText = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkup(String value) {
        this.markup = value;
    }

    /**
     * Gets the value of the fontName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Sets the value of the fontName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the isBold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBold() {
        return isBold;
    }

    /**
     * Sets the value of the isBold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBold(String value) {
        this.isBold = value;
    }

    /**
     * Gets the value of the isItalic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsItalic() {
        return isItalic;
    }

    /**
     * Sets the value of the isItalic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsItalic(String value) {
        this.isItalic = value;
    }

    /**
     * Gets the value of the isUnderline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUnderline() {
        return isUnderline;
    }

    /**
     * Sets the value of the isUnderline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUnderline(String value) {
        this.isUnderline = value;
    }

    /**
     * Gets the value of the isStrikeThrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * Sets the value of the isStrikeThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStrikeThrough(String value) {
        this.isStrikeThrough = value;
    }

    /**
     * Gets the value of the pdfFontName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFontName() {
        return pdfFontName;
    }

    /**
     * Sets the value of the pdfFontName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFontName(String value) {
        this.pdfFontName = value;
    }

    /**
     * Gets the value of the pdfEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfEncoding() {
        return pdfEncoding;
    }

    /**
     * Sets the value of the pdfEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfEncoding(String value) {
        this.pdfEncoding = value;
    }

    /**
     * Gets the value of the isPdfEmbedded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPdfEmbedded() {
        return isPdfEmbedded;
    }

    /**
     * Sets the value of the isPdfEmbedded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPdfEmbedded(String value) {
        this.isPdfEmbedded = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the isBlankWhenNull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBlankWhenNull() {
        return isBlankWhenNull;
    }

    /**
     * Sets the value of the isBlankWhenNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBlankWhenNull(String value) {
        this.isBlankWhenNull = value;
    }

}