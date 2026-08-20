package classe;

public class CarroTeste {

    public static void main (String[] args) {

        Carro renault = new Carro();
        renault.modelo = "Symbol";
        renault.velocidadeAtual = 200;

        renault.acelerar(50);
        System.out.println("A velocidade após a aceleração ficou em: " + renault.velocidadeAtual);

        renault.frear(250);
        System.out.println("A velocidade após a freada ficou em: " + renault.velocidadeAtual);
    }

}
