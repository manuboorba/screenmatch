public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "A ponte para terabítia";
        meuFilme.anoDeLancamento = 2007;
        meuFilme.duracaoEmMinutos = 190;

        meuFilme.exibeFichaTecnica();

    }
}
