package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {
    private String endereco;
    private String telefone;
    private List<VeiculoSegurado> veiculoSegurados;

    public Cliente() {
    }

    public Cliente(String nome, Date dataNascimento, String endereco, String telefone) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(String nome, Date dataNascimento, String endereco, String telefone, List<VeiculoSegurado> veiculoSegurados) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculoSegurados = veiculoSegurados;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<VeiculoSegurado> getVeiculoSegurados() {
        return veiculoSegurados;
    }

    public void setVeiculoSegurados(List<VeiculoSegurado> veiculoSegurados) {
        this.veiculoSegurados = veiculoSegurados;
    }

    @Override
    public String toString() {
        String vec = "";

        if (veiculoSegurados == null) {
            vec = " Nenhum Veículo Cadastrado";
        } else {
            for (VeiculoSegurado v : veiculoSegurados) {
                vec = v.getPlaca();
            }
        }
        return super.toString() + " Endereço : " + endereco + " Telefone: " + telefone + " Placa do Veículo: " + vec;
    }
}


