package br.inatel.cdg.sorts.strategy.impl;

import br.inatel.cdg.sorts.Strategy;

public class QuickSort implements Strategy{

    @Override
    public  void quick_sort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quick_sort(vetor, inicio, posicaoPivo - 1);
            quick_sort(vetor, posicaoPivo + 1, fim);
        }
    }

    @Override
    public int[] merge_sort(int[] numbers, int p, int q, int r) {
        return new int[0];
    }

    @Override
    public int[] insertionsort(int[] vetor) {
        return new int[0];
    }

    private  int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    @Override
    public int[] sort(int[] numbers) {

        return numbers;
    }

}
