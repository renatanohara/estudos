import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("******************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n******************************");

        String menu = "Escolha uma operação: \n" +
                "1 - Consultar Saldo\n" +
                "2 - Transferir Valor\n" +
                "3 - Receber Valor\n" +
                "4 - Sair";

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if(opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insulficinete");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
}
