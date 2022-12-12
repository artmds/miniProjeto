public class Album extends Usuario{
    private String nomeAlbum;

    public String getNomeAlbum(){
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
        System.out.println("Álbum: " + this.nomeAlbum.toString());
    }

    public int adicionarFigurinha(int figAtuais, int figRepetidas){
        int x = 0;
        x += figAtuais;

        int y = 0;
        y += figRepetidas;

        System.out.println("Numero de figurinhas: " + x + " | Figurinhas repetidas: " + figRepetidas);

        return x;
    }
    public int removerFigurinha(int figAtuais){
        int x = 0;
        x -= figAtuais;


        System.out.println("Numero de figurinhas: " + x);

        return x;
    }
}

