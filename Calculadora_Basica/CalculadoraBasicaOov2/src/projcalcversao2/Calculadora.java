package projcalcversao2; //Informando o pacote

public class Calculadora { //Iniciando a classe Calculadora

	public static void main(String[] args) { //Iniciando o m�todo main
		
		while (true) { //Enquanto for true, execute o que est� dentro da estrutura while
		
			int numero1 = EntradaSaida.infonum1(); //Chamando o m�todo infonum1 da Classe EntradaSaida. O valor recebido pelo m�todo, � atribuido na variavel numero1 tipo inteira
			int numero2 = EntradaSaida.infonum2(); //Chamando o m�todo infonum2 da Classe EntradaSaida. O valor recebido pelo m�todo, � atribuido na variavel numero2 tipo inteira
			int acao = EntradaSaida.infop(); //Chamando o m�todo infop da Classe EntradaSaida. O valor recebido pelo m�todo, � atribuido na variavel acao tipo inteira
			
			/*
			 * Para acessar "met�dos dinamicos", somente por meio de objetos
			 * Uma copia da classe Operacoes � criada para o objeto oper. Quando essa instrucao for executada, uma copia da classe Operacoes � criada em memoria para que o objeto oper possa acessar as informacoes contidas nos m�todos desta
			 */
			Operacoes oper = new Operacoes(); //Criando o objeto "oper" do tipo "Operacoes", instanciando da classe Operacoes
			String msg = oper.calcular(numero1, numero2, acao); //Por meio do objeto "oper", � acessado o m�todo "Calcular" que passa como parametro: numero1, numero2, acao. O valor recebido deste m�todo, retorna para a variavel msg tipo String
			
			EntradaSaida.mostraResultado(msg); //Chamado o m�todo mostraResultado da classe EntradaSaida passando como parametro a variavel msg
		
		} //Se nao receber nenhum valor FALSE, a estrutura while � executada novamente
	} //Encerramento do m�todo main
} //Encerramento da classe Calculadora