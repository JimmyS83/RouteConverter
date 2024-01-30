//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.16-hudson-jaxb-ri-2.1-pushtomaven-250--SNAPSHOT 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 04:01:32 PM MEZ 
//


package slash.navigation.gpx.trip1;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the slash.navigation.gpx.trip1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Trip_QNAME = new QName("http://www.garmin.com/xmlschemas/TripExtensions/v1", "Trip");
    private final static QName _ShapingPoint_QNAME = new QName("http://www.garmin.com/xmlschemas/TripExtensions/v1", "ShapingPoint");
    private final static QName _ViaPoint_QNAME = new QName("http://www.garmin.com/xmlschemas/TripExtensions/v1", "ViaPoint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: slash.navigation.gpx.trip1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViaPointExtensionT }
     * 
     */
    public ViaPointExtensionT createViaPointExtensionT() {
        return new ViaPointExtensionT();
    }

    /**
     * Create an instance of {@link ShapingPointExtensionT }
     * 
     */
    public ShapingPointExtensionT createShapingPointExtensionT() {
        return new ShapingPointExtensionT();
    }

    /**
     * Create an instance of {@link TripExtensionT }
     * 
     */
    public TripExtensionT createTripExtensionT() {
        return new TripExtensionT();
    }

    /**
     * Create an instance of {@link NamedRoadT }
     * 
     */
    public NamedRoadT createNamedRoadT() {
        return new NamedRoadT();
    }

    /**
     * Create an instance of {@link ExtensionsT }
     * 
     */
    public ExtensionsT createExtensionsT() {
        return new ExtensionsT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripExtensionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/TripExtensions/v1", name = "Trip")
    public JAXBElement<TripExtensionT> createTrip(TripExtensionT value) {
        return new JAXBElement<>(_Trip_QNAME, TripExtensionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapingPointExtensionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/TripExtensions/v1", name = "ShapingPoint")
    public JAXBElement<ShapingPointExtensionT> createShapingPoint(ShapingPointExtensionT value) {
        return new JAXBElement<>(_ShapingPoint_QNAME, ShapingPointExtensionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViaPointExtensionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/TripExtensions/v1", name = "ViaPoint")
    public JAXBElement<ViaPointExtensionT> createViaPoint(ViaPointExtensionT value) {
        return new JAXBElement<>(_ViaPoint_QNAME, ViaPointExtensionT.class, null, value);
    }

}
