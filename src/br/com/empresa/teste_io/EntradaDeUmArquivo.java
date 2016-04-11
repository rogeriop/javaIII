package br.com.empresa.teste_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner sc = new Scanner(is);
		
		System.out.println("Digite a sua mensagem: ");
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
