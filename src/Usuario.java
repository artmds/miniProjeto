public class Usuario {
    private String nome;
    private String senha;

    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    public void setNome(String user){
        this.nome = user;
        System.out.println("Nome de Usuário: " + this.nome.toString());
    }

    public void setSenha(String pass){
        this.senha = pass;
        System.out.println("Senha: " + this.senha.toString());

    }
}
