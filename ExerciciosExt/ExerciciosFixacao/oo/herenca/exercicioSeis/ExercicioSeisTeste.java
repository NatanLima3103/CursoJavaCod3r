package oo.herenca.exercicioSeis;

public class ExercicioSeisTeste {

    public static void main(String[] args) {

        Ingresso i1 = new Ingresso("Show", 100);
        IngressoMeia i2 = new IngressoMeia("Show", 100);
        IngressoVip i3 = new IngressoVip("Show", 100.0, "Open bar");

        System.out.println(i1.detalhes());
        System.out.println(i2.detalhes());
        System.out.println(i3.detalhes());
    }
}
