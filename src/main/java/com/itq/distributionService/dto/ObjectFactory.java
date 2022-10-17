//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.17 a las 01:24:08 PM CDT 
//


package com.itq.distributionService.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itq.distributionService.dto package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itq.distributionService.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClienteAlta }
     * 
     */
    public ClienteAlta createClienteAlta() {
        return new ClienteAlta();
    }

    /**
     * Create an instance of {@link ClienteConsulta }
     * 
     */
    public ClienteConsulta createClienteConsulta() {
        return new ClienteConsulta();
    }

    /**
     * Create an instance of {@link ClienteAlta.Direccion }
     * 
     */
    public ClienteAlta.Direccion createClienteAltaDireccion() {
        return new ClienteAlta.Direccion();
    }

    /**
     * Create an instance of {@link Ack }
     * 
     */
    public Ack createAck() {
        return new Ack();
    }

    /**
     * Create an instance of {@link AltaSolicitud }
     * 
     */
    public AltaSolicitud createAltaSolicitud() {
        return new AltaSolicitud();
    }

    /**
     * Create an instance of {@link ConsultaSolicitud }
     * 
     */
    public ConsultaSolicitud createConsultaSolicitud() {
        return new ConsultaSolicitud();
    }

    /**
     * Create an instance of {@link TanqueConsulta }
     * 
     */
    public TanqueConsulta createTanqueConsulta() {
        return new TanqueConsulta();
    }

    /**
     * Create an instance of {@link AltaTanque }
     * 
     */
    public AltaTanque createAltaTanque() {
        return new AltaTanque();
    }

}
