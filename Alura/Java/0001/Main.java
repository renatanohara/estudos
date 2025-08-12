public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "O Senhor dos Anéis";
        filme.anoDeLancamento = 2001;
        filme.incluindoNoPlano = true;
        filme.avaliacao = 8.8;
        filme.totalDeAvaliacoes = 1000000;
        filme.duracaoEmMinutos = 178;

        System.out.println("Nome: " + filme.nome);
        System.out.println("Ano de Lançamento: " + filme.anoDeLancamento);
        System.out.println("Incluindo no Plano: " + filme.incluindoNoPlano);
        System.out.println("Avaliação: " + filme.avaliacao);
        System.out.println("Total de Avaliações: " + filme.totalDeAvaliacoes);
        System.out.println("Duração em Minutos: " + filme.duracaoEmMinutos);        
    }
}
