public class Main {
    public static void main(String[] args) {
        Filmes filmeUm = new Filmes();
        filmeUm.nome = "Viva, a vida é uma festa!";
        filmeUm.anoDoFilme = 2017;
        filmeUm.duracaoDoFilme = 142;

        filmeUm.exibeFichaTecnica();
        filmeUm.avaliaFilme(4);
        filmeUm.avaliaFilme(7);
        filmeUm.avaliaFilme(10);
        System.out.println(filmeUm.somaDasAvaliacoes);
        System.out.println(filmeUm.totalDeAvaliacoes);
        System.out.println(filmeUm.pegaMedia());
    }
}
