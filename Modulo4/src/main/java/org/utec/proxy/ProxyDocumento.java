package org.utec.proxy;

public class ProxyDocumento {

    private Documento documento;
    private boolean tienePermiso;

    public ProxyDocumento(Documento documento, boolean tienePermiso) {
        this.documento = documento;
        this.tienePermiso = tienePermiso;
    }
    public void verContenido(){
        if(tienePermiso){
            documento.verContenido();
        }else {
            System.out.println("No tiene permisos para ver el documento");
        }
    }
}
