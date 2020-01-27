package controller;

import model.entities.VeiculoSegurado;

import java.util.ArrayList;
import java.util.List;

public class VeiculoSeguradoController implements CrudInterface {

    List<VeiculoSegurado> veiculoSegurados = new ArrayList<>();

    public List<VeiculoSegurado> getVeiculoSegurados() {
        return veiculoSegurados;
    }

    @Override
    public void cadastrar(Object obj) {
        veiculoSegurados.add((VeiculoSegurado) obj);
    }

    @Override
    public void remover(Object obj) {
        veiculoSegurados.remove((VeiculoSegurado) obj);
    }

    @Override
    public void listar() {
        if (veiculoSegurados.size() != 0) {
            for (VeiculoSegurado veiculos : veiculoSegurados) {
                System.out.println(veiculos.toString());
            }
        } else {
            System.out.println("Nenhum Veículo Segurado Cadastrado");
        }
    }

    @Override
    public void pesquisar(String search) {
        if (veiculoSegurados.size() != 0) {
            for (VeiculoSegurado veiculos : veiculoSegurados) {
                if (veiculos.getPlaca().equals(search)) {
                    System.out.println("Encontreiii !!!");
                    System.out.println(veiculos.toString());
                } else {
                    System.out.println("Não encontrado");
                }
            }
        } else {
            System.out.println("Nenhum Veículo Segurado Cadastrado");
        }
    }
}
