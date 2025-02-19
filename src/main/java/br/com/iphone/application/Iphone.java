package br.com.iphone.application;
public class Iphone {

    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;
    private ReprodutorMusical reprodutorMusical;

    public Iphone() {
        telefone = new AparelhoTelefonico();
        navegador = new NavegadorInternet();
        reprodutorMusical = new ReprodutorMusical();
    }

    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    public void atender() {
        telefone.atender();
    }

    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }
}
