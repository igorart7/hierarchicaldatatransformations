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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parametersMapExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}datasetParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}connectionExpression"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataSourceExpression"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="subDataset" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parametersMapExpression",
    "datasetParameter",
    "connectionExpression",
    "dataSourceExpression"
})
@XmlRootElement(name = "datasetRun")
public class DatasetRun {

    protected ParametersMapExpression parametersMapExpression;
    protected List<DatasetParameter> datasetParameter;
    protected ConnectionExpression connectionExpression;
    protected DataSourceExpression dataSourceExpression;
    @XmlAttribute(name = "subDataset", required = true)
    protected String subDataset;

    /**
     * Gets the value of the parametersMapExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersMapExpression }
     *     
     */
    public ParametersMapExpression getParametersMapExpression() {
        return parametersMapExpression;
    }

    /**
     * Sets the value of the parametersMapExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersMapExpression }
     *     
     */
    public void setParametersMapExpression(ParametersMapExpression value) {
        this.parametersMapExpression = value;
    }

    /**
     * Gets the value of the datasetParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetParameter }
     * 
     * 
     */
    public List<DatasetParameter> getDatasetParameter() {
        if (datasetParameter == null) {
            datasetParameter = new ArrayList<DatasetParameter>();
        }
        return this.datasetParameter;
    }

    /**
     * Gets the value of the connectionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionExpression }
     *     
     */
    public ConnectionExpression getConnectionExpression() {
        return connectionExpression;
    }

    /**
     * Sets the value of the connectionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionExpression }
     *     
     */
    public void setConnectionExpression(ConnectionExpression value) {
        this.connectionExpression = value;
    }

    /**
     * Gets the value of the dataSourceExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceExpression }
     *     
     */
    public DataSourceExpression getDataSourceExpression() {
        return dataSourceExpression;
    }

    /**
     * Sets the value of the dataSourceExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceExpression }
     *     
     */
    public void setDataSourceExpression(DataSourceExpression value) {
        this.dataSourceExpression = value;
    }

    /**
     * Gets the value of the subDataset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDataset() {
        return subDataset;
    }

    /**
     * Sets the value of the subDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDataset(String value) {
        this.subDataset = value;
    }

}