package oo.modificadoresDeAcesso.exercicioNove;

public class Item {
    private String codigo;
    private int quantidade;

    public Item(String codigo){
        this.codigo = codigo;
        quantidade = 0;
    }

    public String getCodigo(){
        return codigo;
    }

    public void entrada(int q){
        if(q <= 0){
            System.out.println("Quantidade inválida: " + q);
        } else {
            quantidade = quantidade + q;
        }
    }

    public boolean saida(int q){
        if( q <= 0 || q > quantidade){
            System.out.println("Saída recusada: " + codigo);
            return false;
        }
        quantidade = quantidade - q;
        return true;
    }

    public boolean zerado(){
        return quantidade == 0;
    }

    public String resumo(){
        return codigo + " - qtd: " + quantidade;
    }
}
