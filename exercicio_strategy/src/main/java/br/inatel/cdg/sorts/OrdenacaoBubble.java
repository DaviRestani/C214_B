package br.inatel.cdg.sorts;

import br.inatel.cdg.sorts.strategy.impl.BubbleSort;

public class OrdenacaoBubble extends Ordenacao {

    public OrdenacaoBubble() {strategy = new BubbleSort();}
}
