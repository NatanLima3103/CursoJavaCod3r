package oo.composicao.exercicioDois;

public class ExercicioDoisTeste {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua teste", 1234, "Curitiba");

        Cliente c1 = new Cliente("Natan", e1);

        System.out.println(c1.descrever());

        c1.endereco.rua = "Rua nova";
        System.out.println(c1.descrever());
        System.out.println(e1.rua);
    }
}
