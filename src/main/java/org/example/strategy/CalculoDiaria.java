package org.example.strategy;

public class CalculoDiaria implements Calculo {
    private int valorDiaria;
    public CalculoDiaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public int calcularTarifa(int qtdHoras) {
        return valorDiaria * (int) Math.ceil(qtdHoras / 24.0);
    }
}
