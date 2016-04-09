
public class ManipulaString {

	// 3.Java.Lang Exercício 13
	public String inverteFrase(String frase) {

		String[] palavras = frase.split(" ");
		String resultado = "";
		for(int i = (palavras.length - 1); i >= 0; i--) {
			resultado = resultado + palavras[i] + " ";
		}
		
		return resultado;
	}

}
