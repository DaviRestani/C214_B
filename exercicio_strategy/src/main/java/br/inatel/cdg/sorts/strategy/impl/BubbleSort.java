package br.inatel.cdg.sorts.strategy.impl;

import br.inatel.cdg.sorts.Strategy;

public class BubbleSort implements Strategy {
    @Override
    public int[] sort(int[] v) {
        for(int i = 0; i < v.length - 1; i++) {
            for(int j = 0; j < v.length - 1 - i; j++) {
                if(v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        return v;
    }

    @Override
    public void quick_sort(int[] vetor, int inicio, int fim) {

    }

    @Override
    public int[] merge_sort(int[] numbers, int p, int q, int r) {
        return new int[0];
    }

    @Override
    public int[] insertionsort(int[] vetor) {
        return new int[0];
    }
}
