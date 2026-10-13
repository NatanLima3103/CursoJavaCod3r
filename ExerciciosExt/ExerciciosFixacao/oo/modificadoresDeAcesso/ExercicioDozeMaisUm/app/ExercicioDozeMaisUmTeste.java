package oo.modificadoresDeAcesso.ExercicioDozeMaisUm.app;

import oo.modificadoresDeAcesso.ExercicioDozeMaisUm.controle.Catraca;
import oo.modificadoresDeAcesso.ExercicioDozeMaisUm.controle.Manutencao;

public class ExercicioDozeMaisUmTeste {
    public static void main(String[] args) {
        Catraca c = new Catraca();
        CatracaVip v = new CatracaVip();
        Manutencao m = new Manutencao();

        c.passar();
        c.passar();
        c.travar();
        c.passar();

        m.testar(c);
        v.passarVip();
    }
}
