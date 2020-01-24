package controller;

import java.util.ArrayList;
import java.util.List;

public interface CrudInterface {

    public abstract void cadastrar(Object obj);
    public abstract void remover(Object obj);
    public abstract void listar();
    public abstract void pesquisar(String search);
}
