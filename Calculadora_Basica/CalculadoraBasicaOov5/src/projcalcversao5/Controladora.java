package projcalcversao5;

import javax.swing.JOptionPane;

public class Controladora {
	
	public String calcular(int numero1, int numero2, int operacao) {
		
		String mens="";
		
		switch(operacao) {
		
			case 1:
				//Cria o objeto soma instanciando-o para a classe Soma
				Soma soma = new Soma();
				
				//Acessa o método calcular() da classe Soma e o resultado do cálculo retornado é armazenado na variavel mens
				mens=soma.calcular(numero1,numero2);
			break;
			
			case 2:
				//Cria o objeto sub instanciando-o para a classe Subtracao
				Subtracao sub = new Subtracao();
				
				//Acessa o método calcular() da classe Subtracao e o resultado do cálculo retornado é armazenado na variavel mens
				mens=sub.calcular(numero1,numero2);
			break;
			
			case 3:
				//Cria o objeto multi instanciando-o para a classe Multiplicao
				Multiplicacao multi = new Multiplicacao();
				
				//Acessa o método calcular() da classe Multiplicacao e o resultado do cálculo retornado é armazenado na variavel mens
				mens=multi.calcular(numero1, numero2);
			break;
			
			case 4:
				//Cria o objeto divi instanciando-o para a classe Divisao
				Divisao divi = new Divisao();
				
				//Acessa o método calcular() da classe Divisao e o resultado do cálculo retornado é armazenado na variavel mens
				mens=divi.calcular(numero1, numero2);
			break;
			
			case 5:
				System.exit(0);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Operacao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break;
			
		}
		return mens;	
	}
}