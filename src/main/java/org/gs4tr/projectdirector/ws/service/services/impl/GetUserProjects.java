
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSubProjectIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isSubProjectIncluded"
})
@XmlRootElement(name = "getUserProjects")
public class GetUserProjects {

    protected boolean isSubProjectIncluded;

    /**
     * Gets the value of the isSubProjectIncluded property.
     * 
     */
    public boolean isIsSubProjectIncluded() {
        return isSubProjectIncluded;
    }

    /**
     * Sets the value of the isSubProjectIncluded property.
     * 
     */
    public void setIsSubProjectIncluded(boolean value) {
        this.isSubProjectIncluded = value;
    }

}
