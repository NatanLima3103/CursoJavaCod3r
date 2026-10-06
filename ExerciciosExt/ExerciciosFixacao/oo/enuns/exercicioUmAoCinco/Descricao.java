package oo.enuns.exercicioUmAoCinco;

public class Descricao {

    static String descricao(StatusPedido status) {
        switch (status){

            case PENDENTE:
                return "O pagamento está pendente, faça-o agora.";

            case PAGO:
                return "O pedido será enviado em breve.";

            case ENVIADO:
                return "O pedido já saiu do centro logístico.";

            case ENTREGUE:
                return "O pedido foi entregue.";

            default:
                return "Não foi possível verificar seu pedido";
        }

    }
}
