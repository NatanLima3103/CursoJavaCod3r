package classe;

public class Carro {

    String modelo;
    double velocidadeAtual;

    public void acelerar(double incremento){
        if (velocidadeAtual + incremento > velocidadeAtual) {
            System.out.println("O carro acelerou");
        } else {
            System.out.println("O carro está em uma velocidade constante.");
        }

    }

    public void frear(double decremento) {
        if (velocidadeAtual - decremento < velocidadeAtual) {
            System.out.println("O carro está freando");
        } else {
            System.out.println("O carro está em uma velocidade constante.");
        }

    }
}
