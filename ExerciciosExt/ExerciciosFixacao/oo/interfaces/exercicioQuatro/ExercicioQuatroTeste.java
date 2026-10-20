package oo.interfaces.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;

public class ExercicioQuatroTeste {
    public static void main(String[] args) {
        List<Validavel> lista = new ArrayList<>();

        lista.add(new Cpf("12345678901"));
        lista.add(new Email("natan.email.com"));
        lista.add(new Senha("abc123"));
        lista.add(new Email("natan@gmail.com"));
        lista.add(new Senha("senhaForte99"));

        int validos = 0;
        int invalidos = 0;

        for (Validavel v : lista){
            if (v.validar()){
                System.out.println(v.getCampo() + " válido");
                validos++;
            }else {
                System.out.println(v.getCampo() + " inválido");
                invalidos++;
            }
        }
        System.out.println("Válidos: " + validos + ", inválidos: " + invalidos);
    }
}
