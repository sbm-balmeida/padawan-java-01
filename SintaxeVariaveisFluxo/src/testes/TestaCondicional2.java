package testes;

public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais"); //ATALHO: escrever sysout e precionar o ctrl + espaço
		
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você nao pode entrar");
		}
	}
}
