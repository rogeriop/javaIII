package br.com.empresa.conta;

public abstract class Conta {
    protected double saldo;
    protected int numero;
    protected String titular;

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor  - 0.10;        
        }        
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }
    
    public abstract void atualiza(double taxa);
    
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public String getTitular() {
    	return this.titular;
    }
    
    public void setTitular(String titular) {
    	this.titular = titular;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Uma conta com valor = " + this.saldo;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
    
}
