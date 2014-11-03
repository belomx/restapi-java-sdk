//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//

package de.immobilienscout24.rest.schema.offer.premiumplacement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import de.immobilienscout24.rest.schema.common._1.DateRange;
import de.immobilienscout24.rest.schema.offer.placement.Placement;

/**
 * Premiumplacement
 * 
 * <p>
 * Java-Klasse fr Premiumplacement complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Premiumplacement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="servicePeriod" type="{http://rest.immobilienscout24.de/schema/common/1.0}DateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="realestateid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voucher" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Premiumplacement", propOrder = { "servicePeriod" })
public class Premiumplacement implements Placement {

	protected DateRange servicePeriod;
	@XmlAttribute(name = "realestateid", required = true)
	protected String realestateid;
	@XmlAttribute(name = "voucher")
	protected String voucher;

	/**
	 * Ruft den Wert der servicePeriod-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DateRange }
	 * 
	 */
	public DateRange getServicePeriod() {
		return servicePeriod;
	}

	/**
	 * Legt den Wert der servicePeriod-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DateRange }
	 * 
	 */
	public void setServicePeriod(DateRange value) {
		this.servicePeriod = value;
	}

	/**
	 * Ruft den Wert der realestateid-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRealestateid() {
		return realestateid;
	}

	/**
	 * Legt den Wert der realestateid-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRealestateid(String value) {
		this.realestateid = value;
	}

	/**
	 * Ruft den Wert der voucher-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVoucher() {
		return voucher;
	}

	/**
	 * Legt den Wert der voucher-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVoucher(String value) {
		this.voucher = value;
	}

}