import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.ValorInvalidoException;

public class TestaString {
	public static void main(String[] args) throws ValorInvalidoException {
		String s = "fj11";
		s=s.replaceAll("1", "2");
		System.out.println(s);
		
		ManipulaString manipula = new ManipulaString();
		

		Conta conta = new ContaCorrente();
		conta.deposita(100);
		conta.setNumero(11111);
		System.out.println(conta);
		
		Conta conta2 = new ContaCorrente();
		conta2.deposita(100);
		conta2.setNumero(11111);
		System.out.println(conta2);
		
		System.out.println(conta.equals(conta2));

		System.out.println(manipula.inverteFrase("Socorram-me, subi no ônibus em Marrocos"));
		
	}
	
}
