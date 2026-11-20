package stream.map.exercicioDez;

public class Consulta {

    private String paciente;
    private String especialidade;
    private double valorBase;
    private boolean retorno;

    public Consulta(String paciente, String especialidade, double valorBase, boolean retorno){
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.valorBase = valorBase;
        this.retorno = retorno;
    }

    public String getPaciente(){
        return paciente;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public double getValorBase(){
        return valorBase;
    }

    public boolean isRetorno(){
        return retorno;
    }
}
