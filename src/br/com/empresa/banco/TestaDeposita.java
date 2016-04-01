package br.com.empresa.banco;
import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaPoupanca;
import br.com.empresa.conta.ValorInvalidoException;

public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
