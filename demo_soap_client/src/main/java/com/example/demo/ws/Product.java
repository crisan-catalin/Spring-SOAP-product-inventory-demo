
package com.example.demo.ws;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="base64Image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currency" type="{http://www.catalin.com/springsoap/gen}currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", namespace = "http://www.catalin.com/springsoap/gen", propOrder = {
    "code",
    "name",
    "description",
    "base64Image",
    "stock",
    "price",
    "currency"
})
public class Product {

    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen", required = true)
    protected String code;
    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen", required = true)
    protected String description;
    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen", required = true)
    protected String base64Image;
    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen")
    protected int stock;
    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen")
    protected double price;
    @XmlElement(namespace = "http://www.catalin.com/springsoap/gen", required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the base64Image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Image() {
        return base64Image;
    }

    /**
     * Sets the value of the base64Image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Image(String value) {
        this.base64Image = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

}
