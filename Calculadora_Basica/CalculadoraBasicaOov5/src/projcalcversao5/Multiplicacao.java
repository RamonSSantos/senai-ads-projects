package projcalcversao5; //Informando o pacote

public class Multiplicacao { //Iniciando a classe Multiplicacao

	public String calcular(int num1, int num2) { //Declarando o m�todo DINAMICO calcular() tipo String. Passando neste m�todo as variaveis num1, num2, de tipo int
		
		int dResultado = 0; //Declarando a variavel dResultado tipo int e atribuindo o valor 0
		String msg = ""; //Declarando a variavel msg tipo String e atribuindo "vazio"
		
		dResultado = num1*num2; //Atribui na variavel dResultado a multiplicacao do numero1 e numero2
		
		msg = "A multiplicacao �: " + dResultado; //Atribui na variavel msg a mensagem de acordo com a operacao e faz a concatena�ao do resultado da operacao
		return msg; //Retorna para o m�todo calcular() a variavel msg
	}
}