package projcalcversao7;

import javax.swing.JOptionPane;

public class Controladora {
	
	public String calcular(int numero1, int numero2, int operacao) {
		
		String mens="";
		
		/* 
		 * Declaracao do objeto chamado oper e dito que ele é do tipo Operacao,
		 * O objeto está sendo refenciado para a classe Operacao. O objeto ao longo
		 * da estrutura, assumirá a referencia dos objetos soma, subtracao, multiplicacao e divisao.
		 * A partir dele que é encaminhado a execucao do calculo escolhido pelo usuario.
		 * Ao declaracao deste objeto, é inicializado o mesmo com null, para que este possa assumir a forma
		 * dos objetos de operacao citados.
		 */
		Operacao oper=null;
		
		switch(operacao) {
		
			case 1:
				//Cria o objeto soma instanciando-o para a classe Soma
				Soma soma = new Soma();
				
				/*
				 * Atribui ao objeto oper o objeto soma, ou seja, é passado para
				 * este objeto o poder de acesso ao classe Soma
				 */
				oper = soma;
			break;
			
			case 2:
				//Cria o objeto sub instanciando-o para a classe Subtracao
				Subtracao sub = new Subtracao();
				
				/*
				 * Atribui ao objeto oper o objeto sub, ou seja, é passado para
				 * este objeto o poder de acesso ao classe Subtracao
				 */
				oper = sub;
			break;
			
			case 3:
				//Cria o objeto multi instanciando-o para a classe Multiplicacao
				Multiplicacao multi = new Multiplicacao();
				
				/*
				 * Atribui ao objeto oper o objeto multi, ou seja, é passado para
				 * este objeto o poder de acesso ao classe Multiplicacao
				 */
				oper = multi;
			break;
			
			case 4:
				//Cria o objeto divi instanciando-o para a classe Divisao
				Divisao divi = new Divisao();
				
				/*
				 * Atribui ao objeto oper o objeto divi, ou seja, é passado para
				 * este objeto o poder de acesso ao classe Divisao
				 */
				oper = divi;
			break;
			
			case 5:
				System.exit(0);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opçao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break;
		}
		
		//Verifica se o objeto oper é diferente de nulo
		if(oper != null) {
			
			/*
			 * Chama o método ajustaValor() da classe Operacao por meio do objeto oper.
			 * O objeto foi declarado com o tipo Operacao e neste ponto do programa já assumiu
			 * a referencia de um dos objetos de operaca: soma, sub, multi ou divi; que por sua vez,
			 * estao apontando para suas respectivas classes: Soma, Subtracao, Multiplicacao ou Divisao;
			 * que tambem por sua vez, respectivamente, sao classes filhas da classe Operacao
			 */
			oper.ajustaValores(numero1, numero2);
			
			/*
			 * Acessa o método calcular() da classe Soma, Subtracao, Multiplicacao ou Divisao; ou seja, 
			 * depende do objeto que o objeto oper está armazenado no momento.
			 * O resultado do calculo retornado é armazenado na variavel mens
			 */
			mens=oper.calcular();
		}
		
		return mens;
	}
}