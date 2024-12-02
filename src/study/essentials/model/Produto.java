package study.essentials.model;

import study.essentials.service.Vendavel;

public class Produto implements Vendavel {
    private double preco;
    private int quantidade;

    public Produto(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public double precoTotal() {
        if (quantidade > 0 && quantidade < 4) {
            return preco - preco * (10 / 100.0);
        } else if (quantidade > 4 && quantidade < 8) {
            return preco - preco * (15 / 100.0);
        } else
            return preco - preco * (20 / 100.0);
    }

}

