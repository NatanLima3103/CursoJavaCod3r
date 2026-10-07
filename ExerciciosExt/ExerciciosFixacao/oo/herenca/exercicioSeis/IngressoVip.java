package oo.herenca.exercicioSeis;

public class IngressoVip extends Ingresso{

    String beneficio;

    IngressoVip(String evento, double valor, String beneficio){

        super(evento, valor);
        this.beneficio = beneficio;
    }

    @Override
    String detalhes() {
        return super.detalhes() + " | VIP: " + beneficio;
    }
}
