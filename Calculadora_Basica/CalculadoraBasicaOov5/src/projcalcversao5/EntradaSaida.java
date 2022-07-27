package projcalcversao5; //Informando o pacote

import javax.swing.JOptionPane; //Importando a biblioteca JOptionPane

public class EntradaSaida { //Iniciando a classe estática EntradaSaida
							//Classe estática, pois os métodos dentro da mesma sao estáticos
	
	static int infonum1() {  //Declarando o método infonum1() tipo inteiro como estatico (este método será usado em outras classes)
		
		//Chamando o método showInputDialog da classe JOptionPane. Executando o método  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num1 tipo inteira. Chamando o método parseInt da classe Integer que irá tranformar o valor recebido da caixa de mensagem de String para int
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
		return num1; //Retornando o valor recebido na variável num1
	} //Encerra o metodo
	
	static int infonum2() { //Declarando o método infonum2() tipo inteiro como estatico (este método será usado em outras classes)
		
		//Chamando o método showInputDialog da classe JOptionPane. Executando o método  com a mensagem em "".
		//Atribuindo o valor recebido na variavel num2 tipo inteira. Chamando o método parseInt da classe Integer que irá tranformar o valor recebido da caixa de mensagem de String para int
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
		return num2; //Retornando o valor recebido na variável num2
	} //Encerra o metodo
	
	//Chamando o método showInputDialog da classe JOptionPane. Executando o método  com a mensagem em "".
	//Atribuindo o valor recebido na variavel op tipo inteira. Chamando o método parseInt da classe Integer que irá tranformar o valor recebido da caixa de mensagem de String para int
	static int infop() { //Declarando o método infop() tipo inteiro como estatico (este método será usado em outras classes)
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um calculo basico: \n"
				+ "1 - Soma \n" //Concatenando com o sinal de + - \n para pular linha
				+ "2 - Subtracao \n"
				+ "3 - Multiplicacao \n"
				+ "4 - Divisao \n"
				+ "5 - Sair do programa \n"));
		return op; //Retornando o valor recebido na variável op
	} //Encerra o metodo
	
	static void mostraResultado(String recmsgdresult) { //Declarando o método mostraResultado - tipo estático e nao irá receber valores = void. Passando no método a variável recmsgdresult tipo String (tipos de valores diferentes = String. exemplo: int e String, String prevalece. O valor recebido nao irá ser usado para cálculos, apenas para mostrar na tela, entao usa String)
		
		//Chama o método showMessageDialog da classe JOptionPane. Executa o método com: null(posicao central da tela, Mensagem principal da tela, titulo da janela, Botao da janela)
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);
	} //Encerra o metodo
} //Encerra a Classe