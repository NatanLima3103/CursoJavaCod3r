package stream.match.exercicioCinco;

import java.util.ArrayList;
import java.util.List;

public class MonitorUsina {

    public static void main(String[] args) {
        List<Painel> paineis = new ArrayList<>();

        paineis.add(new Painel("SP-001", 8.5, 2019, true));
        paineis.add(new Painel("SP-002", 3.2, 2021, true));
        paineis.add(new Painel("SP-003", 9.0, 2018, false));
        paineis.add(new Painel("SP-004", 6.4, 2022, true));

        System.out.println("=== MONITORAMENTO DE PAINEIS ===");
        boolean algumAtivoFraco = paineis.stream()
                .filter(i -> i.isAtivo())
                .anyMatch(i -> i.getGeracaoKwh() < 5);

        System.out.println("Algum painel ativo gerando abaixo de 5 kWh? " + algumAtivoFraco);

        boolean padraoOk = paineis.stream()
                .map(i -> i.getCodigo())
                .allMatch(i -> i.startsWith("SP-"));

        System.out.println("Todos os codigos no padrao SP-? " + padraoOk);

        boolean antigosTodosAcimaDeCem = paineis.stream()
                .filter(i -> i.getAnoInstalacao() < 2010)
                .allMatch(i -> i.getGeracaoKwh() > 100.0);

        boolean antigosAlgumAcimaDeCem = paineis.stream()
                .filter(i -> i.getAnoInstalacao() < 2010)
                .anyMatch(i -> i.getGeracaoKwh() > 100.0);

        System.out.println("Antigos: todos acima de 100 kWh? " + antigosTodosAcimaDeCem);
        System.out.println("Antigos: existe algum acima de 100 kWh? " + antigosAlgumAcimaDeCem);

        boolean nenhuAtivoForte = paineis.stream()
                .filter(i -> i.isAtivo())
                .map(i -> i.getGeracaoKwh())
                .noneMatch(i -> i > 10.0);

        System.out.println("Nenhum painel ativo acima de 10 kWh? " + nenhuAtivoForte);
    }
}
