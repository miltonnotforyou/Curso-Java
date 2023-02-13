package sintaxe_variaves_fluxo;

public class Testa_Conversão {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 321456789123456789l;
		//short valorPequeno = 2131; -> raro
		//byte b = 127; - > raro
		
		float pontoFlutuante = 3.14f;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double valor3 = valor1 + valor2;
		
		System.out.println(valor3);
	}

}
