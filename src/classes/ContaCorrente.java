package classes;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente c) {
        super(c);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA CORRENTE");
        System.out.println(super.cliente.getNome());
        System.out.println(super.agencia);
        System.out.println(super.numero);
        System.out.println(super.saldo);
    }
}
