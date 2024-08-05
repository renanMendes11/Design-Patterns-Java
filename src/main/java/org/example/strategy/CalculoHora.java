package org.example.strategy;

public class CalculoHora implements Calculo{
    private int valorHora;


    public CalculoHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int calcularTarifa(int qtdHoras) {
        return valorHora * qtdHoras;
    }
}
