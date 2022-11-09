package br.inatel.cdg.sorts;

import br.inatel.cdg.sorts.strategy.impl.MergeSort;

public class OrdenacaoMerge extends Ordenacao{

    public OrdenacaoMerge(){strategy = new MergeSort();}
}
