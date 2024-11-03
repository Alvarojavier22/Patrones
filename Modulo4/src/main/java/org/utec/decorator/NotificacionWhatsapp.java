package org.utec.decorator;

public class NotificacionWhatsapp extends NotificacionDecorator{

    public NotificacionWhatsapp(Notificacion notificacion) {
        super(notificacion);
    }
    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificación por Whatsapp: " + mensaje);
    }

}
