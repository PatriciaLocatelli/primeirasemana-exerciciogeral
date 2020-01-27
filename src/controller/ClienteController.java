package controller;

import model.entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController implements CrudInterface {


    List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public void cadastrar(Object obj) {
        clientes.add((Cliente) obj);
    }

    @Override
    public void remover(Object obj) {
        clientes.remove((Cliente) obj);
    }

    @Override
    public void listar() {
        if (clientes.size() != 0) {
            for (Cliente c : getClientes()) {
                System.out.println(c.toString());
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
            System.out.println("Cliente não encontrado, é necessário cadastrar cliente");
            cli = null;
        }
        return cli;
    }
}
