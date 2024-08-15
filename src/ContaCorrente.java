public class ContaCorrente extends Conta {


    public ContaCorrente(String nomeCliente, int cpfCliente) {
        super(nomeCliente, cpfCliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "ContaCorrente{ " +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                " }";
    }
}
