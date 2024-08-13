public class Main {
    public static void main(String[] args) {
        Conta contaCorrent = new ContaCorrente("Lucio");
        Conta contaPoupanca = new ContaPoupanca("Lucio");
        ContaCorrente contaCorrent2 = new ContaCorrente("Malfoy");
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("Malfoy");

//        contaCorrent.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();

    }
}
