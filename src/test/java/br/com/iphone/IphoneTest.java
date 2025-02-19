package br.com.iphone.test; // Altere o pacote

import br.com.iphone.application.Iphone;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        // Testando as funcionalidades do telefone
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando as funcionalidades do navegador
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Testando as funcionalidades do reprodutor musical
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocarMusica();
        iphone.pausarMusica();
    }
}