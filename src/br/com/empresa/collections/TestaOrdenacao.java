package br.com.empresa.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.empresa.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main (String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaPoupanca c3 = new ContaPoupanca();
		ContaPoupanca c4 = new ContaPoupanca();
		
		c1.setNumero(1000);
		c2.setNumero(500);
		c3.setNumero(5000);
		c4.setNumero(2500);
		
		List<ContaPoupanca> cps = new LinkedList<ContaPoupanca>();
		
		// PARA INVERTER A ORDEM DA LISTA -> Collections.reverse(List)
		// PARA EMBARALHR -> Collections.shuffle(List)
		// PARA ROTACIONAR -> Collectins.rotate(List)
		
		cps.add(c1);
		cps.add(c2);
		cps.add(c3);
		cps.add(c4);
		
		for (ContaPoupanca contap: cps) {
			System.out.println(contap.getNumero());
		}
		
		System.out.println("=======================");
		
		Collections.sort(cps);

		for (ContaPoupanca contap: cps) {
			System.out.println(contap.getNumero());
		}
		
		System.out.println(cps);
		
	}
} 
