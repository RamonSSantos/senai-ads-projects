import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		while (true) {
			
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero: "));
			
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero: "));
			
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o c�lculo b�sico: \n"
					
					+ "1 - Soma \n"
					+ "2 - Subtracao \n"
					+ "3 - Multiplicacao \n"
					+ "4 - Divisao \n"
					+ "5 - Sair do Programa \n"));
			
			String msg = " ";
			double dResultado = 0;
			
			switch (acao) {
			
				case 1:
						dResultado = numero1 + numero2;
						msg = "A soma �: ";
				break;
				
				case 2:
						dResultado = numero1 - numero2;
						msg = "A subtracao �: ";
				break;
				
				case 3:
						dResultado = numero1 * numero2;
						msg = "A multiplicacao e: ";
				break;
				
				case 4:
						if (numero2 != 0) {
							
							dResultado = numero1 / numero2;
							msg = "A divisao e: ";
							
						} else {
							
							dResultado = 999999999.999999999;
							msg = "Erro de divisao por zero";
						}
				break;
				
				default:
						JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			
			}
			
			mostraResultado(msg + dResultado);
			
		}

	}
	
	static void mostraResultado(String recmsgdresult) {
		
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);
		
	}

}
