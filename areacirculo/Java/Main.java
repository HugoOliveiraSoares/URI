import java.util.Scanner;

/* 
 * A fórmula para calcular a área de uma circunferência é: area = π . raio².
 * Considerando para este problema que π = 3.14159:
 * Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 */

public class Main {
    public static void main(String[] args) {
        
        double area, raio;

        Scanner teclado = new Scanner(System.in);
        
        raio = teclado.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n",area);
        
        teclado.close();

    }
}