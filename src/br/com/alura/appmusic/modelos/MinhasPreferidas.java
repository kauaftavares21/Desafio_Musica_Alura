package br.com.alura.appmusic.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        String mensagemPrincipal;

        if (audio.getClassificacao() >= 8) {
            mensagemPrincipal = "Todo mundo está curtindo O " + audio.getTitulo() ;
        } else {
            mensagemPrincipal = audio.getTitulo() +  " é considerado sucesso absoluto entre nossos ouvintes!";
        }

        System.out.println(mensagemPrincipal);

        if (audio instanceof Podcast podcast) {
            System.out.println("Esse Podcast é apresentado pelo " + podcast.getApresentador());
        } else if (audio instanceof Musica musica) {
            System.out.println("Esse sucesso é cantado pelo " + musica.getCantor());
        }
    }
}
