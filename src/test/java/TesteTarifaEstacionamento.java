import org.example.strategy.CalculoHora;
import org.example.strategy.TarifaEstacionamento;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteTarifaEstacionamento {

    @Test
    public void tarifaFixaPorHora(){
        var t = new TarifaEstacionamento(3, new CalculoHora(4));
        var valor = t.valor();

        assertEquals(12, valor);
    }

    @Test
    public void tarifaComValorInicialDepoisFixaPorHora(){
        var t = new TarifaEstacionamento(5, new CalculoHoraValorInicial(5, 3, 2));
        var valor = t.valor();

        assertEquals(9, valor);
    }

    @Test
    public void tarifaDiaria(){
        var t = new TarifaEstacionamento(50, new CalculoDiaria(20));
        var valor = t.valor();

        assertEquals(60, valor);
    }

    @Test
    public void tarifaDiariaMenorQueUmDia(){
        var t = new TarifaEstacionamento(10, new CalculoDiaria(20));
        var valor = t.valor();

        assertEquals(20, valor);
    }
}
