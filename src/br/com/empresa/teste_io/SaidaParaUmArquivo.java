package br.com.empresa.teste_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SaidaParaUmArquivo {

	public static void main(String[] args) throws FileNotFoundException {

		// L� DE UM ARQUIVO
		// InputStream is = new FileInputStream("arquivo.txt");
		// Scanner entrada = new Scanner(is);

		// L� DA CONSOLE
		Scanner entrada = new Scanner(System.in);
		OutputStream os = new FileOutputStream("saida.txt");
		PrintStream saida = new PrintStream(os);
		
		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		
		saida.close();
		entrada.close();
		
	}
}
