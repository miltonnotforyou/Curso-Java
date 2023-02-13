public class Fatorial {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 10; numero++) {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println(numero + "! = " + fatorial);
        }
    }
}
