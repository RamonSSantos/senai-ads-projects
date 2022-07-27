package projcalcversao6;

import javax.swing.JOptionPane;

public class Controladora {
	
	public String calcular(int numero1, int numero2, int operacao) {
		
		String mens="";
		
		switch(operacao) {
		
			case 1:
				//Cria o objeto soma instanciando-o para a classe Soma
				Soma soma = new Soma();
				
				/*
				 * Chamao o método ajustaValores() da classe mae Operacao que
				 * por sua vez, recebe os valores numericos para serem armazenados
				 * nos atributos m_numero1 e m_numero2 declarados nesta classe 
				 */
				soma.ajustaValores(numero1, numero2);
				
				/*
				 * Acesso o método calcular() da classe Soma e o resultado
				 * do cálculo retornado é armazenado na variavel mens
				 */
				mens=soma.calcular();
			break;
			
			case 2:
				//Cria o objeto sub instanciando-o para a classe Subtracao
				Subtracao sub = new Subtracao();
				
				/*
				 * Chamao o método ajustaValores() da classe mae Operacao que
				 * por sua vez, recebe os valores numericos para serem armazenados
				 * nos atributos m_numero1 e m_numero2 declarados nesta classe 
				 */
				sub.ajustaValores(numero1, numero2);
				
				/*
				 * Acesso o método calcular() da classe Subtracao e o resultado
				 * do cálculo retornado é armazenado na variavel mens
				 */
				mens=sub.calcular();
			break;
			
			case 3:
				//Cria o objeto multi instanciando-o para a classe Multiplicacao
				Multiplicacao multi = new Multiplicacao();
				
				/*
				 * Chamao o método ajustaValores() da classe mae Operacao que
				 * por sua vez, recebe os valores numericos para serem armazenados
				 * nos atributos m_numero1 e m_numero2 declarados nesta classe 
				 */
				multi.ajustaValores(numero1, numero2);
				
				/*
				 * Acesso o método calcular() da classe Multiplicacao e o resultado
				 * do cálculo retornado é armazenado na variavel mens
				 */
				mens=multi.calcular();
			break;
			
			case 4:
				//Cria o objeto divi instanciando-o para a classe Divisao
				Divisao divi = new Divisao();
				
				/*
				 * Chamao o método ajustaValores() da classe mae Operacao que
				 * por sua vez, recebe os valores numericos para serem armazenados
				 * nos atributos m_numero1 e m_numero2 declarados nesta classe 
				 */
				divi.ajustaValores(numero1, numero2);
				
				/*
				 * Acesso o método calcular() da classe Divisao e o resultado
				 * do cálculo retornado é armazenado na variavel mens
				 */
				mens=divi.calcular();
			break;
			
			case 5:
				System.exit(0);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opçao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break;
		}
		
		return mens;
	}
}