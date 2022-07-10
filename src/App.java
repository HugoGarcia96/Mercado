import java.util.Scanner;

public class App {
    public static void menu() {
        System.out.println("1 - Adicionar novo Produto no estoque.");
        System.out.println("2 - Para vender um produto do estoque");
        System.out.println("3 - Listar Produtos no estoque.");
        System.out.println("0 - Sair.");
    }

    public static void main(String Args[]) {
        ProdutoPeso estoqueProdPeso[] = new ProdutoPeso[50];
        ProdutoUnidade estoqueProdUnidade[] = new ProdutoUnidade[50];

        estoqueProdPeso[0] = new ProdutoPeso(1, "Tomate", 3, 50);
        estoqueProdPeso[1] = new ProdutoPeso(2, "Cenoura", 2.5, 100);
        estoqueProdPeso[2] = new ProdutoPeso(3, "Beterraba", 2, 70);

        estoqueProdUnidade[0] = new ProdutoUnidade(4, "Ovo", 11, 100);
        estoqueProdUnidade[1] = new ProdutoUnidade(5, "Leite", 7, 100);
        estoqueProdUnidade[2] = new ProdutoUnidade(6, "Arroz", 20, 100);

        int qtdProdPeso = 3, qtdProdUnidade = 3, opc = 81;

        Scanner scan = new Scanner(System.in);

        while (opc != 0) {
            menu();
            opc = scan.nextInt();

            switch (opc) {
                case 1: {
                    int opcao = 0;
                    System.out.println("Escolha a opção: ");
                    System.out.println("1 - Adicionar Produto por Peso");
                    System.out.println("2 - Adicionar Produto por Unidade.");
                    System.out.println("");

                    opcao = scan.nextInt();

                    if (opcao == 1) {
                        estoqueProdPeso[qtdProdPeso] = ProdutoPeso.criaProdutoPeso();
                        qtdProdPeso++;

                    } else if (opcao == 2) {
                        estoqueProdUnidade[qtdProdUnidade] = ProdutoUnidade.criaProdutoUnidade();
                        qtdProdUnidade++;

                    } else {
                        System.out.println("Opção Inváda.");
                    }

                    break;
                }

                case 2: {
                    int opcao = 0, i = 0, indice = 0;
                    System.out.println("Escolha a opção: ");
                    System.out.println("1 - Remover Produto por Peso");
                    System.out.println("2 - Remover Produto por Unidade.");
                    System.out.println("");

                    opcao = scan.nextInt();

                    if (opcao == 1) {
                        for (i = 0; i < qtdProdPeso; i++) {
                            System.out.println((1 + i) + " - " + estoqueProdPeso[i].getNome());

                        }
                        System.out.println("Qual Produto deseja remover: ");
                        indice = scan.nextInt();

                        for (i = indice; i < (qtdProdPeso - 1); i++) {
                            estoqueProdPeso[i] = estoqueProdPeso[i + 1];
                        }

                        qtdProdPeso--;

                    } else if (opcao == 2) {
                        for (i = 0; i < qtdProdUnidade; i++) {
                            System.out.println((1 + i) + " - " + estoqueProdUnidade[i].getNome());

                        }
                        System.out.println("Qual Produto deseja remover: ");
                        indice = scan.nextInt();

                        for (i = indice; i < (qtdProdUnidade - 1); i++) {
                            estoqueProdUnidade[i] = estoqueProdUnidade[i + 1];
                        }

                        qtdProdUnidade--;

                    } else {
                        System.out.println("Opção Inváda.");
                    }

                    break;
                }

                case 3: {
                    int i = 0;

                    for (i = 0; i < qtdProdPeso; i++) {
                        estoqueProdPeso[i].imprime();

                    }

                    for (i = 0; i < qtdProdUnidade; i++) {
                        estoqueProdUnidade[i].imprime();

                    }

                    break;
                }
                

            }
        }

        scan.close();
    }
}
