package org.utec.composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivo{

    private String nombre;
    private List<Archivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Carpeta: " + nombre);
        for(Archivo a : archivos) {
            a.mostrarDetalles();
        }
    }
}
