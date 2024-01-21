//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.09 at 05:55:17 PM CEST 
//


package slash.navigation.routes.remote.binding;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the slash.navigation.routes.remote.binding package. 
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

    private final static QName _Catalog_QNAME = new QName("http://api.routeconverter.com/v1/schemas/route-catalog", "catalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: slash.navigation.routes.remote.binding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogType }
     * 
     */
    public CatalogType createCatalogType() {
        return new CatalogType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link RouteType }
     * 
     */
    public RouteType createRouteType() {
        return new RouteType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.routeconverter.com/v1/schemas/route-catalog", name = "catalog")
    public JAXBElement<CatalogType> createCatalog(CatalogType value) {
        return new JAXBElement<>(_Catalog_QNAME, CatalogType.class, null, value);
    }

}
