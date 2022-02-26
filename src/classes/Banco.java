package classes;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> listContas;

    public void adicionarConta(Conta conta){
        this.listContas.add(conta);
    }

    public void listarContas(){
        for (int i = 0; i < this.listContas.size(); i++) {
            listContas.get(i).imprimirExtrato();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(String nome) {
        this.nome = nome;
    }

    public List<Conta> getListContas() {
        return listContas;
    }

    public void setListContas(List<Conta> listContas) {
        this.listContas = listContas;
    }
}
