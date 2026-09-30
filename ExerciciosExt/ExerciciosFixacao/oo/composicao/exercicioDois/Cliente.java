package oo.composicao.exercicioDois;

public class Cliente {

    String nome;
    Endereco endereco;

    Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    String descrever(){
        return nome + " mora na " + endereco.rua + ", " + endereco.numero + " na cidade de " + endereco.cidade + ". ";
    }
}
