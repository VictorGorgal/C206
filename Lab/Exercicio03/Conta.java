package Exercicio03;

public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double valor) {
        this.limite = limite;
    }

    public String toString() {
        return "saldo: " + saldo + "\nlimite: " + limite;
    }

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
}
