//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.17 a las 01:24:08 PM CDT 
//


package com.itq.distributionService.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zona"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="direccion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="numeroInterior"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxExclusive value="10000"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="numeroExterior"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxExclusive value="10000"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="telefono"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="/+[0-9]{3}[0-9]{10}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="correo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="([a-zA-Z0-9_.]+@(gmail|hotmail|outlook|yahoo).com)"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "nombres",
    "primerApellido",
    "segundoApellido",
    "zona",
    "direccion"
})
@XmlRootElement(name = "ClienteAlta")
public class ClienteAlta {

    @XmlElement(required = true)
    protected String nombres;
    @XmlElement(required = true)
    protected String primerApellido;
    protected String segundoApellido;
    @XmlElement(name = "Zona")
    protected int zona;
    @XmlElement(required = true)
    protected ClienteAlta.Direccion direccion;

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

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
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link ClienteAlta.Direccion }
     *     
     */
    public ClienteAlta.Direccion getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteAlta.Direccion }
     *     
     */
    public void setDireccion(ClienteAlta.Direccion value) {
        this.direccion = value;
    }


    /**
     * Tipo de direccion
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="numeroInterior"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxExclusive value="10000"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="numeroExterior"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxExclusive value="10000"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="telefono"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="/+[0-9]{3}[0-9]{10}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="correo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="([a-zA-Z0-9_.]+@(gmail|hotmail|outlook|yahoo).com)"/&gt;
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
        "calle",
        "colonia",
        "numeroInterior",
        "numeroExterior",
        "telefono",
        "correo"
    })
    public static class Direccion {

        @XmlElement(required = true)
        protected String calle;
        @XmlElement(required = true)
        protected String colonia;
        protected int numeroInterior;
        protected int numeroExterior;
        @XmlElement(required = true)
        protected String telefono;
        @XmlElement(required = true)
        protected String correo;

        /**
         * Obtiene el valor de la propiedad calle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalle() {
            return calle;
        }

        /**
         * Define el valor de la propiedad calle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalle(String value) {
            this.calle = value;
        }

        /**
         * Obtiene el valor de la propiedad colonia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColonia() {
            return colonia;
        }

        /**
         * Define el valor de la propiedad colonia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColonia(String value) {
            this.colonia = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroInterior.
         * 
         */
        public int getNumeroInterior() {
            return numeroInterior;
        }

        /**
         * Define el valor de la propiedad numeroInterior.
         * 
         */
        public void setNumeroInterior(int value) {
            this.numeroInterior = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroExterior.
         * 
         */
        public int getNumeroExterior() {
            return numeroExterior;
        }

        /**
         * Define el valor de la propiedad numeroExterior.
         * 
         */
        public void setNumeroExterior(int value) {
            this.numeroExterior = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
        }

        /**
         * Obtiene el valor de la propiedad correo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorreo() {
            return correo;
        }

        /**
         * Define el valor de la propiedad correo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorreo(String value) {
            this.correo = value;
        }

    }

}
