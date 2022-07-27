package classesobjetoproduto;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Estoque {

	private List<Produto> listaDeProdutos;

	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	
	public void addListaDeProdutos(List<Produto> listaProdutos) {
		
		setListaDeProdutos(listaProdutos);
	}
	
	public Object listaProdutos() {
		
		List<String> list = new ArrayList<String>();
		
		for(Produto produto : getListaDeProdutos()) {
			
			list.add("Cod.: " + produto.getId() + " | Nome: " + produto.getNome() + " | R$: " + produto.getPreco() + " | Quant.: " + produto.getQuantidade());
		}
		
		Object[] msgListaProdutos = list.toArray();
		Object[] msglistaDeProdutos = {"Lista de Produtos:", msgListaProdutos};
		
		return msglistaDeProdutos;
	}
	
	public JComboBox<Object> mostrarProdutosEstoque() {
		
		List<String> list = new ArrayList<String>();
		
		for(Produto produto : getListaDeProdutos()) {
			
			list.add("Cod.: " + produto.getId() + " | Nome: " + produto.getNome());
		}
		
		JComboBox<Object> msgListaProdEstoque = new JComboBox<Object>(list.toArray());
		
		return msgListaProdEstoque;
	}
		
	public void informarProdutoEstoque(JComboBox<Object> msgProdutoEstoque, Object msgListaProdutoEstoque) {
		
		int opc=JOptionPane.showConfirmDialog(null, msgListaProdutoEstoque, "Adicionar Produto no Estoque", JOptionPane.OK_CANCEL_OPTION);
		
		int idProdutoSelecionado=msgProdutoEstoque.getSelectedIndex() + 1;
		
		int quantidade=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Quantidade:\n\n","Adicionar Produto no Estoque", JOptionPane.QUESTION_MESSAGE));
		
		int idOpc=1;
		
		validaProdutoSelecionado(opc, idProdutoSelecionado, quantidade, idOpc);
	}
	
	public int infProdutoEfetuarVenda(JComboBox<Object> msgProdutoEfetuarVenda, Object msgListaProdutoEfetuarVenda) {
		
		int opc=JOptionPane.showConfirmDialog(null, msgListaProdutoEfetuarVenda, "Efetuar Venda de Produto", JOptionPane.OK_CANCEL_OPTION);

		int idProdutoSelecionado=msgProdutoEfetuarVenda.getSelectedIndex() + 1;

		idProdutoEfetuarVenda(opc);

		return idProdutoSelecionado;
                
    }
        
	public int idProdutoEfetuarVenda(int opc) {
            
		int idOpc=2;

		return idOpc;
    }
	
	public int qtProdutoEfetuarVenda(int idProdSelecionado) {
                
		int quantidade=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Quantidade:\n\n", "Efetuar Venda de Produto", JOptionPane.QUESTION_MESSAGE));

		int idOpc=2;

		int opc=0;
		
		for(Produto produto : getListaDeProdutos()) {
			
			if(idProdSelecionado==produto.getId()) {
				
				if(quantidade>produto.getQuantidade()) {
					
					JOptionPane.showMessageDialog(null, "Nao é possivel efetuar a venda! O estoque possui apenas " + produto.getQuantidade() + " quantidade(s) do produto selecionado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
					qtProdutoEfetuarVenda(idProdSelecionado);
				} else {
					
					validaProdutoSelecionado(opc, idProdSelecionado, quantidade, idOpc);
				}
			}
		}
		return quantidade;
	}
		
	public void validaProdutoSelecionado(int opcao, int idProdSelecionado, int qt, int idOpcao) {
		
		if(opcao==JOptionPane.OK_OPTION) {

			for(Produto produto : getListaDeProdutos()) {

				if(idProdSelecionado==produto.getId()) {

					switch(idOpcao) {
					
						case 1:
                            produto.addProdutoEstoque(qt);
						break;
						
						case 2:
							produto.delProdutoEstoque(qt);
						break;
					}
				}
			}
		} else {

			mostrarProdutosEstoque();
		}
	}
	
	public void cadProdutoEstoqueCupom(Cupom cupons, int qtProduto, int idProdutoSelecProduto) {
		
		for(Produto produto : getListaDeProdutos()) {
			
			if(idProdutoSelecProduto==produto.getId()) {

				int codigo=Cupom.getCodigo();
				double precoVenda=qtProduto * produto.getPreco();

				int idProduto=produto.getId();

				cupons.setId(codigo);
				cupons.setPrecoVenda(precoVenda);
				cupons.setIdProduto(idProduto);
			}
		}
	}
}