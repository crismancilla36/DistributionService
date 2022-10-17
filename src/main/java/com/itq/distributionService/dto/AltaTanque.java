//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.17 a las 01:24:08 PM CDT 
//


package com.itq.distributionService.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="zona"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="capacidad"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tiempoLlenado"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "zona",
    "capacidad",
    "tiempoLlenado"
})
@XmlRootElement(name = "altaTanque")
public class AltaTanque {

    protected int zona;
    protected int capacidad;
    protected int tiempoLlenado;

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     */
    public int getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     */
    public void setZona(int value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidad.
     * 
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Define el valor de la propiedad capacidad.
     * 
     */
    public void setCapacidad(int value) {
        this.capacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoLlenado.
     * 
     */
    public int getTiempoLlenado() {
        return tiempoLlenado;
    }

    /**
     * Define el valor de la propiedad tiempoLlenado.
     * 
     */
    public void setTiempoLlenado(int value) {
        this.tiempoLlenado = value;
    }

}
