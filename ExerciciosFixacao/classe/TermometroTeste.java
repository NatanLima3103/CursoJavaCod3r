package classe;

public class TermometroTeste {

    public static void main(String [] args) {

        Termometro t1 = new Termometro();
        t1.temperaturaCelsius = 25.0;

        System.out.println(t1.converterParaFahrenheit());
    }
}
