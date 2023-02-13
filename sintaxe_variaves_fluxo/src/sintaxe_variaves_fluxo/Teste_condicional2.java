package sintaxe_variaves_fluxo;

public class Teste_condicional2 {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		
		System.out.println("Valor de acompanhado é " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		}
		else {
				System.out.println("Infelizmente você não pode entrar");
			}
			
		}
}


