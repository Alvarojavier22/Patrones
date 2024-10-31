package org.utec.proxy;

public class Documento {

    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }
    public void verContenido(){
        System.out.println("Contenido del documento: " + contenido);
    }
}
