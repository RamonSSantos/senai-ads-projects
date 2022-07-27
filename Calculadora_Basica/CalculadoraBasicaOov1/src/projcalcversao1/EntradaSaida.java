package projcalcversao1; //Declarando nome do pacote

import javax.swing.JOptionPane; //Importando pacote JOptionPane (nativo do Java)

public class EntradaSaida { //Inicializando a classe publica EntradaSaida
	
	static int infonum1() { //Declarando o m�todo infonum1 tipo inteiro e est�tico (este m�todo ir� receber valores)
		
		//Chamando o m�todo showInputDialog da classe JOptionPane. Executando o m�todo  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num1 tipo inteira. Chamando o m�todo parseInt da classe Integer que ir� tranformar o valore recebido da caixa de mensagem de String para int
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
		return num1; //Retornando o valor recebido na vari�vel num1
	} //Encerra o metodo
	
	static int infonum2() { //Declarando o m�todo infonum2 tipo inteiro e est�tico (este m�todo ir� receber valores)
		
		//Chamando o m�todo showInputDialog da classe JOptionPane. Executando o m�todo  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num2 tipo inteira. Chamando o m�todo parseInt da classe Integer que ir� tranformar o valore recebido da caixa de mensagem de String para int
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
		return num2; //Retornando o valor recebido na vari�vel num2
	} //Encerra o metodo
	
	static int infop() { //Declarando o m�todo infop tipo inteiro e est�tico (este m�todo ir� receber valores)
		
		//Chamando o m�todo showInputDialog da classe JOptionPane. Executando o m�todo  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num1 tipo inteira. Chamando o m�todo parseInt da classe Integer que ir� tranformar o valore recebido da caixa de mensagem de String para int
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um calculo basico: \n"
				+ "1 - Soma \n" //Concatenando com o sinal de + - \n para pular linha
				+ "2 - Subtracao \n"
				+ "3 - Multiplicacao \n"
				+ "4 - Divisao \n"
				+ "5 - Sair do programa \n"));
		return op; //Retornando o valor recebido na vari�vel op
	} //Encerra o metodo
	
	static void mostraResultado(String recmsgdresult) { //Declarando o m�todo mostraResultado - tipo est�tico e nao ir� receber valores = void. Passando no m�todo a  vari�vel recmsgdresult tipo String (tipos de valores diferentes = String. exemplo: int e String, String prevalece. O valor recebido nao ir� ser usado para c�lculos, apenas para mostrar na tela, entao usa String) 
		
		//Chama o m�todo showMessageDialog da classe JOptionPane. Executa o m�todo com: null(posicao central da tela, Mensagem principal da tela, titulo da janela, Botao da janela)
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);
	} //Encerra o metodo

} //Encerra a classe
