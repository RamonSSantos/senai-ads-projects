package projcalcversao7;

public class Calculadora {

	public static void main(String[] args) {
		
		// Cria o objeto comunica instanciando-o para a classe Comunicadora
		Comunicadora comunica = new Comunicadora();
		
		// Acessa o método executar() da classe Comunicadora por intermédio do objeto comunica
		comunica.executar();
	}
}