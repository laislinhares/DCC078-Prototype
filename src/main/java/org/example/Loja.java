package org.example;

public class Loja implements Cloneable {
    private int cnpj;
    private String nome;
    private Endereco endereco;

    public Loja(int cnpj, String nome, Endereco endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja clone() throws CloneNotSupportedException {
        Loja lojaClone = (Loja) super.clone();
        lojaClone.endereco = (Endereco) lojaClone.endereco.clone();
        return lojaClone;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "cnpj=" + cnpj +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
