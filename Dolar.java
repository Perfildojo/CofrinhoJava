

public class Dolar extends Moeda {
    private static double COTACAO = obterCotacaoDolar();
    
    public Dolar(double valor) {
        super(valor);
    }
    
    @Override //avisa ao compilador que uma subclasse está sobrescrevendo (ou substituindo) um método da sua superclasse)
    public double converterParaReal() {
        return valor * COTACAO;
    }
    
    @Override
    public void info() { //info(), ele serve para exibir informações sobre um objeto.
        System.out.println("Moeda: Dólar - Valor: $" + valor + " (Cotação: R$" + COTACAO + ")");
    }
    
    public static double obterCotacaoDolar() { // Método que retorna a cotação
        return 5.88; //valor do Dolar
    }
}