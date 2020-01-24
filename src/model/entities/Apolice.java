package model.entities;

import java.util.Date;
import model.enums.SituacaoApolice;

public class Apolice  {

    private long numero;
    private Date data;
    private Date dataDeValidade;
    private SituacaoApolice situacao;
    private String seguradora;

    public Apolice() {
    }

    public Apolice(long numero, Date data, Date dataDeValidade, SituacaoApolice situacao, String seguradora) {
        this.numero = numero;
        this.data = data;
        this.dataDeValidade = dataDeValidade;
        this.situacao = situacao;
        this.seguradora = seguradora;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public SituacaoApolice getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoApolice situacao) {
        this.situacao = situacao;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    @Override
    public String toString() {
        return " Numero: " + numero + " Data: " + data + " Data de Validade: " + dataDeValidade + " Situação: " + situacao + " Seguradora: " + seguradora;
    }
}
