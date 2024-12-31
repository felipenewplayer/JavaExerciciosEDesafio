package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número!");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("Seu número é par");
        }else {
            System.out.println("Seu número é impar");
        }

    }
}
