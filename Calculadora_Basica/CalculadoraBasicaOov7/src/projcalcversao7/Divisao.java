package projcalcversao7;

/*
 * Abaixo na declaracao da classe Divisao efetivando o relacionamento
 * por herança com a classe Operacao a partir do extends seguido do 
 * nome da classe Operacao
 */
public class Divisao extends Operacao {
	
	/*
	 * Abaixo o método construtor inicializando os atributos m_numero1 e m_numero2
	 * assim que a classe Divisao for instanciada, ou seja new Divisao()
	 */
	public Divisao() {
		
		//Inicializando os atributos
		m_numero1=0;
		m_numero2=0;
	}
	
	//Método que realiza o calculo da Divisao
	public String calcular() {
		
		double dResultado=0;
		String msg="";
		
		if (m_numero2 != 0) { //Se o numero2 for diferente de 0, executa o processamento abaixo...
			
			//Perceba que utilizamos os atributos m_numero1 e m_numero2
			dResultado=m_numero1/m_numero2;
			msg="A divisao é: " + dResultado;
		
		} else { //...Senao executa o processamento abaixo
		
				dResultado = 999999999; //Atribui na variavel dResultado o valor
				msg = "Erro de divisao por zero"; //Atribui na variavel msg a mensagem
				}
		
		return msg;
	}
}