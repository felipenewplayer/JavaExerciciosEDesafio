package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println("Advinhe um número de 0 a 100:");
        Scanner sc = new Scanner(System.in);

        int tentativasContador = 5;
        int numberRandom = new Random().nextInt(100);

        int numeroTentativas = 1;
        for (int i = 1; i < tentativasContador; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();

            if (numero < numberRandom) {
                System.out.println("Chute um número maior: ");
            } else if (numero > numberRandom) {
                System.out.println("Chute um número menor: ");
            } else if (numero == numberRandom) {
                System.out.println("Parabéns você acertou!!");
                break;
            }
            System.out.println("Número de tentativas " + numeroTentativas);
            numeroTentativas += 1;


        }
        sc.close();
    }
}