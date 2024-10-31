package org.utec.proxy;

import javax.print.Doc;

public class Cliente {
    public static void main(String[] args) {

        Documento documento = new Documento("Este es el documento confidencial numero 1");

        System.out.println("Caso 1: Usuario con permisos: ");
        ProxyDocumento proxiDocumentoConPermiso = new ProxyDocumento(documento, true);
        proxiDocumentoConPermiso.verContenido();

        System.out.println();

        System.out.println("Caso 2: Usuario sin permisos: ");
        ProxyDocumento proxiDocumentoSinPermiso = new ProxyDocumento(documento, false);
        proxiDocumentoSinPermiso.verContenido();
    }

}
