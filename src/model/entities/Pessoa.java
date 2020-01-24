package model.entities;

import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private Date dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return " Nome : " + nome + " Data Nacimento : " + dataNascimento;
    }
}
