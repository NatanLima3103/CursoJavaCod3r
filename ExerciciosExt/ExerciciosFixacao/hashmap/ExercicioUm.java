package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<Integer, String> funcionarios = new HashMap();

        funcionarios.put(1, "Natan");
        funcionarios.put(2, "Lima");
        funcionarios.put(3, "Aline");
        funcionarios.put(4, "Fiori");

        System.out.println("Informe um número de matrícula: ");
        int numMatricula = entrada.nextInt();

        if(funcionarios.containsKey(numMatricula)){
            System.out.println("O funcionário é o(a): " + funcionarios.get(numMatricula));
        } else {
            System.out.println("O número da matrícula informado está incorreto, tente outro número: ");
        }
    }
}
