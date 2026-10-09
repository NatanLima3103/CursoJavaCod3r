package oo.modificadoresDeAcesso.exercicioSeis;

public class Jogador {
    private String nome;
    private int pontos;
    private int nivel;
    private boolean ativo;

    public Jogador(String nome){
        this.nome = nome;
        pontos = 0;
        nivel = 1;
        ativo = true;
    }

    private boolean pontosValidos(int p){
        return p > 0 && p <= 100;
    }

    private void verificarNivel(){
        if(pontos >= 100 && nivel == 1){
            nivel = 2;
            System.out.println("Subiu de nível: " + nome);
        } else if (pontos >= 250 && nivel == 2) {
            nivel = 3;
            System.out.println("Subiu de nível: " + nome);
        }
    }

    public void ganharPontos(int p){
        if (!ativo){
            System.out.println("Jogador inativo: " + nome);
        } else if (!pontosValidos(p)) {
            System.out.println("Pontos inválidos: " + p);
        } else {
             pontos = pontos + p;
             verificarNivel();
        }
    }

    public void desativar(){
        ativo = false;
    }

    public String resumo(){
        return nome + " - pontos: " + pontos + " - nível: " + nivel + " - ativo: " + ativo;
    }
}
