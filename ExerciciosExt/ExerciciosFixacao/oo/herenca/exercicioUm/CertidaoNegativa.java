package oo.herenca.exercicioUm;

public class CertidaoNegativa extends Documento{

    String orgaoEmissor;

    CertidaoNegativa(String orgaoEmissor, String numero, String titular){

        super(numero, titular);
        this.orgaoEmissor = orgaoEmissor;
    }
}
