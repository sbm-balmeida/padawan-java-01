package testes;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a'; //tem que ser com aspas simples
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020; //irá converter o 2020 para string
		System.out.println(palavra);
	}
}
