public class Cliente {

    private String nome;
    private int cpf;

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


}
