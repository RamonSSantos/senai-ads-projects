package projcalcversao7;

/*
 * Abaixo na declaracao da classe Subtracao efetivando o relacionamento
 * por herança com a classe Operacao a partir do extends seguido do 
 * nome da classe Operacao
 */
public class Subtracao extends Operacao {
	
	/*
	 * Abaixo o método construtor inicializando os atributos m_numero1 e m_numero2
	 * assim que a classe Subtracao for instanciada, ou seja new Subtracao()
	 */
	public Subtracao() {
		
		//Inicializando os atributos
		m_numero1=0;
		m_numero2=0;
	}
	
	//Método que realiza o calculo da Subtracao
	public String calcular() {
		
		double dResultado=0;
		String msg="";
		
		//Perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado=m_numero1-m_numero2;
		msg="A subtracao é: " + dResultado;
		
		return msg;
	}
}