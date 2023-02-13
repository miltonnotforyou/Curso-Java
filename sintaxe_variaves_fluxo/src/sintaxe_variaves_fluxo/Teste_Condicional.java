package sintaxe_variaves_fluxo;

public class Teste_Condicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		}
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, "
						+ "pois está acompanhado");
			}
			else {
				System.out.println("Infelizmente você não pode entrar");
			}
			
		}
	}

}
