package Questao1;

public class Vip extends Ingresso{
	private double valorAdicional;

	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeIngresso() {
		System.out.println("Ingresso Vip" + getValor() + valorAdicional);
	}
	
	
}
