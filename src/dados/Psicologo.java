package dados;

public class Psicologo extends Usuario {
    private String CRP;
    private String especialidade;

    public Psicologo(String nome, String email, String senha, String crp, String especialidade){
        super(nome, email, senha);
        this.CRP = crp;
        this.especialidade = especialidade;
    }

    public String getCRP(){
        return CRP;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
