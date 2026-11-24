package stream.match.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class VistoriaExtintores {

    public static void main(String[] args) {
        List<Extintor> extintores = new ArrayList<>();

        extintores.add(new Extintor("Recepcao", 6.0, true));
        extintores.add(new Extintor("Cozinha", 4.0, true));
        extintores.add(new Extintor("Garagem", 6.0, false));
        extintores.add(new Extintor("Almoxarifado", 5.0, true));

        System.out.println("=== VISTORIA DE EXTINTORES ===");

        boolean todosComCargaMinima = extintores.stream()
                .allMatch(e -> e.getCargaKg() >= 4.0);

        System.out.println("Todos com carga de 4kg ou mais? " + todosComCargaMinima);

        boolean existeSemLacre = extintores.stream()
                .anyMatch(e -> !e.isLacrado());

        System.out.println("Existe algum sem lacre? " + existeSemLacre);

        boolean nenhumNaGaragem = extintores.stream()
                .noneMatch(e -> e.getLocal().equals("Garagem"));

        System.out.println("Nenhum instalado na Garagem? " + nenhumNaGaragem);
    }
}
