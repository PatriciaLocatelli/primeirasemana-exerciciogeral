package controller;

import model.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController implements CrudInterface<Usuario> {
    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void cadastrar(Usuario obj) {
        usuarios.add(obj);
    }

    @Override
    public void remover(Usuario obj) {
        usuarios.remove(obj);
    }

    @Override
    public void listar() {
        if (usuarios.size() != 0) {
            for (Usuario usr : usuarios) {
                System.out.println(usr.toString());
            }
        } else {
            System.out.println("Nenhum usuário cadastrado");
        }
    }

    @Override
    public void pesquisar(String search) {
        if (!usuarios.isEmpty()) {
            for (Usuario usr : usuarios) {
                if (usr.getIdentificador().equals(search)) {
                    System.out.println("ACHEEEI !");
                    System.out.println();
                    System.out.println(usr.toString());
                } else {
                    System.out.println("Não achei");
                }
            }
        }else{
            System.out.println("Nenhum usuário cadastrado");
        }
    }

    public Usuario pesquisarPorNome(String nome) {
        Usuario user = new Usuario();

        if (!usuarios.isEmpty()) {
            for (Usuario usr : usuarios) {
                if (usr.getNome().equals(nome)) {
                    user = usr;
                }
            }
        } else {
            System.out.println("Nenhum usuário cadastrado");
            user = null;
        }
        return user;
    }
}
