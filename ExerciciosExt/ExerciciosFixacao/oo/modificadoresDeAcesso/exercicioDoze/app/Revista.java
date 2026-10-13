package oo.modificadoresDeAcesso.exercicioDoze.app;

import oo.modificadoresDeAcesso.exercicioDoze.acervo.Item;

public class Revista extends Item {
    public Revista(String titulo, int copias, int codigoInterno){
        super(titulo, copias, codigoInterno);
    }

    public String statusVenda(){
        if (temCopia()){
            return titulo + " à venda";
        }
        return titulo + " esgotada";
    }
}
