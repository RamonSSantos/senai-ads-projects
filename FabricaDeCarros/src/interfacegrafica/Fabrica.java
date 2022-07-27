package interfacegrafica;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import classesobjetocarro.Carro;
import classesobjetocarro.Estoque;

public class Fabrica {

	public void exibirMenu() {
		
		Estoque estoque = new Estoque();
		
		while(true) {
			
			int acao=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opçao\n\n"
					+ "1- Fabricar Carro(s)\n"
					+ "2- Vender Carro(s)\n"
					+ "3- Exibir Informacoes do Estoque\n"
					+ "4- SAIR do Programa\n", "Menu principal",JOptionPane.QUESTION_MESSAGE));
			
			switch(acao) {
			
				case 1:
					fabricarCarro(estoque);
				break;
				
				case 2:
					venderCarro(estoque);
				break;
				
				case 3:
					exibirInfCarro(estoque);
				break;
				
				case 4:
					System.exit(0);
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opçao incorreta", "Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			}
		}
	}
	
	private void fabricarCarro(Estoque estoque) {
		
		int qtCarro=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de carro(s):\n\n", "Fabricar carro", JOptionPane.QUESTION_MESSAGE));
				
		if(estoque.getListaDeCarros()==null) {
			List<Carro> listadeCarros = new ArrayList<Carro>();
			
			for(int i=1; i<=qtCarro; i++) {
				
				listadeCarros.add(solicitarCarro(i, qtCarro));
			}
			estoque.addCarro(listadeCarros);
		} else {
			
			List<Carro> listaDeCarros = estoque.getListaDeCarros();
			
			for(int i=1;i<=qtCarro; i++) {
				
				listaDeCarros.add(solicitarCarro(i, qtCarro));
			}
			estoque.addCarro(listaDeCarros);
		}
	}
	
	private Carro solicitarCarro(int i,int qtCarro) {
		
		Carro carro = new Carro();
			
		String modeloCarro=JOptionPane.showInputDialog(null, "Digite o modelo do carro "+ i + ":\n\n", "Fabricar carro", JOptionPane.QUESTION_MESSAGE);
		String corCarro=JOptionPane.showInputDialog(null, "Digite a cor do carro " + modeloCarro + ":\n\n", "Fabricar carro", JOptionPane.QUESTION_MESSAGE);
		
		carro.setModelo(modeloCarro);
		carro.setCor(corCarro);
		
		return carro;
	}
	
	private void venderCarro(Estoque estoque) {
		
		if(estoque.getListaDeCarros()==null) {
			
			JOptionPane.showMessageDialog(null, "A fabrica nao possui Carro(s)!", "Erro", JOptionPane.OK_CANCEL_OPTION);
		} else {
			
			List<String> list = new ArrayList<String>();
			
			for(Carro carro : estoque.getListaDeCarros()) {
				list.add(carro.getModelo() + " : " + carro.getCor());
			}
			
			JComboBox field1 = new JComboBox(list.toArray());
			
			Object[] message = {"Modelo do Carro:", field1};
			
			int option=JOptionPane.showConfirmDialog(null, message, "Vender Carro", JOptionPane.OK_CANCEL_OPTION);
			
			if(option==JOptionPane.OK_OPTION) {
				
				estoque.excluirCarro(field1.getSelectedIndex());
			} else {
				
				venderCarro(estoque);
			}
		}
	}
	
	private void exibirInfCarro(Estoque estoque) {
		
		String msgCarros="";
		int qtCarros=0;
		
		for(Carro carro : estoque.getListaDeCarros()) {
			
			qtCarros=qtCarros+1;
			msgCarros=msgCarros + "\nCarro: " + carro.getModelo() + "\nCor: " + carro.getCor() + "\n";
		}
		msgCarros="Quantidade de Carro(s): " + qtCarros + "\n" + msgCarros;
		
		JOptionPane.showMessageDialog(null, "Estoque de Carro(s):\n"
				+ msgCarros, "Fabrica de Carros", JOptionPane.INFORMATION_MESSAGE);
	}
}