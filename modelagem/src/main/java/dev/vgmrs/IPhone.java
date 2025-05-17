package dev.vgmrs;

import dev.vgmrs.interfaces.AparelhoTelefonico;
import dev.vgmrs.interfaces.NavegadorInternet;
import dev.vgmrs.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {

    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Página " + url + " sendo exibida");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " sendo reproduzida");
    }
}