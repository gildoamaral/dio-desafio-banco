import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contaList;

    public String getNome() {
        return nome;
    }

    public Banco(String nome) {
        this.nome = nome;
    }
}
