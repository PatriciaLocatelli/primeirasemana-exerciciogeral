package controller;

import model.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController implements CrudInterface {
    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void cadastrar(Object obj) {
        usuarios.add((Usuario) obj);
    }

    @Override
    public void remover(Object obj) {
        usuarios.remove((Usuario) obj);
    }

    @Override
    public void listar() {
        for (Usuario usr : usuarios) {
            System.out.println(usr.toString());
        }
    }

    @Override
    public void pesquisar(String search) {

        for (Usuario usr : usuarios) {
            if (usr.getIdentificador().equals(search)) {
                System.out.println("ACHEEEI !");
                System.out.println();
                System.out.println(usr.toString());
            }
            else{
                System.out.println("Não achei");
            }
        }
    }
}
