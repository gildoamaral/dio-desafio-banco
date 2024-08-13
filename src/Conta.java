public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(String nomeCliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = new Cliente(nomeCliente);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Numero: %d%n", getNumero());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }
}
