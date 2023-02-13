public class Aliquota_Com_IFS {
    public static void main(String[] args) {

        double salario = 3300.0;
        // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
        // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

        if (salario >= 1900.00 && salario <= 2800.00) {
        System.out.println("A sua aliquota é de 7.5% e você pode deduzir na declaração até R$ 142,00");
        } else if (salario >= 2800.01 && salario <= 3751.00) {
            System.out.println("A sua aliquota é de 15% e você pode deduzir na declaração até R$ 350");
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            System.out.println("A sua aliquota é de 22.5% e você pode deduzir na declaração até R$ 636");
        }
    }
}
