package br.inatel.cdg.sorts;

import br.inatel.cdg.sorts.strategy.impl.QuickSort;

public class OrdenacaoQuick extends Ordenacao{

    public OrdenacaoQuick(){strategy = new QuickSort();}
}
