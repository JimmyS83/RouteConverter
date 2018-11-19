//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.30 at 10:09:49 AM MESZ 
//


package slash.navigation.tcx.binding2;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for WorkoutFolder_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkoutFolder_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folder" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkoutNameRef" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}NameKeyReference_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkoutFolder_t", propOrder = {
    "folder",
    "workoutNameRef",
    "extensions"
})
public class WorkoutFolderT {

    @XmlElement(name = "Folder")
    protected List<WorkoutFolderT> folder;
    @XmlElement(name = "WorkoutNameRef")
    protected List<NameKeyReferenceT> workoutNameRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the folder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkoutFolderT }
     * 
     * 
     */
    public List<WorkoutFolderT> getFolder() {
        if (folder == null) {
            folder = new ArrayList<>();
        }
        return this.folder;
    }

    /**
     * Gets the value of the workoutNameRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workoutNameRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkoutNameRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameKeyReferenceT }
     * 
     * 
     */
    public List<NameKeyReferenceT> getWorkoutNameRef() {
        if (workoutNameRef == null) {
            workoutNameRef = new ArrayList<>();
        }
        return this.workoutNameRef;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
