package org.utec.decorator;

public class Cliente {

    public static void main(String[] args) {

        Notificacion notificacion = new NotificacionEmail();

        notificacion = new NotificacionSMS(notificacion);

        notificacion = new NotificacionWhatsapp(notificacion);

        notificacion.enviar("Tiene una nueva notificación.");
    }
}
