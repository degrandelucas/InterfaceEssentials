package study.essentials.model;

import study.essentials.service.Calculavel;

public class Ebook extends Livro implements Calculavel {
    private int percentualDesconto;

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return (getPreco() - (getPreco() * (percentualDesconto/100.0))); //Usando 100.0 para forcar calculo com double
    }
}
