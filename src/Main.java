import classes.Cliente;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Adilso");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.transferir(poupanca, 27.56);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
