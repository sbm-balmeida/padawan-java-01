package testes;

public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais"); //ATALHO: escrever sysout e precionar o ctrl + espaço
		
		int idade = 21;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18, mas pode entrar, pois esta acompanhado");
			} else {
				System.out.println("infelizmente você nao pode entrar");
			}
		}
	}
}
