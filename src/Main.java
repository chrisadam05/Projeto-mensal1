import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Loja loja = new Loja();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== LOJA DE CARROS =====");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Atualizar carro");
            System.out.println("4 - Remover carro");
            System.out.println("5 - Buscar por ID");
            System.out.println("6 - Buscar por Marca");
            System.out.println("7 - Buscar por Modelo");
            System.out.println("8 - Buscar por Ano");
            System.out.println("9 - Buscar por Preço");
            System.out.println("10 - Valor total em estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("ID: \n");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: \n");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: \n");
                    String modelo = sc.nextLine();

                    System.out.print("Ano: \n");
                    int ano = sc.nextInt();

                    System.out.print("Preço: \n");
                    double preco = sc.nextDouble();

                    loja.adicionarCarro(new Carro(id, marca, modelo, ano, preco));
                    System.out.println("Carro adicionado!");
                    break;

                case 2:
                    loja.listarCarro();
                    break;

                case 3:
                    System.out.print("ID do carro: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nova marca: ");
                    String novaMarca = sc.nextLine();

                    System.out.print("Novo modelo: ");
                    String novoModelo = sc.nextLine();

                    System.out.print("Novo ano: ");
                    int novoAno = sc.nextInt();

                    System.out.print("Novo preço: ");
                    double novoPreco = sc.nextDouble();

                    if (loja.atualizarCarro(idAtualizar, novaMarca, novoModelo, novoAno, novoPreco)) {
                        System.out.println("Carro atualizado!");
                    } else {
                        System.out.println("Carro não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("ID do carro para remover: ");
                    int idRemover = sc.nextInt();

                    if (loja.removerCarro(idRemover)) {
                        System.out.println("Carro removido!");
                    } else {
                        System.out.println("Carro não encontrado!");
                    }
                    break;

                case 5:
                    System.out.print("ID para busca: ");
                    int buscaId = sc.nextInt();
                    loja.buscarPorId(buscaId);
                    break;

                case 6:
                    System.out.print("Marca para busca: ");
                    String buscaMarca = sc.nextLine();
                    loja.buscarPorMarca(buscaMarca);
                    break;

                case 7:
                    System.out.print("Modelo para busca: ");
                    String buscaModelo = sc.nextLine();
                    loja.buscarPorModelo(buscaModelo);
                    break;

                case 8:
                    System.out.print("Ano para busca: ");
                    int buscaAno = sc.nextInt();
                    loja.buscarPorAno(buscaAno);
                    break;

                case 9:
                    System.out.print("Preço para busca: ");
                    double buscaPreco = sc.nextDouble();
                    loja.buscarPorPreco(buscaPreco);
                    break;

                case 10:
                    loja.valorTotalemEstoque();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}