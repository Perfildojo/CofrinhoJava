

public class Euro extends Moeda {
    private static double COTACAO = obterCotacaoEuro();
    
    public Euro(double valor) {
        super(valor);
    }
    
    @Override //visto na aula 5 (avisa ao compilador que aquele método está sobrescrevendo um método)
    public double converterParaReal() {
        return valor * COTACAO;
    }
    
    @Override
    public void info() { //info(), ele serve para exibir informações sobre um objeto.
        System.out.println("Moeda: Euro - Valor: €" + valor + " (Cotação: R$" + COTACAO + ")");
    }
    
    public static double obterCotacaoEuro() { // Método que retorna a cotação
        return 6.10; // Valor do Euro
    }
}