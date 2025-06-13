package com.mycompany.proyectob;

import java.util.ArrayList; // Para usar ArrayList
import java.io.FileOutputStream; // Para FileOutputStream
import java.io.FileInputStream; // Para FileInputStream
import java.io.ObjectOutputStream; // Para ObjectOutputStream
import java.io.ObjectInputStream; // Para ObjectInputStream
import java.io.IOException; // Para IOException
import java.lang.ClassNotFoundException; // Para ClassNotFoundException

/**
 *
 * @author emely
 */
public class Persistencia {
    
    // Método para guardar datos
    public static void guardarDatos(String archivo, Object datos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar datos
    public static Object cargarDatos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null; // Retorna null en caso de error
        }
    }
}