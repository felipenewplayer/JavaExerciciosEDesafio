package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();


        if (number < 0 ){
            System.out.println("Número negativo!!" + number);
        }else {
            System.out.println("Número positivo!!");
        }
    }
}
