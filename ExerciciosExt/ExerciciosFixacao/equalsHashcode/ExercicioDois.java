package equalsHashcode;

import java.util.Objects;

public class ExercicioDois {

    String nome;
    int matricula;

    ExercicioDois(String nome, int matricula){

        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExercicioDois that = (ExercicioDois) o;
        return matricula == that.matricula && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}
