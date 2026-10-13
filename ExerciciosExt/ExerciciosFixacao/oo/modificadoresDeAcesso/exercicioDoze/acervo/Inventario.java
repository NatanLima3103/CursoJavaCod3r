package oo.modificadoresDeAcesso.exercicioDoze.acervo;

public class Inventario {
    public void emprestar(Item i){
        if(i.temCopia()){
            i.copias = i.copias - 1;
            System.out.println("Emprestado: " + i.titulo);
        } else {
            System.out.println("Sem cópias: " + i.titulo);
        }
    }
}
