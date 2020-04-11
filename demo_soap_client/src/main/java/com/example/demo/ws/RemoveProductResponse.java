
package com.example.demo.ws;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="sucess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "sucess"
})
@XmlRootElement(name = "removeProductResponse", namespace = "http://www.catalin.com/springsoap/gen")
public class RemoveProductResponse {

    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen")
    protected boolean sucess;

    /**
     * Gets the value of the sucess property.
     * 
     */
    public boolean isSucess() {
        return sucess;
    }

    /**
     * Sets the value of the sucess property.
     * 
     */
    public void setSucess(boolean value) {
        this.sucess = value;
    }

}
