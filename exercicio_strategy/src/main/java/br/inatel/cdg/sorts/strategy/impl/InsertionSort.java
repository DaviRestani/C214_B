package br.inatel.cdg.sorts.strategy.impl;

import br.inatel.cdg.sorts.Strategy;

public class InsertionSort implements Strategy{

    @Override
    public int[] insertionsort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        return vetor;
    }

    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }

    @Override
    public void quick_sort(int[] vetor, int inicio, int fim) {

    }

    @Override
    public int[] merge_sort(int[] numbers, int p, int q, int r) {
        return new int[0];
    }

}
