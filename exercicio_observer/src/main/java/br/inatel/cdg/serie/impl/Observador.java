package br.inatel.cdg.serie.impl;

import br.inatel.cdg.serie.interfaces.iObservador;

public class Observador implements iObservador {

    private int cont_caractere, cont_maiuscula, cont_palavra;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel palavra){
        System.out.println("Usuario: "+this.id);
        System.out.println("Quantidade de caracteres: " + palavra.getCont_caractere());
        System.out.println("Letras Maiusculas: " + palavra.getCont_maiuscula());
        System.out.println("Quantidade de palavras: " + palavra.getCont_palavra());
    }
}
