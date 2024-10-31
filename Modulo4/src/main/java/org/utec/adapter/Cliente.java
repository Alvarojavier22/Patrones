package org.utec.adapter;

public class Cliente {
    public static void main(String[] args) {

        EnchufeAmericano enchufeAmericano = new EnchufeAmericano();
        EnchufeEuropeo adaptador = new AdaptadorAmericanoEuropeo(enchufeAmericano);
        adaptador.conectar();
    }
}
