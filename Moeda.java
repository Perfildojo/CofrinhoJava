

public abstract class Moeda { // abstract: indica que a classe Moeda é uma classe abstrata,  Ela serve como um modelo para outras classes que a herdam.
    protected double valor; //protected: A variável pode ser acessada pela própria classe, subclasses e classes do mesmo pacote.

   
    
    public Moeda(double valor) { // double: A variável armazena números decimais.
        this.valor = valor;
    }
    
    public abstract double converterParaReal();
    public abstract void info(); 
}
// public: método pode ser acessado de qualquer lugar (por outras classes).