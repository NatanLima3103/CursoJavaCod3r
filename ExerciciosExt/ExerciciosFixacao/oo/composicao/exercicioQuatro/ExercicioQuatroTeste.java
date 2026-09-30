package oo.composicao.exercicioQuatro;

public class ExercicioQuatroTeste {

    public static void main(String[] args) {

        Bateria b1 = new Bateria(20);
        Celular c1 = new Celular("Iphone 14 plus", b1);

        System.out.println(c1.usar(5));
        System.out.println(c1.usar(30));
        System.out.println(c1.usar(10));
        b1.carregar();
        System.out.println(c1.usar(15));
        System.out.println(b1.nivel);
    }
}
