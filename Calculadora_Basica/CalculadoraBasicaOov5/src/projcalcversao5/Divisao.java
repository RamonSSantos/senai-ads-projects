package projcalcversao5; //Informando o pacote

public class Divisao { //Iniciando a classe Divisao

	public String calcular(int num1, int num2) { //Declarando o método DINAMICO calcular() tipo String. Passando neste método as variaveis num1, num2, de tipo int
		
		int dResultado = 0; //Declarando a variavel dResultado tipo int e atribuindo o valor 0
		String msg = ""; //Declarando a variavel msg tipo String e atribuindo "vazio"
		
		if (num2 != 0) { //Se o numero2 for diferente de 0, executa o processamento abaixo...
			
			dResultado = num1/num2; //Atribui na variavel dResultado a divisao do numero1 e numero2
			msg = "A divisao é: " + dResultado; //Atribui na variavel msg a mensagem de acordo com a operacao e faz a concatenaçao do resultado da operacao
		
		} else { //...Senao executa o processamento abaixo
		
				dResultado = 999999999; //Atribui na variavel dResultado o valor
				msg = "Erro de divisao por zero"; //Atribui na variavel msg a mensagem
			}
		return msg; //Retorna para o método calcular() a variavel msg
	}
}