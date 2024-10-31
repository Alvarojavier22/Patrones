package org.utec.facade;

public class Main {
    public static void main(String[] args) {
        Proyector proyector = new Proyector();
        BluRay bluRay = new BluRay();
        Pantalla pantalla = new Pantalla();
        SistemaSonido sistemaSonido = new SistemaSonido();

        HomeTheaterFacade facade = new HomeTheaterFacade(pantalla, bluRay, proyector, sistemaSonido);

        facade.iniciarCine();
        System.out.println("");
        facade.terminarCine();
    }
}
