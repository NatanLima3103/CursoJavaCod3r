package lambda.consumer.exercicioDez;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Transportadora {

    public static void processar(List<Encomenda> encomendas, List<Consumer<Encomenda>> etapas) {
        encomendas.forEach(encomenda ->
                etapas.forEach(etapa -> etapa.accept(encomenda)));
    }

    public static void main(String[] args){
        List<Encomenda> encomendas = new ArrayList<>();

        encomendas.add(new Encomenda("BR001", 2.0));
        encomendas.add(new Encomenda("BR002", 12.5));
        encomendas.add(new Encomenda("BR003", 8.0));
        encomendas.add(new Encomenda("BR004", 20.0));

        Painel painel = new Painel();

        List<Consumer<Encomenda>> etapas = new ArrayList<>();

        etapas.add(e -> {
            e.setFrete(e.getPeso() * 5.0);
            if (e.getPeso() > 10){
                e.setFrete(e.getFrete() + 15.0);
            }
        });

        etapas.add( e -> {
            if (e.getFrete() > 0){
                e.setStatus("DESPACHADA");
            }
        });

        etapas.add(e -> {
           if (e.getStatus().equals("DESPACHADA")){
               painel.registrar(e.getFrete());
           }
        });

        etapas.add(e -> System.out.println(e.getCodigo() + " | " + e.getStatus() + " | frete R$ " + e.getFrete()));

        processar(encomendas, etapas);

        System.out.println("Despachadas: " + painel.getDespachadas() + " | Total de frete: R$ " + painel.getTotalFrete());
    }
}
