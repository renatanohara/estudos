import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Loop loop = new Loop();
        // loop.metodoFor();
        loop.metodoWhile();
    }


    public void metodoFor()
    {
        Scanner scanner = new Scanner(System.in);
        double avaliacaoMedia = 0.0;
        double nota = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do filme " + (i + 1) + ": ");
            nota = scanner.nextDouble();
            avaliacaoMedia += nota;
        }
        System.out.println("A média das notas é: " + (avaliacaoMedia / 5));
    }

    public void metodoWhile() {
        Scanner scanner = new Scanner(System.in);
        double avaliacaoMedia = 0.0;
        double nota = 0.0;
        int contador = 0;

        while (nota != -1) {
            System.out.print("Digite a nota do filme " + (contador + 1) + ": ");
            nota = scanner.nextDouble();
            avaliacaoMedia += nota;
            contador++;
        }
        System.out.println("A média das notas é: " + (avaliacaoMedia / 5));
    }

}
    

