package interfacegrafica;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import classesobjetoproduto.Cupom;
import classesobjetoproduto.Estoque;
import classesobjetoproduto.Produto;

public class Loja {
	
	private List<Cupom> listaCupons;
	
	public void menuPrincipal() {
		
		Estoque estoque = new Estoque();
		
		while(true) {
			
			int opcao=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opçao\n\n"
					+ "1- Cadastrar Produto\n"
					+ "2- Listas Produtos\n"
					+ "3- Adicionar Produto no Estoque\n"
					+ "4- Efetuar Venda\n"
					+ "5- Visualizar Cupons\n"
					+ "6- Sair do Programa\n\n",
					"Menu Principal", JOptionPane.QUESTION_MESSAGE));
			
			switch(opcao) {
			
				case 1:
					cadastrarProduto(estoque);
				break;
				
				case 2:
					listarProdutos(estoque);
				break;
				
				case 3:
					adicProdutoEstoque(estoque);
				break;
				
				case 4:
					efetuarVenda(estoque);
				break;
                                
				case 5:
					visualizarCupons(estoque);
				break;
				
				case 6:
					System.exit(0);
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opçao Incorreta", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
		
	}
	
	private void cadastrarProduto(Estoque estoque) {
		
		Produto produto = new Produto();
		
		if(estoque.getListaDeProdutos()==null) {
			
			List<Produto> listaProduto = new ArrayList<Produto>();
			
			listaProduto.add(cadProduto(produto));
			
			estoque.addListaDeProdutos(listaProduto);
			
		} else {
			
			List<Produto> listaProduto = estoque.getListaDeProdutos();
			
			listaProduto.add(cadProduto(produto));
			
			estoque.addListaDeProdutos(listaProduto);
		}
	}
	
	private Produto cadProduto(Produto produto) {
		
		String nomeProduto=JOptionPane.showInputDialog(null, "Informe o Nome do Produto:\n\n","Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
		double precoProduto=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Preço do Produto:\n\n", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE));
	
		int codigo=Produto.getCodigo();
		
		produto.setId(codigo);
		produto.setNome(nomeProduto);
		produto.setPreco(precoProduto);
		produto.setQuantidade(0);
		
		return produto;
	}
	
	private void listarProdutos(Estoque estoque) {
		
		if(estoque.getListaDeProdutos()==null) {
			
			JOptionPane.showMessageDialog(null, "A loja nao possui nenhum produto cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
			Object msgListaProdutos=estoque.listaProdutos();
			
			JOptionPane.showMessageDialog(null, msgListaProdutos,"Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void adicProdutoEstoque(Estoque estoque) {
		
		if(estoque.getListaDeProdutos()==null) {
			
			JOptionPane.showMessageDialog(null, "A loja nao possui nenhum produto cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
			JComboBox<Object> msgProdutosEstoque=estoque.mostrarProdutosEstoque();
			Object[] msgListaProdutoEstoque = {"Lista de Produto(s):", msgProdutosEstoque};
			
			estoque.informarProdutoEstoque(msgProdutosEstoque, msgListaProdutoEstoque);
		}
	}
	
	private void efetuarVenda(Estoque estoque) {
		
		if(estoque.getListaDeProdutos()==null) {
			
			JOptionPane.showMessageDialog(null, "A loja nao possui nenhum produto cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
			JComboBox<Object> msgProdutoEfetuarVenda=estoque.mostrarProdutosEstoque();
			Object[] msgListaProdutoVenda = {"Lista de Produto(s):", msgProdutoEfetuarVenda};
			
            int idProdutoSelecProduto=estoque.infProdutoEfetuarVenda(msgProdutoEfetuarVenda, msgListaProdutoVenda);
			int qtProduto=estoque.qtProdutoEfetuarVenda(idProdutoSelecProduto);
			
			Cupom cupons = new Cupom();
			
			if(getListaCupons()==null) {
				
				List<Cupom> listaDeCupons = new ArrayList<Cupom>();
				
				listaDeCupons.add(cadCupom(cupons, estoque, qtProduto, idProdutoSelecProduto));
				
				addListaCupons(listaDeCupons);
			} else {
				
				List<Cupom> listaDeCupons = getListaCupons();
				
				listaDeCupons.add(cadCupom(cupons, estoque, qtProduto, idProdutoSelecProduto));
				
				addListaCupons(listaDeCupons);
			}
		}
	}
        
	private void visualizarCupons(Estoque estoque) {

		if(getListaCupons()==null) {
			
			JOptionPane.showMessageDialog(null, "A loja nao possui nenhum cupom cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		} else {
	
			String msgCupons="";
			double totalVendas=0;
			
			for(Cupom cupom : getListaCupons()) {
				
				for(Produto produto : estoque.getListaDeProdutos()) {
					
					if(cupom.getIdProduto()==produto.getId()) {
				
						msgCupons=msgCupons + "\nID Cupom: " + cupom.getId() + "\nID Produto: " + cupom.getIdProduto() + "\nNome Produto: " + produto.getNome() + "\nPreço de Venda: " + cupom.getPrecoVenda() + "\n";
						totalVendas=totalVendas + cupom.getPrecoVenda();
					}
				}
			}
			msgCupons=msgCupons + "\nTotal de Vendas: R$ " + totalVendas;
			
			JOptionPane.showMessageDialog(null, "Cupons Registrados: " + msgCupons,"Visualizar Cupons", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private Cupom cadCupom(Cupom cupons, Estoque estoque, int qtProduto, int idProdutoSelecProduto) {
		
		estoque.cadProdutoEstoqueCupom(cupons, qtProduto, idProdutoSelecProduto);
		
		return cupons;
	}
	
	private void addListaCupons(List<Cupom> listaDeCupons) {
		
		setListaCupons(listaDeCupons);
	}

	private List<Cupom> getListaCupons() {
		return listaCupons;
	}

	private void setListaCupons(List<Cupom> listaCupons) {
		this.listaCupons = listaCupons;
	}
}