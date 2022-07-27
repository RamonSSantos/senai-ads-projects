package House;

import javax.swing.JOptionPane;

public class Porta {
	
	static String idPorta() {
		
		String identificacaoPorta="";
		int identificacao=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe alguma porta: \n\n"
				+ "1- Porta da frente \n"
				+ "2- Porta dos fundos \n"
				+ "3- Porta do banheiro \n"
				+ "4- Porta do quarto \n\n", "Portas", JOptionPane.QUESTION_MESSAGE));
		
		switch(identificacao) {
		
			case 1:
				identificacaoPorta="da frente";
			break;
			
			case 2:
				identificacaoPorta="dos fundos";
			break;
			
			case 3:
				identificacaoPorta="do banheiro";
			break;
			
			case 4:
				identificacaoPorta="do quarto";
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				System.exit(0);
			break;
		}
		return identificacaoPorta;
	}
	
	static boolean estadoPorta(int sPorta) {
		
		boolean status=false;
		
		switch(sPorta) {
		
			case 1:
				status=true;
			break;
				
			case 2:
				status=false;
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				System.exit(0);
			break;
		}
		return status;
	}
}