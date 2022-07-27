package projcalcversao2; //Informando o pacote

import javax.swing.JOptionPane; //Importando a biblioteca JOptionPane

public class Operacoes { //Iniciando a classe Operacoes
	
	/*
	 * Classe Operacoes é DINAMICA, pois o(s) método(s) contida nela é DINAMICO.
	 * É DINAMICO porque será utilizado somente quando for chamado (vou pegar só se precisar)
	 */
	public String calcular(int num1, int num2, int operacao) { //Declarando o método DINAMICO Calcular() tipo String. Passando neste método as variaveis num1, num2, operacao, de tipo int
		
		String msg = " "; //Declarando a variavel msg tipo String e atribuindo "espaço em branco"
		double dResultado = 0; //Declarando a variavel dResultado tipo double e atribuindo o valor 0
		//Variáveis msg e dResultado serao usadas na estrutura de repeticao switch case. Para limpar o processamento anterior, a inicializacao acima é feita para limpar a "sujeira"
		
		switch (operacao) { //Iniciando a estrutura de repeticao switch, lendo o valor da variavel operacao
		
			case 1:
					dResultado = num1 + num2; //Atribui na variavel dResultado a soma do numero1 e numero2
					msg = "A soma é: "; //Atribui na variavel msg a mensagem
			break; //Encerra o processamento do switch
			
			case 2:
					dResultado = num1 - num2; //Atribui na variavel dResultado a subtracao do numero1 e numero2
					msg = "A subtracao é: "; //Atribui na variavel msg a mensagem
			break; //Encerra o processamento do switch
			
			case 3:
					dResultado = num1 * num2; //Atribui na variavel dResultado a multiplicacao do numero1 e numero2
					msg = "A multiplicacao e: "; //Atribui na variavel msg a mensagem
			break; //Encerra o processamento do switch
			
			case 4:
					if (num2 != 0) { //Se o numero2 for diferente de 0, executa o processamento abaixo...
						
						dResultado = num1 / num2; //Atribui na variavel dResultado a divisao do numero1 e numero2
						msg = "A divisao e: "; //Atribui na variavel msg a mensagem
						
					} else { //...Senao executa o processamento abaixo
						
						dResultado = 999999999.999999999; //Atribui na variavel dResultado o valor
						msg = "Erro de divisao por zero"; //Atribui na variavel msg a mensagem
					}
			break; //Encerra o processamento do switch
			
			case 5:
					System.exit(0); //Encerra o programa
			break; //Encerra o processamento do switch
			
			default:
					//Chama o método showMessageDialog da classe JOptionPane. Executa o método com: null(posicao central da tela, Mensagem principal da tela, titulo da janela, Botao da janela)
					JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break; //Encerra o processamento do switch
		
		} //Encerra a declaracao do switch
		
		return (msg+" "+dResultado); //Retorna para o método Calcular() a variavel msg + dResultado (contatenado com um espaço em branco " ")
		
	} //Encerra o método Calcular
} //Encerra a classe Operacoes