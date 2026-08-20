package classe;

public class Carro {

    String modelo;
    double velocidadeAtual;

    public void acelerar(double incremento){
        velocidadeAtual = velocidadeAtual + incremento;

    }

    public void frear(double decremento) {
        if (velocidadeAtual - decremento < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual = velocidadeAtual - decremento;
        }

    }
}
