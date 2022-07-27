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
			 * Acesso o método calcular() da classe Controladora e o resultado do cálculo retornado é armazenado na variavel msg
			 */
			
			String msg = controle.calcular(numero1,numero2,acao);
			
			/*
			 * Acesso o método mostraResultado() para apresentar o resultado final do calculo, retornado pelo método calcular() da classe Controladora
			 */
			
			EntradaSaida.mostraResultado(msg);
			
		}
	}
}