package oo.polimorfismo.exercicioOito;

public class ExercicioOitoTeste {
    public static void main(String[] args) {
        Academia a1 = new Academia();

        a1.matricular("M001", new PlanoBasico("Natan", 80.0));
        a1.matricular("M002", new PlanoPremium("Lima", 120.0));
        a1.matricular("M003", new PlanoFamiliar("Aline", 150, 3));

        System.out.println(a1.consultarMensalidade("M001"));
        System.out.println(a1.consultarMensalidade("M999"));
        System.out.println(a1.calcularFaturamento());
    }
}
