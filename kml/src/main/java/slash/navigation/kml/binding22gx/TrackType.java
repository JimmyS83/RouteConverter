//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.13 at 10:12:26 PM MESZ 
//


package slash.navigation.kml.binding22gx;

import slash.navigation.kml.binding22.AbstractGeometryType;
import slash.navigation.kml.binding22.ExtendedDataType;
import slash.navigation.kml.binding22.ModelType;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TrackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}extrude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}tessellate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}when" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.google.com/kml/ext/2.2}coord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.google.com/kml/ext/2.2}angles" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Model" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ExtendedData" minOccurs="0"/>
 *         &lt;element ref="{http://www.google.com/kml/ext/2.2}AbstractTrackSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackType", propOrder = {
    "extrude",
    "tessellate",
    "when",
    "coord",
    "angles",
    "model",
    "extendedData",
    "abstractTrackSimpleExtensionGroup"
})
public class TrackType
    extends AbstractGeometryType
{

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "0")
    protected Boolean extrude;
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "0")
    protected Boolean tessellate;
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected List<String> when;
    protected List<String> coord;
    protected List<String> angles;
    @XmlElement(name = "Model", namespace = "http://www.opengis.net/kml/2.2")
    protected ModelType model;
    @XmlElement(name = "ExtendedData", namespace = "http://www.opengis.net/kml/2.2")
    protected ExtendedDataType extendedData;
    @XmlElement(name = "AbstractTrackSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractTrackSimpleExtensionGroup;

    /**
     * Gets the value of the extrude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtrude() {
        return extrude;
    }

    /**
     * Sets the value of the extrude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrude(Boolean value) {
        this.extrude = value;
    }

    /**
     * Gets the value of the tessellate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTessellate() {
        return tessellate;
    }

    /**
     * Sets the value of the tessellate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTessellate(Boolean value) {
        this.tessellate = value;
    }

    /**
     * Gets the value of the when property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the when property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWhen() {
        if (when == null) {
            when = new ArrayList<>();
        }
        return this.when;
    }

    /**
     * Gets the value of the coord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCoord() {
        if (coord == null) {
            coord = new ArrayList<>();
        }
        return this.coord;
    }

    /**
     * Gets the value of the angles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the angles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAngles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAngles() {
        if (angles == null) {
            angles = new ArrayList<>();
        }
        return this.angles;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link ModelType }
     *     
     */
    public ModelType getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelType }
     *     
     */
    public void setModel(ModelType value) {
        this.model = value;
    }

    /**
     * Gets the value of the extendedData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDataType }
     *     
     */
    public ExtendedDataType getExtendedData() {
        return extendedData;
    }

    /**
     * Sets the value of the extendedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDataType }
     *     
     */
    public void setExtendedData(ExtendedDataType value) {
        this.extendedData = value;
    }

    /**
     * Gets the value of the abstractTrackSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTrackSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTrackSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAbstractTrackSimpleExtensionGroup() {
        if (abstractTrackSimpleExtensionGroup == null) {
            abstractTrackSimpleExtensionGroup = new ArrayList<>();
        }
        return this.abstractTrackSimpleExtensionGroup;
    }

}
