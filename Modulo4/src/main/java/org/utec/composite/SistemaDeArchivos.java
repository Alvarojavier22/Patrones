package org.utec.composite;

public class SistemaDeArchivos {
    public static void main(String[] args) {
        Archivo a = new ArchivoSimple("documento.txt");
        Archivo b = new ArchivoSimple("imagen.png");

        Carpeta c = new Carpeta("Mis documentos");

        c.agregarArchivo(a);
        c.agregarArchivo(b);

        c.mostrarDetalles();
    }
}
