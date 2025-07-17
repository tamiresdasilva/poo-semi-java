package ex02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("\nLigando...\nO veículo está ligado!");
    }

    public void desligar() {
        System.out.println("\nDesligando..\nO veículo está desligado!");
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarInformacoes(){
        System.out.println("Informações do Carro:\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
