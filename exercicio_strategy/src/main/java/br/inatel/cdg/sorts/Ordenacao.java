package br.inatel.cdg.sorts;

public abstract class Ordenacao {

    //Composicao com instancia de Frete
    protected Strategy strategy;

    //Comportamento delegado
    public int[] sort(int[] numbers){
        return strategy.sort(numbers);
    }

    public int[] quick_sort(int[] numbers, int inicio, int fim){
        return strategy.sort(numbers);
    }

    public int[] insertionsort(int[] numbers){
        return strategy.sort(numbers);
    }



    //Getter e Setter
    public void setStrategy(Strategy strategy){this.strategy = strategy;}

    public Strategy getStrategy(){return strategy;}
}
