package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número!");
        int numero = sc.nextInt();

        //fatorial de 5! é 5.4.3.2.1 = 120 ;)
        int resultado = 1;
        for(int i = 1 ; i <=numero ; i ++){
            resultado *=i;
        }
        System.out.println(resultado);

        sc.close();
    }
}
