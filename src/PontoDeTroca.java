import java.lang.reflect.Array;

public class PontoDeTroca extends Endereco{
    private String nomeDoAlbum;

    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }

    public boolean descobrirPonto(boolean localValid){
        System.out.println("Digite o local do ponto: ");
        if(localValid == true){
            return localValid;
        }else{
            System.out.println("Local inválido");
            return localValid;
        }
    }

    public void criarPonto(String nomeDoAlbum, Endereco endereco){
        this.nomeDoAlbum = nomeDoAlbum;

    }
}
