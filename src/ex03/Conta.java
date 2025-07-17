package ex03;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Deposito inválido.");
        }
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("O valor do saque deve ser positivo.");
        }else if (this.saldo < valor){
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            this.saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor <= 0) {
            System.out.println("O valor da transferência deve ser positivo.");
        } else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        } else if (contaDestino == null) {
            System.out.println("Conta de destino inválida!");
        } else {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        }
    }

    public void consultarSaldo() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance((new Locale("pt", "BR")));
        System.out.println("Saldo atual de " + titular + ": " + numberFormat.format(this.saldo) + ".");
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
