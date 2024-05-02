package NL1;

import java.util.Arrays;

public class Equipe {
    private Carro carro;
    private Piloto[] pilotos;
    private Piloto pilotoAtual;
    private String nome;

    public Equipe(String nome) {
        this.nome = nome;
        pilotos = new Piloto[4];
    }

    private boolean trocarPilotoAtual(int pilotoId) {
        try {
            pilotoAtual = pilotos[pilotoId];
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean trocarPneu(int tipoDePneu) {
        try {
            carro.setTipoDePneu(tipoDePneu);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void pitstop(int tipoDePneu, int pilotoId) {
        if (!trocarPneu(tipoDePneu)) {
            System.out.println("Pitstop falhou");
            return;
        }
        if (!trocarPilotoAtual(pilotoId)) {
            System.out.println("Pitstop falhou");
            return;
        }

        System.out.println("Pitstop executado com sucesso");
    }

    public boolean adicionarPiloto(Piloto piloto) {
        for(int i = 0; i < 4; i++) {
            if (pilotos[i] == null) {
                pilotos[i] = piloto;
                return true;
            }
        }

        return false;
    }

    public boolean retirarPiloto(int pilotoId) {
        for(int i = 0; i < 4; i++) {
            if (pilotos[i].getId() == pilotoId) {
                pilotos[i] = null;
                return true;
            }
        }

        return false;
    }

    public void construiCarro(int tipoDePneu, int potencia, boolean turbo) {
        this.carro = new Carro(tipoDePneu, potencia, turbo);
    }

    public Carro getCarro() {
        return carro;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", nome='" + nome + '\'' +
                '}';
    }
}
