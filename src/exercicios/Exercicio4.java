package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");

        int numero = sc.nextInt();

        for(int i = 0; i <=10; i++){
            int resultado = i * numero;
            System.out.println( i + " X " + numero + " = " + resultado);
        }
    }
}
