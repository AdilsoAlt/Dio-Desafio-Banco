import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cria banco e lista de contas;
        Banco banco1 = new Banco("Banco do Brasil");
        List<Conta> contasB1 = new ArrayList<>();
        banco1.setListContas(contasB1);

        //Cria clientes
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        c1.setNome("Adilso");
        c2.setNome("Luiz");
        c3.setNome("Alteia");
        c4.setNome("Junior");

        //Cria Contas
        Conta cc1 = new ContaCorrente(c1);
        Conta poup1 = new ContaPoupanca(c1);

        Conta cc2 = new ContaCorrente(c2);

        Conta cc3 = new ContaCorrente(c3);
        Conta poup3 = new ContaPoupanca(c3);

        Conta poup4 = new ContaPoupanca(c4);

        banco1.adicionarConta(cc1);
        banco1.adicionarConta(poup1);
        banco1.adicionarConta(cc2);
        banco1.adicionarConta(cc3);
        banco1.adicionarConta(poup3);
        banco1.adicionarConta(poup4);

        banco1.listarContas();


    }
}
