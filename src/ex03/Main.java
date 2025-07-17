package ex03;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Davi Castro Sousa");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Tânia Cardoso Gomes");
        ContaSalario contaSalario = new ContaSalario("Marina Pereira Rocha");

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(300);
        contaSalario.depositar(800);

        contaCorrente.sacar(500);
        contaPoupanca.sacar(100);
        contaPoupanca.sacar(200);
        contaCorrente.transferir(contaPoupanca, 200);

        contaCorrente.consultarSaldo();

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("\nSaldo Final:\nConta Corrente - Davi Castro Sousa: " + numberFormat.format(contaCorrente.getSaldo()) + "\nConta Poupança - Tânia Cardoso Gomes: " + numberFormat.format(contaPoupanca.getSaldo()) + "\nConta Salário -  Marina Pereira Rocha: " + numberFormat.format(contaSalario.getSaldo()));

    }
}
