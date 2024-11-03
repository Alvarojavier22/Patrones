package org.utec.decorator;

public class NotificacionDecorator implements Notificacion {

    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);

    }
}
