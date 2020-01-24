package model.entities;

public class VeiculoSegurado {

    private double kilometragem;
    private String placa;
    private Cliente cliente;
    private Modelo modelo;

    public VeiculoSegurado() {
    }

    public VeiculoSegurado(double kilometragem, String placa, Cliente cliente, Modelo modelo) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.cliente = cliente;
        this.modelo = modelo;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " Kilometragem: " + kilometragem + " Placa: " + placa + " Nome do Cliente: " + cliente.getNome() + " Modelo: " + modelo.toString();
    }
}
