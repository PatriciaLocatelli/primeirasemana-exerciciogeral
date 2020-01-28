package controller;

import model.entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController implements CrudInterface<Cliente> {

    List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public void cadastrar(Cliente obj) {
        clientes.add(obj);
    }

    @Override
    public void remover(Cliente obj) {
        clientes.remove(obj);
    }

    @Override
    public void listar() {
        if (clientes.size() != 0) {
            for (Cliente c : getClientes()) {
                System.out.println(c.toString());
                if (c.getVeiculoSegurados() != null) {
                    c.getVeiculoSegurados();
                }
            }
        } else {
            System.out.println("Nenhum cliente cadastrado");
        }
    }

    @Override
    public void pesquisar(String search) {
        if (clientes.size() != 0) {
            for (Cliente c : clientes) {
                if (c.getTelefone().equals(search)) {
                    System.out.println("Encontrei !!!");
                    System.out.println();
                    System.out.println(c.toString());
                } else {
                    System.out.println("Não encontrado");
                }
            }
        } else {
            System.out.println("Nenhum cliente cadastrado");
        }
    }

    public Cliente pesquisarPorNome(String nome) {
        Cliente cli = new Cliente();
        if (clientes.size() != 0) {
            for (Cliente c : clientes) {
                if (c.getNome().equals(nome)) {
                    System.out.println("Cliente encontrado");
                    cli = c;
                }
            }
        } else {
            System.out.println("Cliente não encontrado");
            cli = null;
        }
        return cli;
    }
}
