package oo.polimorfismo.exercicioNove;

public class ExercicioNoveTeste {
    public static void main(String[] args) {
        Sessao s1 = new Sessao("Carros");

        s1.vender(new Ingresso("Natan"));
        s1.vender(new IngressoMeia("Lima"));
        s1.vender(new IngressoVip("Aline"));
        s1.vender(new IngressoCortesia("Fiori"));
        s1.vender(new IngressoMeia("Lucca"));

        System.out.println("A conta de todos os ingressos: " + s1.contarIngressos());
        System.out.println("A conta de todos os pagantes: " + s1.contarPagantes());
        System.out.println("O valor arrecadado: " + s1.calcularArrecadacao());
    }
}
