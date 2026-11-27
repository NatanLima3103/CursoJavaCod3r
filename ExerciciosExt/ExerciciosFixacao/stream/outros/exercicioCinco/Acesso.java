package stream.outros.exercicioCinco;

import java.util.Objects;

public class Acesso {

    private String matricula;
    private String nome;
    private int hora;

    public Acesso(String matricula, String nome, int hora){
        this.matricula = matricula;
        this.nome = nome;
        this.hora = hora;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public int getHora(){
        return hora;
    }

    @Override
    public String toString() {
        return matricula + " - " + nome + " (" + hora + "h)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acesso outro = (Acesso) o;
        return Objects.equals(matricula, outro.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
