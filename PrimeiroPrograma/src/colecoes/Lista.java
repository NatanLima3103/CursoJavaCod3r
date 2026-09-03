package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Natan");
        lista.add(new Usuario("Lima"));
        lista.add(new Usuario("Aline"));
        lista.add(new Usuario("Kety"));
        lista.add(new Usuario("Lucca"));

        System.out.println(lista.get(3).nome); // Acessar pelo índice

        System.out.println(">>>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Lucca")));

        System.out.println("Tem? " + lista.contains(new Usuario("Kety")));
        System.out.println("Tem? " + lista.contains(u1));

        for( Usuario u : lista){

            System.out.println(u.toString());
        }
    }
}
