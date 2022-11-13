package br.inatel.cdg.serie.impl;

import br.inatel.cdg.serie.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isUpperCase;

public class Observavel implements iObservavel {

    private int cont_caractere, cont_maiuscula, cont_palavra;
    private List<Observador> palavras;

    public Observavel(){ palavras = new ArrayList<Observador>(); }

    @Override
    public void registraObservador(Observador obs) {palavras.add(obs);}

    @Override
    public void removeObservador(Observador obs) {
        if (palavras.contains(obs))
            palavras.remove(obs);
    }

    @Override
    public void notificaObservadores() {

        for(Observador observador : palavras){
            observador.update(this);
        }

    }

    public int conta_palavras(String frase){
        this.cont_palavra = frase.split(" ", -1).length;      //pega a quantidade de espaços em branco
        String aux2[] = new String[cont_palavra];                //define o vetor que conterá as palavras separadas da string
        aux2 = frase.split(" ");//separa a string colocando as palavras no vetor
        return(this.cont_palavra + 1);
    }

    public int conta_maiusculas(String frase){
        this.cont_maiuscula = 0;
        for (int i = 0; i < frase.codePointCount(0, frase.length()); i++) { // para todos os caracteres da string
            int c = frase.codePointAt(i); // pegar o caractere
            if (isUpperCase(c)) {
                this.cont_maiuscula++;
            }
        }
        return this.cont_maiuscula;
    }

    public int conta_caracter(String frase) {
        this.cont_caractere = frase.length();
        int contador_caracter = this.cont_caractere;
        if (contador_caracter % 2 == 0) {
            return this.cont_caractere;
        } else {
            System.out.println("A frase contém quantidade de caracteres impar");
        }
        return contador_caracter;
    }


    private void novasMedidas() {
        notificaObservadores();
    }


    public int getCont_caractere() {
        return cont_caractere;
    }

    public void setCont_caractere(int cont_caractere) {
        this.cont_caractere = cont_caractere;
    }

    public int getCont_maiuscula() {
        return cont_maiuscula;
    }

    public void setCont_maiuscula(int cont_maiuscula) {
        this.cont_maiuscula = cont_maiuscula;
    }

    public int getCont_palavra() {return cont_palavra;}

    public void setCont_palavra(int cont_palavra) {
        this.cont_palavra = cont_palavra;
    }

    public List<Observador> getPalavras() {
        return palavras;
    }

    public void setPalavras(List<Observador> palavras) {
        this.palavras = palavras;
    }


}




