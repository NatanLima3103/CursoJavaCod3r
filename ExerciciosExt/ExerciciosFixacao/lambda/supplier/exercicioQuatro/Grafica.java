package lambda.supplier.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Grafica {

    public static List<Cracha> gerarLote(int quantidade, Supplier<Cracha> fabrica){
        List<Cracha> lote = new ArrayList<>();

        for (int i = 1; i <= quantidade; i++){
            lote.add(fabrica.get());
        }

        return lote;
    }

    public static void main(String[] args) {
        Supplier<Cracha> crachaVisitante = () -> new Cracha("Visitante", "Amarelo");
        Supplier<Cracha> crachaFuncionario = () -> new Cracha("Funcionário", "Azul");
        Supplier<Cracha> crachaDiretoria = () -> {
            Cracha c = new Cracha("Diretoria", "Preto");
            c.setAcessoTotal(true);
            return c;
        };

        List<Cracha> visitantes = gerarLote(3, crachaVisitante);
        List<Cracha> funcionarios = gerarLote(2, crachaFuncionario);
        List<Cracha> diretoria = gerarLote(1, crachaDiretoria);

        List<Cracha> todos = new ArrayList<>();

        todos.addAll(visitantes);
        todos.addAll(funcionarios);
        todos.addAll(diretoria);

        for (Cracha cracha : todos){
            System.out.println(cracha.getTipo() + " - " + cracha.getCor() + " - Acesso total: " +  cracha.isAcessoTotal());
        }

        System.out.println("Total de crachás: " + todos.size());
    }
}
