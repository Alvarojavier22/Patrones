package org.utec.facade;

public class HomeTheaterFacade {

    private Pantalla pantalla;
    private BluRay bluRay;
    private Proyector proyector;
    private SistemaSonido sistemaSonido;

    public HomeTheaterFacade(Pantalla pantalla, BluRay bluRay, Proyector proyector, SistemaSonido sistemaSonido) {
        this.pantalla = pantalla;
        this.bluRay = bluRay;
        this.proyector = proyector;
        this.sistemaSonido = sistemaSonido;
    }
    public void iniciarCine(){
        System.out.println("Iniciando el cine en casa: ");
        pantalla.bajar();
        sistemaSonido.encender();
        sistemaSonido.configurarVolumen(25);
        proyector.encender();
        bluRay.reproducir();
        System.out.println("A disfrutar de la peli");
    }
    public void terminarCine(){
        System.out.println("Terminando el cine en casa: ");
        bluRay.detener();
        proyector.apagar();
        sistemaSonido.apagar();
        pantalla.subir();
        System.out.println("Se terminó el cine");
    }
}
