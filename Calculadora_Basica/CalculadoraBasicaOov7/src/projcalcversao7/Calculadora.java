package projcalcversao7;

public class Calculadora {

	public static void main(String[] args) {
		
		// Cria o objeto comunica instanciando-o para a classe Comunicadora
		Comunicadora comunica = new Comunicadora();
		
		// Acessa o m�todo executar() da classe Comunicadora por interm�dio do objeto comunica
		comunica.executar();
	}
}