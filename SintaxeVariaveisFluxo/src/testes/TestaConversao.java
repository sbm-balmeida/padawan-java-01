package testes;

public class TestaConversao {
	
	public static void main(String[] args) {
		
		float pontoFlutuante = (float) 3.14;
		float pontoFlutuante2 = 3.14f;
		
		double salario = 1270.50;
		int valor = (int) salario; // O casting faz a conversão quando ela não é possível de forma automática.
		System.out.println(valor);	
		
		long numeroGrande = 6454646467l;
		short valorPequeno = 5555;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
