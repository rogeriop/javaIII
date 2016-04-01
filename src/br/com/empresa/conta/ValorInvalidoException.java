package br.com.empresa.conta;

public class ValorInvalidoException extends Exception{
    public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }
}
