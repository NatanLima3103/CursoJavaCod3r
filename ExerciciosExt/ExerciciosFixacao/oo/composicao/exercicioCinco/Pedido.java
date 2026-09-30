package oo.composicao.exercicioCinco;

public class Pedido {

    String descricao;
    Pagamento pagamento;

    Pedido (String descricao, Pagamento pagamento){
        this.descricao = descricao;
        this.pagamento = pagamento;
    }

    String pagar(double valorRecebido){
        if(pagamento.pagar(valorRecebido)){
            return "Pagamento aprovado.";
        }else {
            return "Valor insuficiente";
        }
    }

    String status(){
        if(pagamento.pago){
            return descricao + " pago (R$ " + pagamento.valor + ").";
        } else {
            return descricao + " aguardando pagamento (R$ " + pagamento.valor + ").";
        }
    }
}
