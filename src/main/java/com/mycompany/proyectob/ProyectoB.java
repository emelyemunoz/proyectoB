package com.mycompany.proyectob;

import java.util.ArrayList;

/**
 *
 * @author emely
 */
public class ProyectoB {

    public static ArrayList<usuario> usuarios = new ArrayList<>(); // Creación de la lista de usuarios
    public static ArrayList<libros> libros = new ArrayList<>(); // Creación de la lista de libros
    public static ArrayList<cupones> cupones = new ArrayList<>(); //creación de la lista de cupones
    public static ArrayList<Clientes> clientes = new ArrayList<>();
    public static ArrayList<libros2> libros2 = new ArrayList<>();
    public static ArrayList<ventas> ventas = new ArrayList<>();
   

    public static void main(String[] args) {
        crearUsuarioPredeterminado(); // Llama al método para crear el usuario predeterminado
        crearLibroPreterminado();
        //crearLibroVenta();

        login v = new login();
        v.setVisible(true);
    }

    private static void crearUsuarioPredeterminado() {
        // Crear usuario predeterminado
        // definimos la variable de admin que seria el objeto y lo que le sigue al . sus atributos
        usuario admin = new usuario(); //usuario es el metodo contructor
        admin.usuario = "admin";
        admin.nombre = "Administrador";
        admin.rol = 1;
        admin.password = "admin";

        // Agregar el usuario a la lista
        usuarios.add(admin);

        usuario vendedor = new usuario(); //usuario es el metodo contructor
        vendedor.usuario = "vendedor";
        vendedor.nombre = "vendedor";
        vendedor.rol = 2;
        vendedor.password = "vendedor";

        usuarios.add(vendedor);
    }

    private static void crearLibroPreterminado() {
        libros p = new libros();
        p.titulo = "la sombra del viento";
        p.autor = "carlos Ruiz Zafón";
        p.precio = 19.99;
        p.cantidad = 50;
        p.genero = "Ficción";

        libros.add(p);
    }
}
