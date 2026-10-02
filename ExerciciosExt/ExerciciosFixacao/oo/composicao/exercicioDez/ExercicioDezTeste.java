package oo.composicao.exercicioDez;

public class ExercicioDezTeste {
    public static void main(String[] args) {

        Playlist playlist = new Playlist("Estudos");
        Playlist playlist2 = new Playlist("Outra");
        Musica m1 = new Musica("Peito sadio", 150);
        Musica m2 = new Musica("Evidências", 160);
        Musica m3 = new Musica("Estrada da vida", 130);

        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);
        playlist.adicionarMusica(m3);

        System.out.println(playlist.calcularDuracaoTotal());
        System.out.println(playlist.maisLonga());

        Musica m4 = new Musica("Podcast", 600);

        playlist.adicionarMusica(m4);

        System.out.println(playlist.calcularDuracaoTotal());
        System.out.println(playlist.maisLonga());

        System.out.println(playlist2.calcularDuracaoTotal());
        System.out.println(playlist2.maisLonga());
    }
}
