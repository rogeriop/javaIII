package br.com.empresa.banco;
import br.com.empresa.banco.sistema.AtualizadorDeContas;
import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.ContaPoupanca;
import br.com.empresa.conta.ValorInvalidoException;

public class TestaAtualizadorDeContas {
            public static void main(String[] args) throws ValorInvalidoException {
                Conta c = new ContaCorrente();
                Conta cc = new ContaCorrente();
                Conta cp = new ContaPoupanca();

                c.deposita(1000); 
                cc.deposita(1000); 
                cp.deposita(1000);

                AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

                adc.roda(c);
                adc.roda(cc);
                adc.roda(cp);

                System.out.println("Saldo Total: " + adc.getSaldoTotal());
            }

        }
