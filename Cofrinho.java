

import java.util.ArrayList; //uma lista dinâmica que armazena elementos de qualquer tipo.

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();
    
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }
    
    public boolean removerMoeda(Moeda moeda) { //É um método que remove uma moeda de uma coleção.
        for (Moeda m : moedas) {
            if (m.getClass() == moeda.getClass() && m.valor == moeda.valor) {
                moedas.remove(m);
                return true; // Se a moeda for encontrada e removida, o método retorna true.
            }
        }
        return false; // Caso contrário, retorna false.
    }
    
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
            return;
        }
        for (Moeda moeda : moedas) {
            moeda.info();
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}