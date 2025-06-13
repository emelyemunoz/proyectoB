package com.mycompany.proyectob;

import java.io.Serializable; // Importar Serializable
import java.util.ArrayList;

/**
 *
 * @author emely
 */
public class usuario implements Serializable { // Implementar Serializable
    private static final long serialVersionUID = 1L; // Versión de serialización

    // Definición de variables
    public String usuario;
    public String nombre;
    public int rol;
    public String password;

    public ArrayList<Telefono> telefonos = new ArrayList<>();
    public ArrayList<Miperfil> miperfil = new ArrayList<>();

    // No se incluye constructor
}