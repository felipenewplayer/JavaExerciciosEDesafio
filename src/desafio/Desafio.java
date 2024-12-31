package desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Felipe Alves Pereira";
        String conta = "Corrente";
        double saldo = 2000.00;
        int opcao =  0 ;

        System.out.println("************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("************************\n");

        String menu = """
                ** Digite uma opção **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair""";

        while (opcao != 4 ){
            System.out.println(menu);
            opcao = sc.nextInt();

            if(opcao == 1 ){
                System.out.println(opcao + "- Consultar saldo");
                double saldoConsultado = saldo;
                System.out.println("Saldo: R$ " + saldoConsultado + "\n");
            }
            else if(opcao == 2 ){
                System.out.println(opcao + "- Receber valor");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo R$" + saldo);
            }
            else if(opcao == 3 ){
                    System.out.println(opcao + "- Transferir valor");
                    System.out.println("Informe o valor a tranferir : ");
                    double valorTransferiro = sc.nextDouble();
                    if(valorTransferiro > saldo){
                    System.out.println("Não a saldo para realizar a  transferência");
                        System.out.printf("Você tem %.2f e quer transferir %.2f\n", saldo, valorTransferiro);
                    }else {
                    saldo -= valorTransferiro;

                    }

            }
            else if (opcao !=4){
                System.out.println("Opção inválida!!");
            }
        }
        sc.close();
    }
}

