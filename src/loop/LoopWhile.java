package loop;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);


      double mediaAvaliacao = 0 ;
      double nota =  0 ;
      int totalDeNotas = 0;

      while (nota != -1) {
          System.out.println("Digite sua avaliacao para o filme ou -1 para encerrar !! ");
          nota =  sc.nextDouble();

          if(nota != -1){
              mediaAvaliacao  += nota;
              totalDeNotas ++;
          }
      }
      System.out.println("Média de Avaliações" + mediaAvaliacao / totalDeNotas);
    }
}

