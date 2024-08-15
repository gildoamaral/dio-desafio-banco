public class Main {
    public static void main(String[] args) {

        Banco bancoDigital = new Banco();
        Conta cc1 = bancoDigital.adicionarContaCorrente("Luiz", 0001);
        Conta cc2 = bancoDigital.adicionarContaPoupanca("Luiza", 0002);
        ContaCorrente cc3 = bancoDigital.adicionarContaCorrente("Marco", 0003);
        ContaPoupanca cc4 = bancoDigital.adicionarContaPoupanca("Joao", 0004);
//        bancoDigital.exibirContas();

        cc4.depositar(1000);
        cc3.depositar(2000);

//        cc4.imprimirExtrato();
//        cc3.imprimirExtrato();

        cc3.transferir(500, cc4);

//        cc4.imprimirExtrato();
//        cc3.imprimirExtrato();

        bancoDigital.exibirContas();

    }
}
