
abstract public class Funcionario {
	protected String nome;
	protected double salario;
	private int senha;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		return this.salario * 0.2;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}
