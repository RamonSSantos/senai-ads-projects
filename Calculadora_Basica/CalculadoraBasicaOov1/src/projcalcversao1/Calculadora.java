package projcalcversao1; //Declarando nome do pacote

import javax.swing.JOptionPane; //Importando pacote JOptionPane (nativo do Java)

public class Calculadora { //Inicializando a classe publica Calculadora**
						   //Classe publica tem a caracteristica de quando o programa for iniciado, tudo que tiver dentro dessa classe (atributos/variaveis), estarao disponiveis a qualquer momento na memoria do computador para serem utilizados

	public static void main(String[] args) { //Inicializando o metodo main
		
		while (true) { //Executando a estrutura de repeticao while (enquanto nao receber nenhum valor "FALSE", ela ser� sempre executada)
			
				int numero1 = EntradaSaida.infonum1(); //Chamando o m�todo infonum1 na Classe EntradaSaida. O valor recebido � atribuido  na vari�vel numero1 tipo inteira
				
				int numero2 = EntradaSaida.infonum2(); //Chamando o m�todo infonum2 na Classe EntradaSaida. O valor recebido � atribuido  na vari�vel numero2 tipo inteira
				
				int acao = EntradaSaida.infop(); //Chamando o m�todo infop na Classe EntradaSaida. O valor recebido � atribuido  na vari�vel acao tipo inteira
				
				String msg = " "; //Declarando a variavel msg tipo String e atribuindo "espa�o em branco"
				double dResultado = 0; //Declarando a variavel dResultado tipo double e atribuindo o valor 0
				//Vari�veis msg e dResultado serao usadas na estrutura de repeticao switch case. Para limpar o processamento anterior, a atribuicao acima � executada para limpar a "sujeira"
				
				switch (acao) { //Iniciando a estrutura de repeticao switch, lendo o valor da variavel acao
				
					case 1:
							dResultado = numero1 + numero2; //Atribui na variavel dResultado a soma do numero1 e numero2
							msg = "A soma �: "; //Atribui na variavel msg a mensagem
					break; //Encerra o processamento do switch
					
					case 2:
							dResultado = numero1 - numero2; //Atribui na variavel dResultado a subtracao do numero1 e numero2
							msg = "A subtracao �: "; //Atribui na variavel msg a mensagem
					break; //Encerra o processamento do switch
					
					case 3:
							dResultado = numero1 * numero2; //Atribui na variavel dResultado a multiplicacao do numero1 e numero2
							msg = "A multiplicacao e: "; //Atribui na variavel msg a mensagem
					break; //Encerra o processamento do switch
					
					case 4:
							if (numero2 != 0) { //Se o numero2 for diferente de 0, executa o processamento abaixo...
								
								dResultado = numero1 / numero2; //Atribui na variavel dResultado a divisao do numero1 e numero2
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
							//Chama o m�todo showMessageDialog da classe JOptionPane. Executa o m�todo com: null(posicao central da tela, Mensagem principal da tela, titulo da janela, Botao da janela)
							JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
					break; //Encerra o processamento do switch
				
				} //Encerra a declaracao do switch
				
				//Chama o m�todo mostraResultado da classe EntradaSaida passando msg + dResultado (concatenacao)
				EntradaSaida.mostraResultado(msg + dResultado);
			
		} //Encerra o while (como nao recebeu nenhum valor "FALSE", o mesmo � executado novamente)

	} //Encerra o m�todo main

} //Encerra a classe Calculadora
