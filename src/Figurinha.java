public class Figurinha extends Album{
    private String nomeFigurinha;
    private int numeroFigurinha;

    public String getNomeFigurinha(){
        return nomeFigurinha;
    }

    public int getNumeroFigurinha(){
        return numeroFigurinha;
    }

    public void setNomeFigurinha(String nomeFigurinha) {
        this.nomeFigurinha = nomeFigurinha;
        System.out.println("Nome da figurinha: " + this.nomeFigurinha.toString());

    }

    public void setNumeroFigurinha(int numeroFigurinha) {
        this.numeroFigurinha = numeroFigurinha;
        System.out.println("Número da figurinha: " + this.numeroFigurinha);
    }
}
