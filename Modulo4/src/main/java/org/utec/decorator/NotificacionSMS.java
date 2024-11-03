package org.utec.decorator;

public class NotificacionSMS extends NotificacionDecorator {

    public NotificacionSMS(Notificacion notificacion) {
        super (notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}
