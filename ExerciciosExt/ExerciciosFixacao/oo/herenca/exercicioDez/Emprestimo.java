package oo.herenca.exercicioDez;

public class Emprestimo {

    String livro;
    int diasAtraso;
    double multaPorDia;

    Emprestimo(String livro, int diasAtraso, double multaPorDia){
        this.livro = livro;
        this.diasAtraso = diasAtraso;
        this.multaPorDia = multaPorDia;
    }

    double calcularMulta(){

        return diasAtraso * multaPorDia;
    }

    String resumo(){

        return livro + " - multa: R$ " + calcularMulta();
    }
}
