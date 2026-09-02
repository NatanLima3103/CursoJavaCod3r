package ExerciciosFixacao.reforco1.reforcosGerais;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro("Symbol", "Natan Lima");
        Carro c2 = new Carro("Toro", "Ketney Ribeiro");

        System.out.println("Modelo do primeiro carro: " + c1.modelo);
        System.out.println("Proprietário do primeiro carro: " + c1.proprietario);
        System.out.println("Modelo do segundo carro: " + c2.modelo);
        System.out.println("Proprietário do segundo carro: " + c2.proprietario);
    }
}
