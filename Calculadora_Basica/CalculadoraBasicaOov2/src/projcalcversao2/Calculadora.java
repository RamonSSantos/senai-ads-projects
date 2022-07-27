package projcalcversao2; //Informando o pacote

public class Calculadora { //Iniciando a classe Calculadora

	public static void main(String[] args) { //Iniciando o método main
		
		while (true) { //Enquanto for true, execute o que está dentro da estrutura while
		
			int numero1 = EntradaSaida.infonum1(); //Chamando o método infonum1 da Classe EntradaSaida. O valor recebido pelo método, é atribuido na variavel numero1 tipo inteira
			int numero2 = EntradaSaida.infonum2(); //Chamando o método infonum2 da Classe EntradaSaida. O valor recebido pelo método, é atribuido na variavel numero2 tipo inteira
			int acao = EntradaSaida.infop(); //Chamando o método infop da Classe EntradaSaida. O valor recebido pelo método, é atribuido na variavel acao tipo inteira
			
			/*
			 * Para acessar "metódos dinamicos", somente por meio de objetos
			 * Uma copia da classe Operacoes é criada para o objeto oper. Quando essa instrucao for executada, uma copia da classe Operacoes é criada em memoria para que o objeto oper possa acessar as informacoes contidas nos métodos desta
			 */
			Operacoes oper = new Operacoes(); //Criando o objeto "oper" do tipo "Operacoes", instanciando da classe Operacoes
			String msg = oper.calcular(numero1, numero2, acao); //Por meio do objeto "oper", é acessado o método "Calcular" que passa como parametro: numero1, numero2, acao. O valor recebido deste método, retorna para a variavel msg tipo String
			
			EntradaSaida.mostraResultado(msg); //Chamado o método mostraResultado da classe EntradaSaida passando como parametro a variavel msg
		
		} //Se nao receber nenhum valor FALSE, a estrutura while é executada novamente
	} //Encerramento do método main
} //Encerramento da classe Calculadora