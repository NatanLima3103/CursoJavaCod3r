package oo.gettersESetters.exercicioTres;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {

        Funcionario natan = new Funcionario();
        natan.setNome("Natan");
        natan.setSalario(3000.0);

        natan.setSalario(-500.0);

        Funcionario lima = new Funcionario();
        lima.setNome("Lima");
        lima.setSalario(4500.0);

        lima.setSalario(5000.0);

        Funcionario aline = new Funcionario();
        aline.setNome("Aline");
        aline.setSalario(0);

        Funcionario fiori = new Funcionario();
        fiori.setNome("Fiori");
        fiori.setSalario(2800.0);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(natan);
        funcionarios.add(lima);
        funcionarios.add(aline);
        funcionarios.add(fiori);

        double somaSalarios = 0;
        int contadorSalarios = 0;

        for (Funcionario f : funcionarios){
            System.out.println(f.getNome() + " - R$ " + f.getSalario());

            somaSalarios = somaSalarios + f.getSalario();

            if (f.getSalario() > 0){
                contadorSalarios++;
            }
        }

        System.out.println(somaSalarios);
        System.out.println(contadorSalarios);
    }
}
