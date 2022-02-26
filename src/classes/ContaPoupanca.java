package classes;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente c) {
        super(c);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO POUPANCA");
        System.out.println(super.cliente.getNome());
        System.out.println(super.agencia);
        System.out.println(super.numero);
        System.out.println(super.saldo);
    }
}
