import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contaList;

    public Banco() {
        this.contaList = new ArrayList<>();
    }

    public ContaCorrente adicionarContaCorrente(String nome, int cpf) {
        ContaCorrente novaConta = new ContaCorrente(nome, cpf);

        this.contaList.add(novaConta);

        return novaConta;
    }

    public ContaPoupanca adicionarContaPoupanca(String nome, int cpf) {
        ContaPoupanca novaConta = new ContaPoupanca(nome, cpf);

        this.contaList.add(novaConta);

        return novaConta;
    }

    public void exibirContas () {
        System.out.println(contaList);
    }
}
