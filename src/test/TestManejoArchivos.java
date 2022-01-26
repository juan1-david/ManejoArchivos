package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
       // crearArchivo(nombreArchivo);
        //anexarArchivo(nombreArchivo,"hola desde java");
       //anexarArchivo(nombreArchivo,"se volvio a escribir");
        leerArchivo(nombreArchivo);
    }
}
