package model.enums;

public enum SituacaoApolice {
    EM_NEGOCIACAO("EM_NEGOCIACAO"), CANCELADA("CANCELADA"), QUITADA("Quitada"), PARCELADA("PARCELADA");
    private final String nome;

    private SituacaoApolice(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
