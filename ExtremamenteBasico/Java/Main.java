import java.util.Scanner;

/**
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A
 * e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo
 * apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo
 * especificado e não esqueça de imprimir o fim de linha após o resultado, caso
 * contrário, você receberá "Presentation Error".
 */
public class Main {

    public static void main(String[] args) {
        
        int a, b, x;
        
        Scanner teclado = new Scanner(System.in);
         
        a = teclado.nextInt();
        b = teclado.nextInt();

        x = a + b;

        System.out.println("X = "+x);
         
        teclado.close();

    }
}