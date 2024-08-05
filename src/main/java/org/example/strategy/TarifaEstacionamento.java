package org.example.strategy;

public class TarifaEstacionamento {
    private int qtdHoras;
    private Calculo calculo;

    public TarifaEstacionamento(int qtdHoras, Calculo calculo){
        this.qtdHoras = qtdHoras;
        this.calculo = calculo;
    }

    public int valor(){
        return calculo.calcularTarifa(qtdHoras);
    }
}
