public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int x = 4;

        System.out.println("Tabela de multiplicação de " + x);

        for (int i = 0; i < numeros.length; i++) {
            int resultado = numeros[i] * x;
            System.out.println((i + 1) + " x " + x + " = " + resultado);
        }
    }
}
