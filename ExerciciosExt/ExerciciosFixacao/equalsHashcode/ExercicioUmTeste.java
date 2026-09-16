package equalsHashcode;

public class ExercicioUmTeste {
    public static void main(String[] args) {
        ExercicioUm p1 = new ExercicioUm("Mouse", 100);
        ExercicioUm p2 = new ExercicioUm("Mouse", 100);

        System.out.println(p1.equals(p2));
    }
}
