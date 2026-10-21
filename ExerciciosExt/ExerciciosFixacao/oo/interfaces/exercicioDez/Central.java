package oo.interfaces.exercicioDez;

import java.util.ArrayList;
import java.util.List;

public class Central {
    List<Canal> canais;

    public Central(){
        canais = new ArrayList<>();
    }

    void registrar(Canal canal){
        canais.add(canal);
    }


    void disparar(String mensagem){
        int contadorEnviados = 0;
        double custoTotal = 0;
        int falhas = 0;
        System.out.println("Disparando: " + mensagem);
        for (Canal canal : canais){
            boolean ok = canal.enviar(mensagem);
            if (ok){
                System.out.println(canal.getNome() + ": enviado");
                contadorEnviados++;
                custoTotal += canal.getCustoCentavos();
            } else {
                System.out.println(canal.getNome() + ": falhou");
                falhas++;
            }
        }
        System.out.println("Enviados: " + contadorEnviados + " | Falhas: " + falhas + " | Custo: " + custoTotal + " centavos");
    }
}
