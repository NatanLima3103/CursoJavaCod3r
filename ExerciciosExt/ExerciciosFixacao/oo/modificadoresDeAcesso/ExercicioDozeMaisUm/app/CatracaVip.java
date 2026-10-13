package oo.modificadoresDeAcesso.ExercicioDozeMaisUm.app;

import oo.modificadoresDeAcesso.ExercicioDozeMaisUm.controle.Catraca;

public class CatracaVip extends Catraca {

    public CatracaVip(){

    }

    public void passarVip(){
        registrar();
        System.out.println("VIP: " + passagens);
    }
}
