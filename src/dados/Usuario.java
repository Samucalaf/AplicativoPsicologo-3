package dados;

public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void login(String email, String senha){
        if (email.equals(this.email) && senha.equals(this.senha)){
            System.out.println("Logado com sucesso!");
        }else{
            System.out.println("Email ou senha incorretos!");
        }
    }

    public void logout(){
        System.out.println("Saindo da conta...");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
