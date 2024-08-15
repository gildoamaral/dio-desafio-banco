public class ContaPoupanca extends Conta {


    public ContaPoupanca(String nomeCliente, int cpfCliente) {
        super(nomeCliente, cpfCliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{ " +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                " }";
    }
}
