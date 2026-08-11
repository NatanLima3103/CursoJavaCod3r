package classe;

/* Crie uma classe Retangulo com atributos largura e altura (double).
Adicione um método chamado calcularArea() que retorna o resultado
(largura × altura), em vez de só imprimir. No teste,
crie um objeto, defina largura e altura, chame o método
e imprima o valor retornado. */

public class Retangulo {

    double largura;
    double altura;

    public double calcularArea() {
        return altura * largura;
    }
}
