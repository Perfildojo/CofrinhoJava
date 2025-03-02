public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }
    
    @Override //visto na aula 5 (avisa ao compilador que aquele método está sobrescrevendo um método)
    public double converterParaReal() {
        return valor;
    }
    
    @Override
    public void info() { //info(), ele serve para exibir informações sobre um objeto.
        System.out.println("Moeda: Real - Valor: R$" + valor);
    }
}