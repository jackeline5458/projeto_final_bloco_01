package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.CamisetaDisney;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<CamisetaDisney> listaProdutos = new ArrayList<CamisetaDisney>();

	@Override
	public void procurarPorId(int id) {
		boolean encontrado = false;

		for (CamisetaDisney camiseta : listaProdutos) {

			if (camiseta.getId() == id) {

				camiseta.visualizar();
				encontrado = true;
			}

		}
		if (!encontrado)

		{
			System.out.println("Produto não encontrado");
		}

	}

	@Override
	public void listarTodos() {
		for (CamisetaDisney camiseta : listaProdutos) {
			camiseta.visualizar();
		}
	}

	@Override
	public void cadastrar(CamisetaDisney camiseta) {
		listaProdutos.add(camiseta);

		System.out.println("Produto cadastrado com sucesso!");
	}

	@Override
	public void atualizar(CamisetaDisney camiseta) {

		for (int i = 0; i < listaProdutos.size(); i++) {

			if (listaProdutos.get(i).getId() == camiseta.getId()) {

				listaProdutos.set(i, camiseta);

				System.out.println("Produto atualizado com sucesso!");

				return;
			}
		}

		System.out.println("Produto não encontrado!");
	
	}

	@Override
	public void deletar(int id) {
		for (CamisetaDisney camiseta : listaProdutos) {

			if (camiseta.getId() == id) {

				listaProdutos.remove(camiseta);

				System.out.println("Produto deletado com sucesso!");

				return;

			}

		}
	}
}
