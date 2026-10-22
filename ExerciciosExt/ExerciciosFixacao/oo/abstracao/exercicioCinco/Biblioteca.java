package oo.abstracao.exercicioCinco;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<ItemAcervo>acervos;

    public Biblioteca(){
        acervos = new ArrayList<>();
    }

    void registrar(ItemAcervo item){
        acervos.add(item);
    }

    boolean emprestar(String titulo){
        for (ItemAcervo acervo : acervos){
            if (acervo.getTitulo().equals(titulo)){
                return acervo.emprestar();
            }
        }
        return false;
    }

    double devolver(String titulo, int diasAtraso){
        for (ItemAcervo acervo : acervos){
            if (acervo.getTitulo().equals(titulo)){
                acervo.devolver();
                return acervo.calcularMulta(diasAtraso);
            }
        }
        return 0;
    }

    int contarDisponiveis(){
        int contador = 0;
        for (ItemAcervo acervo : acervos){
            if (!acervo.isEmprestado()){
                contador++;
            }
        }
        return contador;
    }
}
