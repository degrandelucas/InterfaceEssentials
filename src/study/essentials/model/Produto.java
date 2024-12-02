package study.essentials.model;

import study.essentials.service.Vendavel;

public class Produto implements Vendavel {
    private double preco;
    private int desconto = 10;

    public Produto(double preco) {
        this.preco = preco;
    }

    @Override
    public double precoTotal() {
        return preco - preco * (desconto/100.0);
    }
}
