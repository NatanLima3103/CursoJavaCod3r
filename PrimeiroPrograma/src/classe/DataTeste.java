package classe;

public class DataTeste {

    public static void main (String[] args) {

        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2021;

        Data d2 = new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2020;

        String dataFormatada1 = d1.obterDataFormatada();
        String dataFormatada2 = d2.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(dataFormatada2);

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
