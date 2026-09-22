package oo.heranca;

public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao){
        switch (direcao){
            case NORTE:
                y--;
            case LESTE:;
                x++;
            case SUL:
                y++;
            case OESTE:
                x--;
        }
        return true;
    }
}
