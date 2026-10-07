package oo.herenca.exercicioUm;

public class Documento {

    String numero;
    String titular;

    Documento(String numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    String exibir(){

        return "Documento: " + numero + ", titular: " + titular;
    }
}
