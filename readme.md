# Projeto de Aplicações Java - Estudo de Conceitos e Modelagem com Interface

Este projeto é uma coleção de classes e interfaces desenvolvidas em Java, que exploram conceitos de modelagem orientada a objetos e resolução de problemas práticos. O foco é implementar funcionalidades úteis e didáticas, utilizando abstração, encapsulamento, polimorfismo e interfaces.

## Funcionalidades Principais

1. **Conversor de Moeda:**
    - Converte um valor em dólar para reais com base na cotação atual.

2. **Cálculo de Área e Perímetro:**
    - Calcula a área e o perímetro de uma sala retangular.

3. **Exibição de Tabuada:**
    - Gera e exibe a tabuada de multiplicação de um número.

4. **Conversor de Temperatura:**
    - Converte temperaturas entre Celsius e Fahrenheit.

5. **Cálculo do Preço Final de Livros:**
    - Calcula o preço final de um livro físico (considerando custos de impressão) ou de um ebook (com desconto aplicado).

6. **Cálculo de Preço de Produtos e Serviços:**
    - Calcula o preço final de produtos com desconto percentual e serviços com desconto em valor fixo.

## Estrutura do Projeto

### Pacotes

- `study.essentials.application`
    - Contém a classe principal `App` para execução das funcionalidades.

- `study.essentials.model`
    - Contém as classes de domínio que implementam as funcionalidades principais, como `Livro`, `Produto`, e `Servico`.

- `study.essentials.service`
    - Define interfaces que descrevem contratos para classes de domínio, como `Vendavel`, `Calculavel`, e `ConversorTemperatura`.

### Classes Principais

- **`App`**
    - Centraliza a execução das funcionalidades implementadas.

- **`ConversorMoeda`**
    - Realiza a conversão de valores entre moedas.

- **`CalculadoraSalaRetangular`**
    - Calcula área e perímetro de uma sala retangular.

- **`TabuadaMultiplicacao`**
    - Gera e exibe a tabuada de um número fornecido.

- **`ConversorTemperaturaPadrao`**
    - Converte temperaturas entre as escalas Celsius e Fahrenheit.

- **`LivroFisico` e `Ebook`**
    - Representam tipos específicos de livros com cálculo de preço final.

- **`Produto` e `Servico`**
    - Implementam o cálculo de preços com base em diferentes regras de desconto.

### Interfaces

- **`Vendavel`**
    - Define o contrato para calcular o preço final de produtos e serviços.

- **`Calculavel`**
    - Define o contrato para calcular preços finais de livros.

- **`ConversorTemperatura`**
    - Define o contrato para conversão de temperaturas.

- **`CalculoGeometrico`**
    - Define métodos para cálculo de área e perímetro de figuras geométricas.

### Exemplos de Uso

#### Conversão de Moeda:
```java
ConversorMoeda converter = new ConversorMoeda(50);
double reais = converter.converterDolarParaReal(6.09);
System.out.println("Valor em reais: R$ " + reais);
```

#### Cálculo de Área e Perímetro:
```java
CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();
calculo.setBase(5);
calculo.setAltura(10);
System.out.println("Área: " + calculo.calcularArea());
System.out.println("Perímetro: " + calculo.calcularPerimetro());
```

## Tecnologias Utilizadas

- **Java 8 ou superior:** Linguagem utilizada para o desenvolvimento.
- **Paradigma Orientado a Objetos:** Aplicado em toda a modelagem do projeto.

## Como Executar o Projeto

1. Clone este repositório.
2. Compile os arquivos `.java` localizados nos pacotes `application`, `model`, e `service`.
3. Execute a classe principal `App` para interagir com o projeto.

## Autor

- **Lucas Degrande**