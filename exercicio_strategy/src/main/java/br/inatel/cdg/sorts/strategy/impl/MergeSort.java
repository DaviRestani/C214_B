package br.inatel.cdg.sorts.strategy.impl;

import br.inatel.cdg.sorts.Strategy;
import java.util.Arrays;

public class MergeSort implements Strategy{
    @Override
    public int[] merge_sort(int[] numbers, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // fill the left and right array
        for (int i = 0; i < n1; i++)
            L[i] = numbers[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = numbers[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        // for sorting in descending
        // use if(L[i] >= <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                numbers[k] = L[i];
                i++;
            } else {
                numbers[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            numbers[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            numbers[k] = M[j];
            j++;
            k++;
        }
        return numbers;
    }

    @Override
    public int[] insertionsort(int[] vetor) {
        return new int[0];
    }

    void mergeSort(int array[], int left, int right) {
        if (left < right) {

            // m is the point where the array is divided into two sub arrays
            int mid = (left + right) / 2;

            // recursive call to each sub arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted sub arrays
            merge_sort(array, left, mid, right);
        }
    }

    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }

    @Override
    public void quick_sort(int[] vetor, int inicio, int fim) {

    }



}
