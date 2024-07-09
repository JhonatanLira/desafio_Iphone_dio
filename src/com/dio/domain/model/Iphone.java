package com.dio.domain.model;

import com.dio.domain.interface_.INavegador;
import com.dio.domain.interface_.IReprodutorMusical;
import com.dio.domain.interface_.ITelefone;

public class Iphone extends Smartphone implements IReprodutorMusical, ITelefone, INavegador {

    //Smartphone
    @Override
    public void ligar() {
        System.out.println("Iphone ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Iphone desligando...");
    }

    //Reprodutor musical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica ");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado música "+musica);
    }

    //Navegador
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exigindo página "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    //Telefone
    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para "+numero);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
