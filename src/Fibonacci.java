import java.util.Scanner;

public class Fibonacci {

    public static int calularFibonacciRecursivo(int numero) {
        if(numero <= 1) {
            return numero;
        }
        return calularFibonacciRecursivo(numero-1) + calularFibonacciRecursivo(numero-2);
    }

    public static int calcularFibonacciIterativo(int numero) {//2
        int resultado = 0, antecessor = 1, antepenultimo = 0;

        if(numero <= 1) {
            return numero;
        } else {
            for (int i = 2; i <= numero; i++) {
                resultado = antecessor + antepenultimo;
                antepenultimo = antecessor;
                antecessor = resultado;
            }
        }

        return resultado;//2
    }
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para cálculo do Fibonacci.");
        numero = scanner.nextInt();
        System.out.println("O Fib(" + numero + ")= " + calularFibonacciRecursivo(numero));
    }
}
