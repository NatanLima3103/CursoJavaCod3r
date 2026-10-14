package oo.gettersESetters.exercicioCinco;

import java.util.ArrayList;

public class Academia {
    public static void main(String[] args) {

        Membro natan = new Membro();
        natan.setNome("Natan");
        natan.setMensalidade(90.0);
        natan.setAtivo(true);

        Membro lima = new Membro();
        lima.setNome("Lima");
        lima.setMensalidade(120.0);
        lima.setAtivo(true);

        Membro aline = new Membro();
        aline.setNome("Aline");
        aline.setMensalidade(90.0);
        aline.setAtivo(true);

        aline.setAtivo(false);

        Membro fiori = new Membro();
        fiori.setNome("Fiori");
        fiori.setMensalidade(150.0);
        fiori.setAtivo(false);

        ArrayList<Membro> membros = new ArrayList<>();
        membros.add(natan);
        membros.add(lima);
        membros.add(aline);
        membros.add(fiori);

        double somaReceita = 0;
        int numAtivos = 0;
        int numInativos = 0;

        for (Membro m : membros){
            if (m.isAtivo()){
                numAtivos++;
                somaReceita = somaReceita + m.getMensalidade();
            } else {
                numInativos++;
            }
            System.out.println("Nome: " + m.getNome() + ", mensalidade: " + m.getMensalidade() + ", está ativo? " + m.isAtivo());
        }
        System.out.println("Soma total da receita: " + somaReceita);
        System.out.println("Membros ativos: " + numAtivos);
        System.out.println("Membros inativos: " + numInativos);
    }
}
