package com.mycompany.proyectob;

import java.io.Serializable; // Importar Serializable
import java.util.Date;

/**
 *
 * @author emely
 */
public class cupones implements Serializable { // Implementar Serializable
    private static final long serialVersionUID = 1L; // Versión de serialización

    // Definición de variables
    public String codigo;
    public String valor_total;
    public Date fecha;
    public boolean usado = false; // Nuevo atributo

    // Puedes agregar un constructor y métodos adicionales si es necesario
}
