import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        TipoConta tipoConta = TipoConta.CONTA_CORRENTE;
        Conta conta = new Conta(cliente, tipoConta);
        conta.saldo = 1000.51;

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria Santos");
        TipoConta tipoConta2 = TipoConta.CONTA_POUPANCA;
        Conta conta2 = new Conta(cliente2, tipoConta2);

        System.out.println("*********************************");
        System.out.println("Bem vindo, " + conta.getCliente().getNome() + "! ");
        System.out.println("*********************************");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação: ");
        System.out.println("0 - Consultar Saldo");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Transferência");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        switch (escolha) {
            case 0:
                System.out.println("Operação: Consultar Saldo");
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            case 1:
                System.out.println("Operação: Depósito");
                System.out.print("Digite o valor do depósito: ");
                Double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            case 2:
                System.out.println("Operação: Saque");
                System.out.print("Digite o valor do saque: ");
                Double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            case 3:
                System.out.println("Operação: Transferência");
                System.out.print("Digite o valor da transferência: ");
                Double valorTransferencia = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha pendente
                conta.transferir(valorTransferencia, conta2);
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            default:
                System.out.println("Operação inválida");
        }

    }
    
}
