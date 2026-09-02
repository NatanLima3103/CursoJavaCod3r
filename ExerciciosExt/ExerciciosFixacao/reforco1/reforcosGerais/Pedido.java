package ExerciciosFixacao.reforco1.reforcosGerais;

public class Pedido {

    String descricao;
    double valor;
    static double valorTotalPedidos = 0;

    Pedido(String descricao, double valor){

        this.descricao = descricao;
        this.valor = valor;
        valorTotalPedidos = valorTotalPedidos + valor;
    }
}
