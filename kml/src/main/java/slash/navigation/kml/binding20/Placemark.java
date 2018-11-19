//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.17 at 01:40:15 PM MEZ
//


package slash.navigation.kml.binding20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://earth.google.com/kml/2.0}description" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}name" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Snippet" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Style" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}LookAt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}GeometryCollection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}MultiGeometry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}MultiLineString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}MultiPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}MultiPolygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Point" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Polygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}TimePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}LineString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}address" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressDetails" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}styleUrl" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}visibility" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descriptionOrNameOrSnippet"
})
@XmlRootElement(name = "Placemark")
public class Placemark {

    @XmlElementRefs({
        @XmlElementRef(name = "AddressDetails", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = JAXBElement.class),
        @XmlElementRef(name = "styleUrl", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "LookAt", namespace = "http://earth.google.com/kml/2.0", type = LookAt.class),
        @XmlElementRef(name = "MultiPolygon", namespace = "http://earth.google.com/kml/2.0", type = MultiPolygon.class),
        @XmlElementRef(name = "Style", namespace = "http://earth.google.com/kml/2.0", type = Style.class),
        @XmlElementRef(name = "description", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "TimePeriod", namespace = "http://earth.google.com/kml/2.0", type = TimePeriod.class),
        @XmlElementRef(name = "Polygon", namespace = "http://earth.google.com/kml/2.0", type = Polygon.class),
        @XmlElementRef(name = "MultiLineString", namespace = "http://earth.google.com/kml/2.0", type = MultiLineString.class),
        @XmlElementRef(name = "GeometryCollection", namespace = "http://earth.google.com/kml/2.0", type = GeometryCollection.class),
        @XmlElementRef(name = "name", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "MultiGeometry", namespace = "http://earth.google.com/kml/2.0", type = MultiGeometry.class),
        @XmlElementRef(name = "MultiPoint", namespace = "http://earth.google.com/kml/2.0", type = MultiPoint.class),
        @XmlElementRef(name = "Snippet", namespace = "http://earth.google.com/kml/2.0", type = Snippet.class),
        @XmlElementRef(name = "Point", namespace = "http://earth.google.com/kml/2.0", type = Point.class),
        @XmlElementRef(name = "visibility", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "address", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "LineString", namespace = "http://earth.google.com/kml/2.0", type = LineString.class)
    })
    protected List<Object> descriptionOrNameOrSnippet;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the descriptionOrNameOrSnippet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOrNameOrSnippet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOrNameOrSnippet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AddressDetails }{@code >}
     * {@link LookAt }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link MultiPolygon }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Style }
     * {@link TimePeriod }
     * {@link Polygon }
     * {@link MultiLineString }
     * {@link GeometryCollection }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link MultiGeometry }
     * {@link MultiPoint }
     * {@link Snippet }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link Point }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link LineString }
     * 
     * 
     */
    public List<Object> getDescriptionOrNameOrSnippet() {
        if (descriptionOrNameOrSnippet == null) {
            descriptionOrNameOrSnippet = new ArrayList<>();
        }
        return this.descriptionOrNameOrSnippet;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
