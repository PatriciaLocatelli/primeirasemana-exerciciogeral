package model.entities;

import java.time.LocalDate;
import java.util.Date;

public class Usuario extends Pessoa {
    private String identificador;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, LocalDate dataNascimento, String identificador, String senha) {
        super(nome, dataNascimento);
        this.identificador = identificador;
        this.senha = senha;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString() + " Identificador: " + identificador + " Senha : *******";
    }

}
