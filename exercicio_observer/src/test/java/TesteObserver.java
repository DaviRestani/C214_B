import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testaInscritos(){
        Observavel palavra = new Observavel();
        Observador ob1 = new Observador(1);
        palavra.registraObservador(ob1);
        assertFalse(palavra.getPalavras().isEmpty());
    }

    @Test
    public void testa2inscritos(){
        Observavel palavra = new Observavel();
        Observador ob1 = new Observador(1);
        Observador ob2 = new Observador(2);
        palavra.registraObservador(ob1);
        palavra.registraObservador(ob2);
        assertEquals(palavra.getPalavras().size(),2);
    }

    @Test
    public void testaQuantidadeCaracteres(){
        Observavel palavra = new Observavel();
        assertEquals(palavra.conta_caracter("Davi"),4);
    }

    @Test
    public void testaLetraMaiuscula(){
        Observavel palavra = new Observavel();
        assertEquals(palavra.conta_maiusculas("Chris"),1);

    }
}
