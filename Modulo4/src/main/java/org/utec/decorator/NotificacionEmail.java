package org.utec.decorator;

public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviar notificación por email: " + mensaje);
    }
}
