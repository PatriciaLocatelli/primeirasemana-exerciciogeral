package controller;

import java.util.ArrayList;
import java.util.List;

public interface CrudInterface<E> {

    public abstract void cadastrar(E obj);
    public abstract void remover(E obj);
    public abstract void listar();
    public abstract void pesquisar(String search);
}
