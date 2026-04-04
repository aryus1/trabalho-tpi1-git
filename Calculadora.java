public class Calculadora {

    /**
     * Executa uma operacao matematica basica.
     * @param operacao Tipo da operacao: "soma", "subtracao", "multiplicacao", "divisao"
     * @param a Primeiro numero
     * @param b Segundo numero
     * @return Resultado da operacao
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return a + b;
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisao por zero nao e permitida!");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Operacao invalida: " + operacao);
        }
    }

    // Ponto de entrada da aplicacao Calculadora
    // Metodo principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
        System.out.println("Subtracao: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicacao: " + calc.calcular("multiplicacao", 10, 5));
        System.out.println("Divisao: " + calc.calcular("divisao", 10, 5));
    }
}
