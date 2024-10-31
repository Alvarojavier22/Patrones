package org.utec.facade;

public class SistemaSonido {

    public void encender(){
        System.out.println("Sistema de sonido encendido");
    }
    public void apagar(){
        System.out.println("Sistema de sonido apagado");
    }
    public void configurarVolumen(int nivel){
        System.out.println("Volumen configurado a: " + nivel);
    }
}
