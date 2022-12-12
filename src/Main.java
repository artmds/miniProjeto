public class Main {
    public static void main(String[] args) {
        Usuario adminUser = new Usuario();
        adminUser.setNome("admin");

        Usuario adminPass = new Usuario();
        adminPass.setSenha("123456");

        Album novoAlbum = new Album();
        novoAlbum.setNomeAlbum("Copa do Mundo Qatar 2022");
        novoAlbum.adicionarFigurinha(200, 50);

        Figurinha ney = new Figurinha();
        ney.setNomeFigurinha("Neymar");
        ney.setNumeroFigurinha(10);
    }
}