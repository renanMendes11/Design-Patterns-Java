package org.example.strategy;

public class CalculoHoraValorInicial implements Calculo {
    private int valorInicial;
    private int limiteHorasInicial;
    private int valorHoraExcedente;

    public CalculoHoraValorInicial(int valorInicial, int limiteHorasInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limiteHorasInicial = limiteHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int qtdHoras) {
        int valor = this.valorInicial;
        valor += (qtdHoras - limiteHorasInicial) * valorHoraExcedente;
        return valor;
    }
}
