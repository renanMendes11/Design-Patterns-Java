package org.example.staticFactoryMethods;

// classe que demonstra diversas intenções de usando o mesmo construtor no metodos de fabrica
public class GeradorIntAleatorio {
    private int min;
    private int max;

    private GeradorIntAleatorio(int min, int max){
        this.min = min;
        this.max = max;
    }

    public static GeradorIntAleatorio gerarIntEntre(int min, int max){
        return new GeradorIntAleatorio(min,max);
    }

    public static GeradorIntAleatorio gerarIntMaiorQue(int min){
        return new GeradorIntAleatorio(min, Integer.MAX_VALUE);
    }

    public static GeradorIntAleatorio gerarIntMenorQue(int max){
        return new GeradorIntAleatorio(Integer.MIN_VALUE, max);
    }
}
