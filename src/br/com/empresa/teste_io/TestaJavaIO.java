package br.com.empresa.teste_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaJavaIO {
	public static void main(String[] args) throws IOException {

		// PEGA DA CONSOLE
		// InputStream is = System.in;

		// PEGA DE UM ARQUIVO
		 InputStream is = new FileInputStream("arquivo.txt");

		 // InputStreamReader isr = new InputStreamReader(is);
		 // BufferedReader br = new BufferedReader(isr);
		
		// POSSO DEFINIR TUDO NUMA SÓ LINHA
		 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		System.out.println("Digite sua mensagem: ");
		String linha = br.readLine();

		// while(!linha.equals(" ")) {
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		System.out.println("Obrigado");

		br.close();
	}
}
