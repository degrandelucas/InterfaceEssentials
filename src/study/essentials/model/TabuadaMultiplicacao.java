package study.essentials.model;

import study.essentials.service.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    int tabuadaDoNumero;

    public TabuadaMultiplicacao(int tabuadaDoNumero) {
        this.tabuadaDoNumero = tabuadaDoNumero;
    }

    public int getTabuadaDoNumero() {
        return tabuadaDoNumero;
    }

    @Override
    public void mostrarTabuada() {
        int resultadoMultiplicacao = 0;
        for (int i = 0; i <= 10 ; i++) {
            resultadoMultiplicacao = getTabuadaDoNumero() * i;
            System.out.println(String.format("%d x %d = %d",getTabuadaDoNumero(),i,resultadoMultiplicacao));
        }
    }
}
