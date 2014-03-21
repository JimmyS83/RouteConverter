//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.16-hudson-jaxb-ri-2.1-pushtomaven-250--SNAPSHOT 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.19 at 12:00:13 PM MEZ 
//


package slash.navigation.download.datasources.binding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the slash.navigation.download.datasources.binding package. 
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

    private final static QName _Datasources_QNAME = new QName("http://www.routeconverter.de/xmlschemas/Datasources/1.0", "datasources");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: slash.navigation.download.datasources.binding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatasourcesType }
     * 
     */
    public DatasourcesType createDatasourcesType() {
        return new DatasourcesType();
    }

    /**
     * Create an instance of {@link DatasourceType }
     * 
     */
    public DatasourceType createDatasourceType() {
        return new DatasourceType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link FragmentType }
     * 
     */
    public FragmentType createFragmentType() {
        return new FragmentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatasourcesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.routeconverter.de/xmlschemas/Datasources/1.0", name = "datasources")
    public JAXBElement<DatasourcesType> createDatasources(DatasourcesType value) {
        return new JAXBElement<DatasourcesType>(_Datasources_QNAME, DatasourcesType.class, null, value);
    }

}
