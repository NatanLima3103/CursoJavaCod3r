package oo.gettersESetters.exercicioOito;

import java.util.ArrayList;

public class Livraria {
    public static void main(String[] args) {

        Livro javaBasico = new Livro();
        javaBasico.setTitulo("Java Básico");
        javaBasico.setPaginas(250);
        javaBasico.setPreco(80.0);

        Livro bd = new Livro();
        bd.setTitulo("Banco de Dados");
        bd.setPaginas(420);
        bd.setPreco(120.0);

        Livro redes = new Livro();
        redes.setTitulo("Redes");
        redes.setPaginas(380);
        redes.setPreco(95.0);

        Livro alg = new Livro();
        alg.setTitulo("Algoritimos");
        alg.setPaginas(150);
        alg.setPreco(60.0);

        Livro arq = new Livro();
        arq.setTitulo("Arquitetura de Software");
        arq.setPaginas(510);
        arq.setPreco(150.0);

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(javaBasico);
        livros.add(bd);
        livros.add(redes);
        livros.add(alg);
        livros.add(arq);

        int contadorLivros = 0;
        double totalLivrosGrossos = 0;
        String nomeMaisCaro = "Não foi possível verificar.";
        double precoMaisCaro = 0;

        for (Livro l : livros){
            System.out.println("Título: " + l.getTitulo() + ", páginas: " + l.getPaginas() + ", preço: " + l.getPreco());

            if (l.getPaginas() > 300){
                totalLivrosGrossos = totalLivrosGrossos + l.getPreco();
                contadorLivros++;
            }

            if (l.getPreco() > precoMaisCaro){
                precoMaisCaro = l.getPreco();
                nomeMaisCaro = l.getTitulo();
            }
        }

        System.out.println("Quantidade de livros grossos: " + contadorLivros);
        System.out.println("Soma de preços dos livros grossos: " + totalLivrosGrossos);
        System.out.println("O livro mais caro foi: " + nomeMaisCaro + ", valor: " + precoMaisCaro);
    }
}
