package House;

//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;

import javax.swing.JOptionPane;

public class MenuOpcoes {
	
	static int exibirMenu() {
		
		int opcaoEscolhida=0;
		
		opcaoEscolhida=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opcao abaixo: \n\n"
				+ "1- Visualizar informacoes da CASA \n"
				+ "2- Visualizar informacoes das PORTAS \n"
				+ "3- Visualizar informacoes das JENELAS \n"
				+ "4- SAIR DO PROGRAMA \n\n", "Menu", JOptionPane.INFORMATION_MESSAGE));
		return opcaoEscolhida;
	}
        
    static void exibirInformacoesCasa(int opcaoEscolhidaMenu, String descricao_Casa, String cor_Casa, int qt_Portas, int qt_Janelas, String id_Porta, String id_Janela, String movimento_PortaEscolhida, String movimento_JanelaEscolhida) {
                
    	//Método paintComponent
    	//@Override
    	//public void paintComponent(Graphics cor) {

    	//Graphics2D corTexto = (Graphics2D) cor.create();
    	//corTexto.setColor(Color.WHITE);
    	//}

    	switch(opcaoEscolhidaMenu) {

    	case 1:
    		JOptionPane.showMessageDialog(null, "Tipo da casa: " + descricao_Casa + "\nCor da casa: " + cor_Casa, "Descricao da Casa", JOptionPane.OK_CANCEL_OPTION);
    		break;

    	case 2:
    		JOptionPane.showMessageDialog(null, "Quantidade de portas: " + qt_Portas, "Portas", JOptionPane.OK_CANCEL_OPTION);
    		JOptionPane.showMessageDialog(null, "A porta " + id_Porta + " está " + movimento_PortaEscolhida, "Porta escolhida", JOptionPane.OK_CANCEL_OPTION);
    		break;

    	case 3:
    		JOptionPane.showMessageDialog(null, "Quantidade de janelas: " + qt_Janelas, "Janelas", JOptionPane.OK_CANCEL_OPTION);
    		JOptionPane.showMessageDialog(null, "A janela " + id_Porta + " está " + movimento_JanelaEscolhida, "Janela escolhida", JOptionPane.OK_CANCEL_OPTION); 
    		break;

    	case 4:
    		System.exit(0);
    		break;

    	default:
    		JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
    		break;
    	}
    	System.exit(0);
    }
	
	static String descricaoCasa() {
		
		String tipoCasaEscolhida="";
		int tipoCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo da casa: \n\n"
				+ "1- Barraco \n"
				+ "2- Alvenaria \n"
				+ "3- Sobrado \n"
				+ "4- Edifício \n\n", "Casa", JOptionPane.QUESTION_MESSAGE));
		
		switch(tipoCasa) {
		
			case 1:
				tipoCasaEscolhida="Barraco";
			break;
			
			case 2:
				tipoCasaEscolhida="Alvenaria";
			break;
			
			case 3:
				tipoCasaEscolhida="Sobrado";
			break;
			
			case 4:
				tipoCasaEscolhida="Edifício";
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				System.exit(0);
			break;
		}
		return tipoCasaEscolhida;
	}
	
	//http://www.javaprogressivo.net/2012/08/java-graficos-e-2d-parte-1-usando-o.html
	static String corCasa() {
		
		String corCasaEscolhida="";
		        
		int cor_Casa=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a cor da casa: \n\n"
				+ "1- Branca \n"
				+ "2- Azul \n"
				+ "3- Verde \n"
				+ "4- Laranja \n\n", "Casa", JOptionPane.QUESTION_MESSAGE));

		switch(cor_Casa) {

		case 1:
			corCasaEscolhida="Branca";
		break;

		case 2:
			corCasaEscolhida="Azul";
		break;

		case 3:
			corCasaEscolhida="Verde";
		break;

		case 4:
			corCasaEscolhida="Laranja";
		break;

		default:
			JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			System.exit(0);
		break;
		}
		return corCasaEscolhida;
	}
	
	static int qtPortas() {
		int qt_Portas=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de portas: \n\n", "Portas", JOptionPane.QUESTION_MESSAGE));
		return qt_Portas;
	}
	
	static int qtJanelas() {
		int qt_Janelas=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de janelas: \n\n", "Janelas", JOptionPane.QUESTION_MESSAGE));
		return qt_Janelas;
	}
	
	static int statusPorta(String id_Porta) {
		int status_Porta=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o status da porta " + id_Porta + ": \n\n"
				+ "1- Aberta \n"
				+ "2- Fechada \n\n", "Portas", JOptionPane.QUESTION_MESSAGE));
		return status_Porta;
	}
        
        static String statusPortaEscolhida(int movimento_Porta) {
            
                String movimento_PortaEscolhida="";
                switch(movimento_Porta) {

                        case 1:
                                movimento_PortaEscolhida="aberta";
                        break;

                        case 2:
                                movimento_PortaEscolhida="fechada";
                        break;

                        default:
                                JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
                                System.exit(0);
                        break;
                }
                return movimento_PortaEscolhida;
        }
	
	static int statusJanela(String id_Janela) {
		int status_Janela=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o status da janela " + id_Janela + ": \n\n"
				+ "1- Aberta \n"
				+ "2- Fechada \n\n", "Janelas", JOptionPane.QUESTION_MESSAGE));
		return status_Janela;
	}
        static String statusJanelaEscolhida(int movimento_Janela) {
            
                String movimento_JanelaEscolhida="";
                switch(movimento_Janela) {

                        case 1:
                                movimento_JanelaEscolhida="aberta";
                        break;

                        case 2:
                                movimento_JanelaEscolhida="fechada";
                        break;

                        default:
                                JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
                                System.exit(0);
                        break;
                }
                return movimento_JanelaEscolhida;
        }     
}