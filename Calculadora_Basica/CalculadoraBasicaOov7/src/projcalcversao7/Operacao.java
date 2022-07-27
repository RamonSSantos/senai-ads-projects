package projcalcversao7;

public abstract class Operacao implements Ioperacao {
	
	/*
	 * Declaracao dos atributos que serao utilizados pelas classes filhas.
	 * Isto evita que estas tenham que declará-las de forma repetitiva.
	 * Foram declarados com o modificador protected(protegido), significando
	 * que somente as classes filhas poderao fazer uso destes.
	 */
	protected int m_numero1;
	protected int m_numero2;
	
	/*
	 * Método que recebe os valores a serem armazenados nos atributos m_numero1 e m_numero2
	 */
	public void ajustaValores(int numero1, int numero2) {
		
		// Armazena o valor do numero1 informado pelo usuário no atributo m_numero1
		m_numero1=numero1;
		// Armazena o valor do numero2 informado pelo usuário no atributo m_numero2
		m_numero2=numero2;
	}
	
	/*
	 * Declaracao do método abstrato calcular(),
	 * que obriga as classes filhas a implementá-lo
	 */
	abstract public String calcular();

}