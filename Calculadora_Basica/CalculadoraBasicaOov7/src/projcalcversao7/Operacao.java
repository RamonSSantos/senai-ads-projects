package projcalcversao7;

public abstract class Operacao implements Ioperacao {
	
	/*
	 * Declaracao dos atributos que serao utilizados pelas classes filhas.
	 * Isto evita que estas tenham que declar�-las de forma repetitiva.
	 * Foram declarados com o modificador protected(protegido), significando
	 * que somente as classes filhas poderao fazer uso destes.
	 */
	protected int m_numero1;
	protected int m_numero2;
	
	/*
	 * M�todo que recebe os valores a serem armazenados nos atributos m_numero1 e m_numero2
	 */
	public void ajustaValores(int numero1, int numero2) {
		
		// Armazena o valor do numero1 informado pelo usu�rio no atributo m_numero1
		m_numero1=numero1;
		// Armazena o valor do numero2 informado pelo usu�rio no atributo m_numero2
		m_numero2=numero2;
	}
	
	/*
	 * Declaracao do m�todo abstrato calcular(),
	 * que obriga as classes filhas a implement�-lo
	 */
	abstract public String calcular();

}