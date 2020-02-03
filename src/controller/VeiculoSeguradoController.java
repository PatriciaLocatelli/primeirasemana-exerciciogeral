package controller;

import model.entities.VeiculoSegurado;

import java.util.ArrayList;
import java.util.List;

public class VeiculoSeguradoController implements CrudInterface<VeiculoSegurado> {

    List<VeiculoSegurado> veiculoSegurados = new ArrayList<>();

    public List<VeiculoSegurado> getVeiculoSegurados() {
        return veiculoSegurados;
    }

    @Override
    public void cadastrar(VeiculoSegurado obj) {
        veiculoSegurados.add(obj);
    }

    @Override
    public void remover(VeiculoSegurado obj) {
        veiculoSegurados.remove(obj);
    }

    @Override
    public void listar() {
        if (veiculoSegurados.size() != 0) {
            //veiculoSegurados.forEach(System.out::println);
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

    public VeiculoSegurado pesquisarPorPlaca(String search) {
        VeiculoSegurado resultadoBusca = null;
        // for Cliente cliente : listaClientes
        if (veiculoSegurados.size() != 0) {
            for (VeiculoSegurado veic : veiculoSegurados) {
                if (veic.getPlaca().equals(search)) {
                    System.out.println("Encontrado  !!!");
                    resultadoBusca = veic;
                }
            }
        } else {
            System.out.println("Não encontrado");
        }

        return resultadoBusca;
    }
}
