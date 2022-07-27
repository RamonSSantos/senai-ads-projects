package House;

import javax.swing.JOptionPane;

public class Janela {
	
	static String idJanela() {
		
		String identificacaoJanela="";
		int identificacao=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe alguma janela \n\n"
				+ "1- Janela da frente \n"
				+ "2- Janela da cozinha \n"
				+ "3- Janela do quarto \n"
				+ "4- Janela do banheiro \n\n", "Janelas", JOptionPane.QUESTION_MESSAGE));
		
		switch(identificacao) {
			
			case 1:
				identificacaoJanela="da frente";
			break;
			
			case 2:
				identificacaoJanela="da cozinha";
			break;
			
			case 3:
				identificacaoJanela="do quarto";
			break;
			
			case 4:
				identificacaoJanela="do banheiro";
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				System.exit(0);
			break;
		}
		return identificacaoJanela;
	}
	
	static boolean estadoJanela(int sJanela) {
		
		boolean status=false;
		
		switch(sJanela) {
		
			case 1:
				status=true;
			break;
			
			case 2:
				status=false;
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Öpcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				System.exit(0);
			break;
		}
		return status;
	}
}