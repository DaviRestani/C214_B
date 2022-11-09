package br.inatel.cdg.sorts;

public interface Strategy {
    public int[] sort(int[] numbers);
    public  void quick_sort(int[] vetor, int inicio, int fim);
    public int[] merge_sort(int[] numbers, int p, int q, int r);
    public int[] insertionsort(int[] vetor);

}
