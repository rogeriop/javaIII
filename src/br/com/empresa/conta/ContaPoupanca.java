package br.com.empresa.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;

    }
    
    @Override
    public int compareTo(ContaPoupanca outra) {
    	if (this.numero < outra.numero) return -1;
    	if (this.numero > outra.numero) return 1;
    	return 0;
    }
 
}