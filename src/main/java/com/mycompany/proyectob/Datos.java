package com.mycompany.proyectob;

import java.io.Serializable;
import java.util.ArrayList;

public class Datos implements Serializable {
    private static final long serialVersionUID = 1L;

    public ArrayList<usuario> usuarios;
    public ArrayList<libros> libros;
    public ArrayList<cupones> cupones;
    public ArrayList<Clientes> clientes; // Asegúrate de que esta clase sea Serializable
    public ArrayList<libros2> libros2; // Asegúrate de que esta clase sea Serializable
    public ArrayList<ventas> ventas; // Asegúrate de que esta clase sea Serializable

    // Constructor
    public Datos(ArrayList<usuario> usuarios, ArrayList<libros> libros, ArrayList<cupones> cupones,
                  ArrayList<Clientes> clientes, ArrayList<libros2> libros2, ArrayList<ventas> ventas) {
        this.usuarios = usuarios;
        this.libros = libros;
        this.cupones = cupones;
        this.clientes = clientes;
        this.libros2 = libros2;
        this.ventas = ventas;
    }
}