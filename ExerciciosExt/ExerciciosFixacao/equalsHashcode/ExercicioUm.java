package equalsHashcode;

import java.util.Objects;

public class ExercicioUm {
    String nome;
    int codigo;

    ExercicioUm(String nome, int codigo){

        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExercicioUm that = (ExercicioUm) o;
        return codigo == that.codigo && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo);
    }
}
