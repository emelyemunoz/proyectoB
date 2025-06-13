package com.mycompany.proyectob;

import java.io.Serializable; // Importar Serializable

/**
 *
 * @author emely
 */
public class libros implements Serializable { // Implementar Serializable
    private static final long serialVersionUID = 1L; // Versión de serialización

    // Definición de variables
    public String titulo;
    public String autor;
    public double precio;
    public int cantidad;
    public String genero;

    // No se incluye constructor
}