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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueDataset"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}meterPlot"/>
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
    "valueDataset",
    "meterPlot"
})
@XmlRootElement(name = "meterChart")
public class MeterChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected ValueDataset valueDataset;
    @XmlElement(required = true)
    protected MeterPlot meterPlot;

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
     * Gets the value of the valueDataset property.
     * 
     * @return
     *     possible object is
     *     {@link ValueDataset }
     *     
     */
    public ValueDataset getValueDataset() {
        return valueDataset;
    }

    /**
     * Sets the value of the valueDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDataset }
     *     
     */
    public void setValueDataset(ValueDataset value) {
        this.valueDataset = value;
    }

    /**
     * Gets the value of the meterPlot property.
     * 
     * @return
     *     possible object is
     *     {@link MeterPlot }
     *     
     */
    public MeterPlot getMeterPlot() {
        return meterPlot;
    }

    /**
     * Sets the value of the meterPlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterPlot }
     *     
     */
    public void setMeterPlot(MeterPlot value) {
        this.meterPlot = value;
    }

}