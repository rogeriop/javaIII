
public class SistemaInterno {
	public void autentica(Autenticavel f) {
		int senha = 123;
		if (f.autentica(senha) == true) {
			System.out.println("bm vindo ao sistema");
		} else {
			System.out.println("senha incorreta");
		}
	}

}
