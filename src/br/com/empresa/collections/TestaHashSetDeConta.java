package br.com.empresa.collections;

import java.util.HashSet;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;

public class TestaHashSetDeConta {
	public static void main(String[] args) {
		
            HashSet<Conta> contas = new HashSet<Conta>();

            ContaCorrente c1 = new ContaCorrente();
            c1.setNumero(1234);
            c1.setTitular("Antônio");
            ContaCorrente c2 = new ContaCorrente();
            c2.setNumero(1234);
            c2.setTitular("Eugênio");
            
            ContaCorrente c3 = new ContaCorrente();
            c3.setNumero(4567);
            c3.setTitular("Aurélio");
            contas.add(c1);
            contas.add(c2);
            contas.add(c3);

            System.out.println("Total de contas: " + contas.size());
        }
}
