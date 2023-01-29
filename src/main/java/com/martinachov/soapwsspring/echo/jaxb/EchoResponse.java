//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.28 a las 09:17:38 PM ART 
//


package com.martinachov.soapwsspring.echo.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="echo" type="{http://martinachov.com/soap}EchoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "echo"
})
@XmlRootElement(name = "EchoResponse")
public class EchoResponse {

    @XmlElement(required = true)
    protected EchoType echo;

    /**
     * Obtiene el valor de la propiedad echo.
     * 
     * @return
     *     possible object is
     *     {@link EchoType }
     *     
     */
    public EchoType getEcho() {
        return echo;
    }

    /**
     * Define el valor de la propiedad echo.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoType }
     *     
     */
    public void setEcho(EchoType value) {
        this.echo = value;
    }

}
