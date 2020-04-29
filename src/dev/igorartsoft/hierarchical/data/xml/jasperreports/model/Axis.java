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
 *       &lt;choice>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyBarChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBarChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBar3DChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lineChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyLineChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}areaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyAreaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scatterChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bubbleChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedAreaChart"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttChart"/>
 *       &lt;/choice>
 *       &lt;attribute name="position">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="leftOrTop"/>
 *             &lt;enumeration value="rightOrBottom"/>
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
    "barChart",
    "bar3DChart",
    "xyBarChart",
    "stackedBarChart",
    "stackedBar3DChart",
    "lineChart",
    "xyLineChart",
    "areaChart",
    "xyAreaChart",
    "scatterChart",
    "bubbleChart",
    "timeSeriesChart",
    "highLowChart",
    "candlestickChart",
    "stackedAreaChart",
    "ganttChart"
})
@XmlRootElement(name = "axis")
public class Axis {

    protected BarChart barChart;
    protected Bar3DChart bar3DChart;
    protected XyBarChart xyBarChart;
    protected StackedBarChart stackedBarChart;
    protected StackedBar3DChart stackedBar3DChart;
    protected LineChart lineChart;
    protected XyLineChart xyLineChart;
    protected AreaChart areaChart;
    protected XyAreaChart xyAreaChart;
    protected ScatterChart scatterChart;
    protected BubbleChart bubbleChart;
    protected TimeSeriesChart timeSeriesChart;
    protected HighLowChart highLowChart;
    protected CandlestickChart candlestickChart;
    protected StackedAreaChart stackedAreaChart;
    protected GanttChart ganttChart;
    @XmlAttribute(name = "position")
    protected String position;

    /**
     * Gets the value of the barChart property.
     * 
     * @return
     *     possible object is
     *     {@link BarChart }
     *     
     */
    public BarChart getBarChart() {
        return barChart;
    }

    /**
     * Sets the value of the barChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarChart }
     *     
     */
    public void setBarChart(BarChart value) {
        this.barChart = value;
    }

    /**
     * Gets the value of the bar3DChart property.
     * 
     * @return
     *     possible object is
     *     {@link Bar3DChart }
     *     
     */
    public Bar3DChart getBar3DChart() {
        return bar3DChart;
    }

    /**
     * Sets the value of the bar3DChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bar3DChart }
     *     
     */
    public void setBar3DChart(Bar3DChart value) {
        this.bar3DChart = value;
    }

    /**
     * Gets the value of the xyBarChart property.
     * 
     * @return
     *     possible object is
     *     {@link XyBarChart }
     *     
     */
    public XyBarChart getXyBarChart() {
        return xyBarChart;
    }

    /**
     * Sets the value of the xyBarChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XyBarChart }
     *     
     */
    public void setXyBarChart(XyBarChart value) {
        this.xyBarChart = value;
    }

    /**
     * Gets the value of the stackedBarChart property.
     * 
     * @return
     *     possible object is
     *     {@link StackedBarChart }
     *     
     */
    public StackedBarChart getStackedBarChart() {
        return stackedBarChart;
    }

    /**
     * Sets the value of the stackedBarChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link StackedBarChart }
     *     
     */
    public void setStackedBarChart(StackedBarChart value) {
        this.stackedBarChart = value;
    }

    /**
     * Gets the value of the stackedBar3DChart property.
     * 
     * @return
     *     possible object is
     *     {@link StackedBar3DChart }
     *     
     */
    public StackedBar3DChart getStackedBar3DChart() {
        return stackedBar3DChart;
    }

    /**
     * Sets the value of the stackedBar3DChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link StackedBar3DChart }
     *     
     */
    public void setStackedBar3DChart(StackedBar3DChart value) {
        this.stackedBar3DChart = value;
    }

    /**
     * Gets the value of the lineChart property.
     * 
     * @return
     *     possible object is
     *     {@link LineChart }
     *     
     */
    public LineChart getLineChart() {
        return lineChart;
    }

    /**
     * Sets the value of the lineChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineChart }
     *     
     */
    public void setLineChart(LineChart value) {
        this.lineChart = value;
    }

    /**
     * Gets the value of the xyLineChart property.
     * 
     * @return
     *     possible object is
     *     {@link XyLineChart }
     *     
     */
    public XyLineChart getXyLineChart() {
        return xyLineChart;
    }

    /**
     * Sets the value of the xyLineChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XyLineChart }
     *     
     */
    public void setXyLineChart(XyLineChart value) {
        this.xyLineChart = value;
    }

    /**
     * Gets the value of the areaChart property.
     * 
     * @return
     *     possible object is
     *     {@link AreaChart }
     *     
     */
    public AreaChart getAreaChart() {
        return areaChart;
    }

    /**
     * Sets the value of the areaChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaChart }
     *     
     */
    public void setAreaChart(AreaChart value) {
        this.areaChart = value;
    }

    /**
     * Gets the value of the xyAreaChart property.
     * 
     * @return
     *     possible object is
     *     {@link XyAreaChart }
     *     
     */
    public XyAreaChart getXyAreaChart() {
        return xyAreaChart;
    }

    /**
     * Sets the value of the xyAreaChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XyAreaChart }
     *     
     */
    public void setXyAreaChart(XyAreaChart value) {
        this.xyAreaChart = value;
    }

    /**
     * Gets the value of the scatterChart property.
     * 
     * @return
     *     possible object is
     *     {@link ScatterChart }
     *     
     */
    public ScatterChart getScatterChart() {
        return scatterChart;
    }

    /**
     * Sets the value of the scatterChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatterChart }
     *     
     */
    public void setScatterChart(ScatterChart value) {
        this.scatterChart = value;
    }

    /**
     * Gets the value of the bubbleChart property.
     * 
     * @return
     *     possible object is
     *     {@link BubbleChart }
     *     
     */
    public BubbleChart getBubbleChart() {
        return bubbleChart;
    }

    /**
     * Sets the value of the bubbleChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BubbleChart }
     *     
     */
    public void setBubbleChart(BubbleChart value) {
        this.bubbleChart = value;
    }

    /**
     * Gets the value of the timeSeriesChart property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesChart }
     *     
     */
    public TimeSeriesChart getTimeSeriesChart() {
        return timeSeriesChart;
    }

    /**
     * Sets the value of the timeSeriesChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesChart }
     *     
     */
    public void setTimeSeriesChart(TimeSeriesChart value) {
        this.timeSeriesChart = value;
    }

    /**
     * Gets the value of the highLowChart property.
     * 
     * @return
     *     possible object is
     *     {@link HighLowChart }
     *     
     */
    public HighLowChart getHighLowChart() {
        return highLowChart;
    }

    /**
     * Sets the value of the highLowChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLowChart }
     *     
     */
    public void setHighLowChart(HighLowChart value) {
        this.highLowChart = value;
    }

    /**
     * Gets the value of the candlestickChart property.
     * 
     * @return
     *     possible object is
     *     {@link CandlestickChart }
     *     
     */
    public CandlestickChart getCandlestickChart() {
        return candlestickChart;
    }

    /**
     * Sets the value of the candlestickChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandlestickChart }
     *     
     */
    public void setCandlestickChart(CandlestickChart value) {
        this.candlestickChart = value;
    }

    /**
     * Gets the value of the stackedAreaChart property.
     * 
     * @return
     *     possible object is
     *     {@link StackedAreaChart }
     *     
     */
    public StackedAreaChart getStackedAreaChart() {
        return stackedAreaChart;
    }

    /**
     * Sets the value of the stackedAreaChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link StackedAreaChart }
     *     
     */
    public void setStackedAreaChart(StackedAreaChart value) {
        this.stackedAreaChart = value;
    }

    /**
     * Gets the value of the ganttChart property.
     * 
     * @return
     *     possible object is
     *     {@link GanttChart }
     *     
     */
    public GanttChart getGanttChart() {
        return ganttChart;
    }

    /**
     * Sets the value of the ganttChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link GanttChart }
     *     
     */
    public void setGanttChart(GanttChart value) {
        this.ganttChart = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}