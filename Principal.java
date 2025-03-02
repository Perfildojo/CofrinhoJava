

import java.util.Scanner; // usada para ler dados de entrada de diferentes fontes, como o teclado, arquivos ou strings.

import Real;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
        while (true) {
            System.out.println("\nMenu do Cofrinho:");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("5 - Cotação Atual");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            
            if (!scanner.hasNextInt()) { // lê um numero inteiro
                System.out.println("Entrada inválida! Escolha um número entre 1 e 6."); //loops para garantir que o usuário insira um valor válido.
                scanner.next(); //Lê uma palavra.
                continue;
            }
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Escolha a moeda: 1-Real, 2-Dólar, 3-Euro");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida! Escolha um número entre 1 e 3."); //loops para garantir que o usuário insira um valor válido.
                        scanner.next();
                        continue;
                    }
                    int tipo = scanner.nextInt();
                    
                    System.out.print("Digite o valor: ");
                    if (!scanner.hasNextDouble()) { //Lê um número decimal.
                        System.out.println("Entrada inválida! Digite um valor numérico."); // exibe uma mensagem de erro no console, informando ao usuário que a entrada fornecida é inválida
                        scanner.next();
                        continue;
                    }
                    double valor = scanner.nextDouble(); //Lê um número decimal.
                    
                    if (tipo == 1) cofrinho.adicionarMoeda(new Real(valor));
                    else if (tipo == 2) cofrinho.adicionarMoeda(new Dolar(valor));
                    else if (tipo == 3) cofrinho.adicionarMoeda(new Euro(valor));
                    else System.out.println("Tipo inválido!");
                    break;
                
                case 2:
                    System.out.println("Escolha a moeda para remover: 1-Real, 2-Dólar, 3-Euro");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida! Escolha um número entre 1 e 3."); //loops para garantir que o usuário insira um valor válido.
                        scanner.next();
                        continue;
                    }
                    int tipoRemover = scanner.nextInt();
                    
                    System.out.print("Digite o valor a remover: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida! Digite um valor numérico."); //loops para garantir que o usuário insira um valor válido.
                        scanner.next();
                        continue;
                    }
                    double valorRemover = scanner.nextDouble();
                    
                    Moeda moedaRemover = null;
                    if (tipoRemover == 1) moedaRemover = new Real(valorRemover);
                    else if (tipoRemover == 2) moedaRemover = new Dolar(valorRemover);
                    else if (tipoRemover == 3) moedaRemover = new Euro(valorRemover);
                    else {
                        System.out.println("Tipo inválido!");
                        continue;
                    }
                    
                    if (cofrinho.removerMoeda(moedaRemover)) {
                        System.out.println("Moeda removida com sucesso.");
                    } else {
                        System.out.println("Moeda não encontrada no cofrinho.");
                    }
                    break;
                
                case 3:
                    cofrinho.listarMoedas();
                    break;
                
                case 4:
                    System.out.println("Total no cofrinho em reais: R$" + cofrinho.calcularTotal());
                    break;
                
                case 5: // incluido a opção de visualizar o valor da cotação do Dolar e do Euro.
                    System.out.println("Cotação Atual:");
                    System.out.println("Dólar: R$" + Dolar.obterCotacaoDolar());
                    System.out.println("Euro: R$" + Euro.obterCotacaoEuro());
                    break;
                
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opção inválida! Escolha entre 1 e 6."); //loops para garantir que o usuário insira um valor válido.
            }
        }
    }
}