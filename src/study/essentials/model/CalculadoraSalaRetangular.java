package study.essentials.model;

import study.essentials.service.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public int calcularPerimetro() {
        return 2 * getBase() + 2 * getAltura();
    }
}
