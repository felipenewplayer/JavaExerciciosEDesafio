package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números inteiros!");

        int number = sc.nextInt();
        int number2 = sc.nextInt();

        if(number == number2){
            System.out.println("Números iguais!");
        } else if (number != number2 && number <number2) {
            System.out.println("Números diferentes!");
            System.out.println("O primeiro é menor que o segundo número!");
        }else if (number > number2 && number !=number2){
            System.out.println("Números diferentes!");
            System.out.println("O primeiro é maior que o segundo número!");

        }
    }
}
