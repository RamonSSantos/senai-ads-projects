package projcalcversao4; //Informando o pacote

import javax.swing.JOptionPane; //Importando a biblioteca JOptionPane

public class Calculadora { //Iniciando a classe Calculadora

	public static void main(String[] args) { //Iniciando o m�todo main
		
		while(true) { //Enquanto for true, execute o que est� dentro da estrutura while
			
			int numero1=EntradaSaida.infonum1(); //Chamando o m�todo infonum1 da Classe EntradaSaida. O valor recebido pelo m�todo, � atribuido na variavel numero1 tipo inteira
			int numero2=EntradaSaida.infonum2(); //Chamando o m�todo infonum2 da Classe EntradaSaida. O valor recebido pelo m�todo, � atribuido na variavel numero2 tipo inteira
			int acao=EntradaSaida.infop(); //Chamando o m�todo infop da Classe EntradaSaida. O valor recebido pelo m�todo, � atribuido na variavel acao tipo inteira
			
			String msg = calcular(numero1,numero2,acao); //Chamando o m�todo local calcular(), passandro como parametro as variaveis: numero1, numero2, acao. O valor recebido � atribuido na variavel msg tipo String
			
			EntradaSaida.mostraResultado(msg); //Chamado o m�todo mostraResultado da classe EntradaSaida passando como parametro a variavel msg que foi recebido do m�todo local calcular()
		} //Se nao receber nenhum valor FALSE, a estrutura while � executada novamente
	} //Encerramento do m�todo main
	
	/*
	 * Declarando o m�todo local calcular(). Encaminha para a execucao do calculo escolhido para execucao e recebe o resultado do calculo para que seja executado
	 */
	private static String calcular(int numero1, int numero2, int operacao) { //Declarando o m�todo EST�TICO calcular() tipo String. Passando neste m�todo as variaveis numero1, numero2, operacao, de tipo int
		
		String mens = ""; //Declarando a variavel mens tipo String e atribuindo "vazio"
		switch(operacao) { //Iniciando a estrutura de repeticao switch, lendo o valor da variavel operacao
		
			case 1:
				Soma soma = new Soma(); //Cria o objeto soma instanciando-o para a classe Soma
				mens=soma.calcular(numero1,numero2); //Acessa o metodo calcular() da classe Soma pelo objeto soma passando como parametro as variaveis: numero1, numero2. O resultado do calculo retornado � armazenado na variavel mens
			break;
			
			case 2:
				Subtracao sub = new Subtracao(); //Cria o objeto sub instanciando-o para a classe Subtracao
				mens=sub.calcular(numero1,numero2); //Acessa o metodo calcular() da classe Subtracao pelo objeto sub passando como parametro as variaveis: numero1, numero2. O resultado do calculo retornado � armazenado na variavel mens
			break;
			
			case 3:
				Multiplicacao multi = new Multiplicacao(); //Cria o objeto multi instanciando-o para a classe Multiplicacao
				mens=multi.calcular(numero1,numero2); //Acessa o metodo calcular() da classe Multiplicacao pelo objeto multi passando como parametro as variaveis: numero1, numero2. O resultado do calculo retornado � armazenado na variavel mens
			break;
			
			case 4:
				Divisao divi = new Divisao(); //Cria o objeto divi instanciando-o para a classe Divisao
				mens=divi.calcular(numero1,numero2); //Acessa o metodo calcular() da classe Divisao pelo objeto divi passando como parametro as variaveis: numero1, numero2. O resultado do calculo retornado � armazenado na variavel mens
			break;
			
			case 5:
				System.exit(0); //Encerra o programa
			break;
			
			default:
				//Chama o m�todo showMessageDialog da classe JOptionPane. Executa o m�todo com: null(posicao central da tela, Mensagem principal da tela, titulo da janela, Botao da janela)
				JOptionPane.showMessageDialog(null, "Opcao inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break;
		} //Encerra a declaracao do switch
		
		return mens;
	} //Encerramento do m�todo calcular
} //Encerramento da classe Calculadora
