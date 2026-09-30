package oo.composicao.exercicioQuatro;

public class Bateria {

    int nivel;

    Bateria(int nivel){
        this.nivel = nivel;
    }

    void gastar(int quantidade){
        nivel = nivel - quantidade;
        if(nivel <= 0) {
            nivel = 0;
        }
    }

    void carregar(){
        nivel = 100;
    }
}
