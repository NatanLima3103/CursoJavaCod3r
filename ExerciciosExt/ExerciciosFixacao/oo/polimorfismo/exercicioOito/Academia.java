package oo.polimorfismo.exercicioOito;

import java.util.HashMap;
import java.util.Map;

public class Academia {
    private Map<String, Plano> alunos = new HashMap<>();

    public void matricular(String matricula, Plano plano){
        alunos.put(matricula, plano);
    }

    public double consultarMensalidade(String matricula){
        if (alunos.containsKey(matricula)){
            Plano p = alunos.get(matricula);
            return p.calcularMensalidade();
        }
        return -1.0;
    }

    public double calcularFaturamento(){
        double total = 0;

        for (Plano p : alunos.values()){
            total += p.calcularMensalidade();
        }

        return total;
    }
}
