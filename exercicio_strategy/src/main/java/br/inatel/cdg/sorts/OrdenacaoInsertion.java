package br.inatel.cdg.sorts;

import br.inatel.cdg.sorts.strategy.impl.InsertionSort;

public class OrdenacaoInsertion extends Ordenacao{

    public OrdenacaoInsertion(){strategy = new InsertionSort();}

}
