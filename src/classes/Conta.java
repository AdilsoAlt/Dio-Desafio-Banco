package classes;

public abstract class Conta implements interfaces.Conta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente c) {
        this.agencia = AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
        this.cliente = c;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("Saldo Insuficiente");
        }else{
            saldo = saldo - valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            sacar(valor);
            contaDestino.depositar(valor);
        }
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


}
