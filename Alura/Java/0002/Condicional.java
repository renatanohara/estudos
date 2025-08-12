public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean inclusoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2020) {
            System.out.println("O filme é recente.");
        } else {
            System.out.println("O filme é mais antigo.");
        }

        if(inclusoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("O filme está incluso no plano.");
        } else {
            System.out.println("O filme não está incluso no plano.");
        }

    }
}
