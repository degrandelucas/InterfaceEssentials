package study.essentials.model;

import study.essentials.service.Calculavel;

public class LivroFisico extends Livro implements Calculavel {
    private double valorImpressao;

    public void setValorImpressao(double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }

    @Override
    public double calcularPrecoFinal() {
        return (getPreco() + valorImpressao);
    }
}
