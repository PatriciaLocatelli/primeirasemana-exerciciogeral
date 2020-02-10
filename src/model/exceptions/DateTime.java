package model.exceptions;

public class DateTime extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DateTime(String mensagem) {
        super(mensagem);
    }
}
