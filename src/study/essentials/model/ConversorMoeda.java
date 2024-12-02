package study.essentials.model;

import study.essentials.service.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;

    public ConversorMoeda(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal(double cotacaoDolar) {
        return cotacaoDolar * dolar;
    }
}
