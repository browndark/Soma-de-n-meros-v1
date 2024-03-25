import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar= true;
        while (continuar) {
            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextInt();

            double soma = numero1 + numero2;
            double subtracao = numero1 - numero2;
            double divisao = numero1 / numero2;
            double multiplicacao = numero1 * numero2;

            System.out.println("As formas de resultados possiveis são:");
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Divisão: " + divisao);
            System.out.println("Multiplicação: " + multiplicacao);


            System.out.println("DESEJA CONTINUAR ME USANDO?(S/N)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("Programa Encerrado, Volte Sempre!");

            }

        }



        scanner.close();
    }
}







