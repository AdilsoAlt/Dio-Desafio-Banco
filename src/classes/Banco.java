package classes;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> listContas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getListContas() {
        return listContas;
    }

    public void setListContas(List<Conta> listContas) {
        this.listContas = listContas;
    }
}
