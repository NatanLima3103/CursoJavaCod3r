package oo.composicao.exercicioQuatorze;

public class ExercicioQuatorzeTeste {

    public static void main(String[] args) {

        Tecnico t1 = new Tecnico("Natan", 35);
        Jogador j1 = new Jogador("Lima", 80);
        Jogador j2 = new Jogador("Aline", 150);
        Jogador j3 = new Jogador("Fiori", 97);

        Time time1 = new Time("Coritiba", t1);

        time1.adicionarJogador(j1);
        time1.adicionarJogador(j2);
        time1.adicionarJogador(j3);

        System.out.println(time1.descrever());
        System.out.println(time1.artilheiro());
        System.out.println(time1.totalGols());
        System.out.println(time1.contarComGolsMinimos(50));

        j3.marcarGol();
        System.out.println(time1.artilheiro());

        Time time2 = new Time("Reservas", t1);

        System.out.println(time2.totalGols());
        System.out.println(time2.artilheiro());

        t1.titulos = 36;

        System.out.println(time1.descrever());
        System.out.println(time2.descrever());
    }
}
