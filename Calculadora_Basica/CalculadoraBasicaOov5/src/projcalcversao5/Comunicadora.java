package projcalcversao5;

public class Comunicadora {
	
	public void executar() {
		
		while(true) {
			
			int numero1=EntradaSaida.infonum1();
			int numero2=EntradaSaida.infonum2();
			int acao=EntradaSaida.infop();
			
			//Cria o objeto controle instanciando-o para a classe Comunicadora
			Controladora controle = new Controladora();
			
			/*
			 * Acesso o m�todo calcular() da classe Controladora e o resultado do c�lculo retornado � armazenado na variavel msg
			 */
			
			String msg = controle.calcular(numero1,numero2,acao);
			
			/*
			 * Acesso o m�todo mostraResultado() para apresentar o resultado final do calculo, retornado pelo m�todo calcular() da classe Controladora
			 */
			
			EntradaSaida.mostraResultado(msg);
			
		}
	}
}