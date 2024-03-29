package Exercicio03;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public boolean sacarDinheiro(double valor) {
        if (conta.getSaldo() < valor) {
            return false;
        }

        conta.setSaldo(conta.getSaldo() - valor);
        return true;
    }

    public void depositarDinheiro(double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public boolean comprarComCredito(double valor) {
        if (conta.getLimite() < valor) {
            return false;
        }

        if (conta.getSaldo() < valor) {
            return false;
        }

        conta.setLimite(conta.getLimite() - valor);
        return true;
    }

    public boolean transferir(Conta contaParaReceber, double valor) {
        if (conta.getSaldo() < valor) {
            return false;
        }

        conta.setSaldo(conta.getSaldo() - valor);
        contaParaReceber.setSaldo(contaParaReceber.getSaldo() + valor);
        return true;
    }

    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\n" + conta.toString();
    }

    public Cliente(String nome, String cpf, double saldo, double limite) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta(saldo, limite);
    }
}
