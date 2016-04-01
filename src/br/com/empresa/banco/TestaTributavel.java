package br.com.empresa.banco;
import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.Tributavel;
import br.com.empresa.conta.ValorInvalidoException;

public class TestaTributavel {
    public static void main(String[] args) throws ValorInvalidoException {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
