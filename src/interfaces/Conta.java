package interfaces;

public interface Conta {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(classes.Conta contaDestino, double valor);
     void imprimirExtrato();

}
