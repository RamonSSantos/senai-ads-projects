package classesobjetocarro;

import java.util.List;

public class Estoque {

	private List<Carro> listaDeCarros;

	public List<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	public void setListaDeCarros(List<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}
	
	public void addCarro(List<Carro> listadeCarros) {
		
		setListaDeCarros(listadeCarros);
	}
	
	public void excluirCarro(int opCarro) {
		
		listaDeCarros.remove(opCarro);
	}
}