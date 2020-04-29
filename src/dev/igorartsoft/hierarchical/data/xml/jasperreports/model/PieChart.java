//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 03:04:02 PM EST 
//


package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}piePlot"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chart",
    "pieDataset",
    "piePlot"
})
@XmlRootElement(name = "pieChart")
public class PieChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected PieDataset pieDataset;
    @XmlElement(required = true)
    protected PiePlot piePlot;

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setChart(Chart value) {
        this.chart = value;
    }

    /**
     * Gets the value of the pieDataset property.
     * 
     * @return
     *     possible object is
     *     {@link PieDataset }
     *     
     */
    public PieDataset getPieDataset() {
        return pieDataset;
    }

    /**
     * Sets the value of the pieDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link PieDataset }
     *     
     */
    public void setPieDataset(PieDataset value) {
        this.pieDataset = value;
    }

    /**
     * Gets the value of the piePlot property.
     * 
     * @return
     *     possible object is
     *     {@link PiePlot }
     *     
     */
    public PiePlot getPiePlot() {
        return piePlot;
    }

    /**
     * Sets the value of the piePlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiePlot }
     *     
     */
    public void setPiePlot(PiePlot value) {
        this.piePlot = value;
    }

}
