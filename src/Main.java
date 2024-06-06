import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente luis = new Cliente();
        luis.setNome("Luis");
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(luis);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco inter = new Banco("inter");

        inter.getContas().add(cc);
        inter.getContas().add(poupanca);

        List<Cliente> clienteList = inter.listarClientes();

        System.out.println(clienteList);
    }

}