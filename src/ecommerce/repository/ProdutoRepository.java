package ecommerce.repository;

import ecommerce.model.CamisetaDisney;

public interface ProdutoRepository {
	
	public void procurarPorId(int id);

	public void listarTodos();

	public void cadastrar(CamisetaDisney camiseta);

	public void atualizar(CamisetaDisney camiseta);

	public void deletar(int id);

}
