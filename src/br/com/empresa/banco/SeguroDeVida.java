package br.com.empresa.banco;
import br.com.empresa.conta.Tributavel;

public class SeguroDeVida implements Tributavel {
    public double calculaTributos() {
        return 42;
}
}