package br.inatel.cdg.teste.ordenacao;

import br.inatel.cdg.sorts.Ordenacao;
import br.inatel.cdg.sorts.OrdenacaoBubble;
import br.inatel.cdg.sorts.OrdenacaoInsertion;
import br.inatel.cdg.sorts.OrdenacaoQuick;
import br.inatel.cdg.sorts.strategy.impl.BubbleSort;
import br.inatel.cdg.sorts.strategy.impl.InsertionSort;
import br.inatel.cdg.sorts.strategy.impl.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TesteOrdenacaodeAlgoritmos {

    Ordenacao ordenacao;

    @Test
    public void testeBubbleSort(){
        ordenacao = new OrdenacaoBubble();
        int[] v = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
        int[] x = ordenacao.sort(v);
        int[] e = {0,1,2,3,4,5,6,7,8,9};
        assertEquals(e[1],x[1]);

    }

    @Test
    public void testeOrdenacaoQuick(){
        ordenacao = new OrdenacaoQuick();
        int[] v = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
        int[] x = ordenacao.quick_sort(v,0,0);
        int[] e = {0,1,2,3,4,5,6,7,8,9};
        assertEquals(e[1],x[1]);
    }

    @Test
    public void testeQuickSort(){
        ordenacao = new OrdenacaoQuick();
        assertTrue(ordenacao.getStrategy() instanceof QuickSort);
    }

    @Test
    public void testeInsertionSort(){
        ordenacao = new OrdenacaoInsertion();
        int[] v = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
        int[] x = ordenacao.insertionsort(v);
        int[] e = {0,1,2,3,4,5,6,7,8,9};
        assertEquals(e[0],x[0]);
    }
}
