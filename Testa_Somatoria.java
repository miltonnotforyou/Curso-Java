public class Testa_Somatoria {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            total += contador;

            System.out.println(total); //mostra todas as somatorias
            contador++;
        }
        System.out.println(total); //mostra somente o total
    }
}
