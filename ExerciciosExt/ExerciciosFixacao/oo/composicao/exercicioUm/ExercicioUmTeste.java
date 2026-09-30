package oo.composicao.exercicioUm;

public class ExercicioUmTeste {
    public static void main(String[] args) {

        Motor m = new Motor();
        m.cavalos = 115;

        Carro c = new Carro("Symbol", m);
        System.out.println(m.ligado);
        System.out.println(c.ligarCarro());
        System.out.println(m.ligado);
        System.out.println(c.desligarCarro());
        System.out.println(m.ligado);
    }
}
