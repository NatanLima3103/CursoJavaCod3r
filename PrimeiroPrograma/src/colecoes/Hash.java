package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Natan"));
        usuarios.add(new Usuario("Lima"));
        usuarios.add(new Usuario("Aline"));
        usuarios.add(new Usuario("Fiori"));

        boolean resultado = usuarios.contains(new Usuario("Aline"));
        System.out.println(resultado);
    }
}
