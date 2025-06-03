package dados;

public class Paciente extends Usuario implements Autenticavel{
    public Paciente(String nome, String email, String senha){
        super(nome, email, senha);
    }
}
