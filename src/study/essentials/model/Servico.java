package study.essentials.model;

import study.essentials.service.Vendavel;

public class Servico implements Vendavel {
    private double preco;
    private double descontoPix;

    public Servico(double preco, double descontoPix) {
        this.preco = preco;
        this.descontoPix = descontoPix;
    }

    @Override
    public double precoTotal() {
        return preco - descontoPix;
    }
}
