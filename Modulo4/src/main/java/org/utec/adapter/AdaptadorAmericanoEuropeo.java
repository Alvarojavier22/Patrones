package org.utec.adapter;

public class AdaptadorAmericanoEuropeo implements EnchufeEuropeo{

    private EnchufeAmericano enchufeAmericano;

    public AdaptadorAmericanoEuropeo(EnchufeAmericano enchufe) {
        this.enchufeAmericano = enchufe;
    }
    @Override
    public void conectar() {
        enchufeAmericano.enchufar();
    }
}
