package br.com.empresa.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	String nome;
	private List<Conta> contas = new ArrayList();
	private Map<String, Conta> indexadoPorNome = new HashMap<String, Conta>();
	
	public void adiciona(Conta c) {
		this.contas.add(c);
		this.indexadoPorNome.put(c.getTitular(), c);
	}
	
	public Conta pega(int x) {
		return contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return indexadoPorNome.get(nome);
	}
}
