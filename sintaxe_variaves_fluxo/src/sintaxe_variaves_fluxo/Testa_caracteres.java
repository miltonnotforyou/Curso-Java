package sintaxe_variaves_fluxo;

public class Testa_caracteres {
	
	public static void main(String[] args) {
		char letra = 'a';// -> só aceita um letra
		System.out.println(letra);
		
		char valor = 67;
		System.out.println(valor);
		
		valor = (char) (valor+1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
