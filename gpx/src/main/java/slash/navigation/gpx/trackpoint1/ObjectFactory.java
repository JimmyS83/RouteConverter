//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.02 at 08:44:35 PM MEZ 
//


package slash.navigation.gpx.trackpoint1;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the slash.navigation.gpx.trackpoint1 package. 
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

    private final static QName _TrackPointExtension_QNAME = new QName("http://www.garmin.com/xmlschemas/TrackPointExtension/v1", "TrackPointExtension");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: slash.navigation.gpx.trackpoint1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackPointExtensionT }
     * 
     */
    public TrackPointExtensionT createTrackPointExtensionT() {
        return new TrackPointExtensionT();
    }

    /**
     * Create an instance of {@link ExtensionsT }
     * 
     */
    public ExtensionsT createExtensionsT() {
        return new ExtensionsT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackPointExtensionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1", name = "TrackPointExtension")
    public JAXBElement<TrackPointExtensionT> createTrackPointExtension(TrackPointExtensionT value) {
        return new JAXBElement<>(_TrackPointExtension_QNAME, TrackPointExtensionT.class, null, value);
    }

}
