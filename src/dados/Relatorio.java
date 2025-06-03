package dados;

public class Relatorio {
    private int estrela;

    public void adicionarEstrela(){
        this.estrela++;
    }

    public void tirarEstrela(){
        this.estrela--;
    }

    public int getEstrela() {
        return estrela;
    }
}
