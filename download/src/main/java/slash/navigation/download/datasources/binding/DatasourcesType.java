//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.16-hudson-jaxb-ri-2.1-pushtomaven-250--SNAPSHOT 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:00:13 PM MEZ 
//


package slash.navigation.download.datasources.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 *                 datasources contain datasource definitions.
 *             
 * 
 * <p>Java class for datasourcesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datasourcesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datasource" type="{http://www.routeconverter.de/xmlschemas/Datasources/1.0}datasourceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datasourcesType", propOrder = {
    "datasource"
})
public class DatasourcesType {

    @XmlElement(required = true)
    protected List<DatasourceType> datasource;

    /**
     * Gets the value of the datasource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasourceType }
     * 
     * 
     */
    public List<DatasourceType> getDatasource() {
        if (datasource == null) {
            datasource = new ArrayList<DatasourceType>();
        }
        return this.datasource;
    }

}
