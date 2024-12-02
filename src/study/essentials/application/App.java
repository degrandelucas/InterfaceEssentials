package study.essentials.application;

import study.essentials.model.*;
import study.essentials.service.Vendavel;

public class App {
    public static void main(String[] args) {
        //Conversor Moeda
        ConversorMoeda converter = new ConversorMoeda(50);
        double reais = 0;
        reais = converter.converterDolarParaReal(6.09); // 1 Dólar americano igual a Real brasileiro
        System.out.println(String.format("Temos em reais R$ %.2f ",reais));

        //Calculadora Sala Retangular
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();
        calculo.setBase(5);
        calculo.setAltura(10);
        System.out.println(String.format("O Retangulo tem %d de Area e %d de Perimetro", calculo.calcularArea(), calculo.calcularPerimetro()));

        //Tabuada
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(7);
        tabuada.mostrarTabuada();

        //Conversor de Temperatura
        ConversorTemperaturaPadrao converterParaCelsius = new ConversorTemperaturaPadrao();
        converterParaCelsius.setTemperaturaEmFahrenheit(135.5);
        converterParaCelsius.fahrenheitParaCelsius();

        ConversorTemperaturaPadrao converterParaFahrenheit = new ConversorTemperaturaPadrao();
        converterParaFahrenheit.setTemperaturaEmCelsius(30);
        converterParaFahrenheit.celsiusParaFahrenheit();

        //Calculavel Preco Final Livro
        Livro editoraFiel = new LivroFisico();
        editoraFiel.setTitulo("Tomando decisões segundo a vontade de Deus");
        editoraFiel.setPreco(28);
        if (editoraFiel instanceof LivroFisico) {
            ((LivroFisico) editoraFiel).setValorImpressao(2);
        }
        System.out.println(editoraFiel);
        System.out.println("Valor R$ " + ((LivroFisico) editoraFiel).calcularPrecoFinal());

        Livro editoraFielDigital = new Ebook();
        editoraFielDigital.setTitulo("Tomando decisões segundo a vontade de Deus");
        editoraFielDigital.setPreco(28);
        if (editoraFielDigital instanceof Ebook) {
            ((Ebook) editoraFielDigital).setPercentualDesconto(78);
        }
        System.out.println(editoraFielDigital);
        System.out.println("Valor R$ " + ((Ebook) editoraFielDigital).calcularPrecoFinal());

        //Preco Final Produto ou Servico
        Vendavel computador = new Produto(2595.99, 8);
        Vendavel formatarPC = new Servico(80,5);

        System.out.println("Valor final do Produto R$ " + computador.precoTotal());
        System.out.println("Valor final do Servico R$ " + formatarPC.precoTotal());
    }
}