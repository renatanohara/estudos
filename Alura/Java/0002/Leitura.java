import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do filme: ");
        String nomeDoFilme = scanner.nextLine();
        
        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = scanner.nextInt();
        
        System.out.println("Digite a nota do filme (0 a 10): ");
        double notaDoFilme = scanner.nextDouble();

        System.out.println("O nome do filme é: " + nomeDoFilme + ". O ano de lançamento é: " + anoDeLancamento + ". A nota do filme é: " + notaDoFilme);
    }
}
