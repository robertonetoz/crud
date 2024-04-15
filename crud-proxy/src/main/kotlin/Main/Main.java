package Main;

import com.finan.orcamento.proxy.orcamento;
import com.finan.orcamento.proxy.orcamentoproxy;

import java.math.BigDecimal;
import java.math.BigInteger;

    public class Main {

        public static void main (String[]args){
            orcamento orcamento = new orcamento(new BigDecimal ("100"), new BigDecimal("100"));
            System.out.println ("Valor do orcamento = " + orcamento.getValorOrcamento());
            System.out.println ("Tempo para ver o desconto = " + orcamento.getDescontoOrcamento());

            orcamentoproxy proxy = new orcamentoproxy(orcamento);
            System.out.println ("Valor com proxy = " + proxy.getvalororcamento());
            System.out.println ("Valor com proxy = " + proxy.getvalororcamento());


        }
    }


