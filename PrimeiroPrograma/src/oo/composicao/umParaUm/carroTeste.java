package oo.composicao.umParaUm;

public class carroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("Está ligado? " + c1.estarLigado());

        c1.ligar();
        System.out.println("Está ligado? " + c1.estarLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Faltou Encapsulamento!!!
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.giros());

        // Relação bidimensional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
