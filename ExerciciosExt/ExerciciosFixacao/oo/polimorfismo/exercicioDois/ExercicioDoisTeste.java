package oo.polimorfismo.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDoisTeste {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Natan", 5000));
        funcionarios.add(new Desenvolvedor("Lima", 4000.0, 10));
        funcionarios.add(new Estagiario("Aline", 1500. ));

        double folhaSalarial = 0;

        for (Funcionario f : funcionarios){
            double salarioVoltaAtual = f.calcularSalario();
            System.out.println("Funcionario: " + f.getNome() + ", salário: " + salarioVoltaAtual);

            folhaSalarial += salarioVoltaAtual;
        }

        System.out.println("Valor da folha salarial: " + folhaSalarial);
    }
}
