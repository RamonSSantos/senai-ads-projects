package projcalcversao5; //Informando o pacote

import javax.swing.JOptionPane; //Importando a biblioteca JOptionPane

public class EntradaSaida { //Iniciando a classe est�tica EntradaSaida
							//Classe est�tica, pois os m�todos dentro da mesma sao est�ticos
	
	static int infonum1() {  //Declarando o m�todo infonum1() tipo inteiro como estatico (este m�todo ser� usado em outras classes)
		
		//Chamando o m�todo showInputDialog da classe JOptionPane. Executando o m�todo  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num1 tipo inteira. Chamando o m�todo parseInt da classe Integer que ir� tranformar o valor recebido da caixa de mensagem de String para int
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
		return num1; //Retornando o valor recebido na vari�vel num1
	} //Encerra o metodo
	
	static int infonum2() { //Declarando o m�todo infonum2() tipo inteiro como estatico (este m�todo ser� usado em outras classes)
		
		//Chamando o m�todo showInputDialog da classe JOptionPane. Executando o m�todo  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num2 tipo inteira. Chamando o m�todo parseInt da classe Integer que ir� tranformar o valor recebido da caixa de mensagem de String para int
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
		return num2; //Retornando o valor recebido na vari�vel num2
	} //Encerra o metodo
	
	//Chamando o m�todo showInputDialog da classe JOptionPane. Executando o m�todo  com a mensagem em "".
	//Atribuindo o valor recebido na variavel op tipo inteira. Chamando o m�todo parseInt da classe Integer que ir� tranformar o valor recebido da caixa de mensagem de String para int
	static int infop() { //Declarando o m�todo infop() tipo inteiro como estatico (este m�todo ser� usado em outras classes)
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um calculo basico: \n"
				+ "1 - Soma \n" //Concatenando com o sinal de + - \n para pular linha
				+ "2 - Subtracao \n"
				+ "3 - Multiplicacao \n"
				+ "4 - Divisao \n"
				+ "5 - Sair do programa \n"));
		return op; //Retornando o valor recebido na vari�vel op
	} //Encerra o metodo
	
	static void mostraResultado(String recmsgdresult) { //Declarando o m�todo mostraResultado - tipo est�tico e nao ir� receber valores = void. Passando no m�todo a vari�vel recmsgdresult tipo String (tipos de valores diferentes = String. exemplo: int e String, String prevalece. O valor recebido nao ir� ser usado para c�lculos, apenas para mostrar na tela, entao usa String)
		
		//Chama o m�todo showMessageDialog da classe JOptionPane. Executa o m�todo com: null(posicao central da tela, Mensagem principal da tela, titulo da janela, Botao da janela)
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);
	} //Encerra o metodo
} //Encerra a Classe