//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.16 at 09:21:13 PM MEZ 
//


package slash.navigation.kml.binding21;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IconStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earth.google.com/kml/2.1}ColorStyleType">
 *       &lt;sequence>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Icon" type="{http://earth.google.com/kml/2.1}IconStyleIconType" minOccurs="0"/>
 *         &lt;element name="hotSpot" type="{http://earth.google.com/kml/2.1}vec2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IconStyleType", propOrder = {
    "scale",
    "heading",
    "icon",
    "hotSpot"
})
public class IconStyleType
    extends ColorStyleType
{

    @XmlElement(defaultValue = "1")
    protected Float scale;
    @XmlElement(defaultValue = "0")
    protected Float heading;
    @XmlElement(name = "Icon")
    protected IconStyleIconType icon;
    protected Vec2Type hotSpot;

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScale(Float value) {
        this.scale = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeading(Float value) {
        this.heading = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link IconStyleIconType }
     *     
     */
    public IconStyleIconType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconStyleIconType }
     *     
     */
    public void setIcon(IconStyleIconType value) {
        this.icon = value;
    }

    /**
     * Gets the value of the hotSpot property.
     * 
     * @return
     *     possible object is
     *     {@link Vec2Type }
     *     
     */
    public Vec2Type getHotSpot() {
        return hotSpot;
    }

    /**
     * Sets the value of the hotSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vec2Type }
     *     
     */
    public void setHotSpot(Vec2Type value) {
        this.hotSpot = value;
    }

}
