package ecommerce;

import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.CamisetaDisney;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String produto;
		int opcao;

		while (true) {

			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("          DISNEYVERSE STORE                  ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("  1 - Cadastrar Produto                      ");
			System.out.println("  2 - Listar Produtos                        ");
			System.out.println("  3 - Buscar Produto por ID                  ");
			System.out.println("  4 - Atualizar Produto                      ");
			System.out.println("  5 - Deletar Produto                        ");
			System.out.println("  6 - Sair                                   ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("Entre com a opção desejada:                  ");

			opcao = leia.nextInt();
			ProdutoController produtos = new ProdutoController();

			if (opcao == 6) {
				System.out.println("DisneyVerse Store - Obrigada pela visita!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				leia.nextLine();

				System.out.println("Digite o nome do produto: ");
				String nome = leia.nextLine();

				System.out.println("Digite o preço: ");
				float preco = leia.nextFloat();

				System.out.println("Digite o estoque: ");
				int estoque = leia.nextInt();

				leia.nextLine();

				System.out.println("Digite a categoria: ");
				String categoria = leia.nextLine();

				System.out.println("Digite o tamanho: ");
				String tamanho = leia.nextLine();

				System.out.println("Digite o personagem: ");
				String personagem = leia.nextLine();

				System.out.println("Digite o universo Disney: ");
				String universo = leia.nextLine();

				CamisetaDisney camiseta = new CamisetaDisney(
						1,
						nome,
						preco,
						estoque,
						categoria,
						tamanho,
						personagem,
						universo);

				produtos.cadastrar(camiseta);

				keyPress();

				break;
			case 2:
			

				produtos.listarTodos();

				keyPress();

				break;
			case 3:

				System.out.println("Digite o ID do produto: ");
				int id = leia.nextInt();

				produtos.procurarPorId(id);

				keyPress();

				break;
			case 4:

				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				leia.nextLine();

				System.out.println("Digite o nome do produto: ");
				nome = leia.nextLine();

				System.out.println("Digite o preço: ");
				preco = leia.nextFloat();

				System.out.println("Digite o estoque: ");
				estoque = leia.nextInt();
				leia.nextLine();

				System.out.println("Digite a categoria: ");
				categoria = leia.nextLine();

				System.out.println("Digite o tamanho: ");
				tamanho = leia.nextLine();

				System.out.println("Digite o personagem: ");
				personagem = leia.nextLine();

				System.out.println("Digite o universo Disney: ");
				universo = leia.nextLine();

				camiseta = new CamisetaDisney(
						id,
						nome,
						preco,
						estoque,
						categoria,
						tamanho,
						personagem,
						universo);

				produtos.atualizar(camiseta);

				keyPress();

				break;			case 5:
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();

				produtos.deletar(id);

				keyPress();
			default:
				System.out.println("Opção inválida!\n\n");
				
				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {
		Scanner leia = new Scanner(System.in);

		System.out.println("\nPressione ENTER para continuar...");
		leia.nextLine();
	}
}
