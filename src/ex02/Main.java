package ex02;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2020);
        carro.mostrarInformacoes();
        carro.ligar();
        carro.desligar();
    }
}
