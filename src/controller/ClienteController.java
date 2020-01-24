package controller;

import model.entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController implements CrudInterface{

    List<Cliente> clientes = new ArrayList<>();

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
        for(Cliente c : clientes){
            System.out.println(c.toString());
        }
    }

    @Override
    public void pesquisar(String search) {
        for(Cliente c : clientes){
            if(c.getTelefone().equals(search)){
                System.out.println("Encontrei !!!");
                System.out.println();
                System.out.println(c.toString());
            }
            else{
                System.out.println("Não encontrado");
            }
        }
    }
}
