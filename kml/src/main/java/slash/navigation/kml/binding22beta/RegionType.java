//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.12 at 02:39:09 PM CEST 
//


package slash.navigation.kml.binding22beta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earth.google.com/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://earth.google.com/kml/2.2}LatLonAltBox" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.2}Lod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionType", propOrder = {
    "latLonAltBox",
    "lod"
})
public class RegionType
    extends AbstractObjectType
{

    @XmlElement(name = "LatLonAltBox")
    protected LatLonAltBoxType latLonAltBox;
    @XmlElement(name = "Lod")
    protected LodType lod;

    /**
     * Gets the value of the latLonAltBox property.
     * 
     * @return
     *     possible object is
     *     {@link LatLonAltBoxType }
     *     
     */
    public LatLonAltBoxType getLatLonAltBox() {
        return latLonAltBox;
    }

    /**
     * Sets the value of the latLonAltBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonAltBoxType }
     *     
     */
    public void setLatLonAltBox(LatLonAltBoxType value) {
        this.latLonAltBox = value;
    }

    /**
     * Gets the value of the lod property.
     * 
     * @return
     *     possible object is
     *     {@link LodType }
     *     
     */
    public LodType getLod() {
        return lod;
    }

    /**
     * Sets the value of the lod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodType }
     *     
     */
    public void setLod(LodType value) {
        this.lod = value;
    }

}
