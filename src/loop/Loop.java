package loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double mediaAvaliacao = 0 ;
        double nota =  0 ;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao para o filme!!");
            nota =  sc.nextDouble();
            mediaAvaliacao  += nota;
        }
        System.out.println("Média de Avaliações" + mediaAvaliacao / 3);

    }
}
