package br.com.iphone.application;

import br.com.iphone.application.AparelhoTelefonico;

public class AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}