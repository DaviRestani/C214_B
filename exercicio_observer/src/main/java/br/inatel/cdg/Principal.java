package br.inatel.cdg;

import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;

public class Principal {
    public static void main(String[] args) {

        Observavel frase = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        frase.registraObservador(obs1);
        frase.registraObservador(obs2);
        frase.registraObservador(obs3);

        frase.conta_palavras("Inatel");
        frase.conta_maiusculas("Inatel");
        frase.conta_caracter("Inatel");

        frase.removeObservador(obs3);
        frase.notificaObservadores();

        System.out.println("------------------------------------------------------");
        frase.conta_maiusculas("Engenharia de Software");
        frase.conta_caracter("Engenharia de Software");
        frase.conta_palavras("Engenharia de Software");

        frase.notificaObservadores();


    }
}
