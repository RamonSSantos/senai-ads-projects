package projcalcversao7;

/*
 * Abaixo na declaracao da classe Multiplicacao efetivando o relacionamento
 * por heran?a com a classe Operacao a partir do extends seguido do 
 * nome da classe Operacao
 */
public class Multiplicacao extends Operacao {
	
	/*
	 * Abaixo o m?todo construtor inicializando os atributos m_numero1 e m_numero2
	 * assim que a classe Multiplicacao for instanciada, ou seja new Multiplicacao()
	 */
	public Multiplicacao() {
		
		//Inicializando os atributos
		m_numero1=0;
		m_numero2=0;
	}
	
	//M?todo que realiza o calculo da Multiplicacao
	public String calcular() {
		
		double dResultado=0;
		String msg="";
		
		//Perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado=m_numero1*m_numero2;
		msg="A multiplicacao ?: " + dResultado;
		
		return msg;
	}
}