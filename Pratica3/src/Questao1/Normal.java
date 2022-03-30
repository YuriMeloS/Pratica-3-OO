package Questao1;

public class Normal extends Ingresso{

	public Normal(double valor) {
		super(valor);
	}
	
	public void imprimeIngresso(){
		System.out.println("Ingresso normal valor: " +getValor());
	}
	
}
