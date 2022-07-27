package classesobjetoscasa;//Declaracao do pacote classesobjetoscasa

import java.util.List;//Importando List

public class Casa {//Declaracao da classe Casa

	//Declaracao dos atributos da classe
	//private só podem ser acessados por esta classe
	private String descricao;
	private String cor;
	private List<Janela> listaDeJanelas;//Criando o atributo listaDeJanelas tipo List da classe Janela
	private List<Porta> listaDePortas;//Criando o atributo listaDePortas tipo List da classe Porta
	
	//Armazenando o valor recebido para a descricao da casa
	public String getDescricao() {
		return this.descricao;
	}
	
	//Recebendo o valor enviado para a descricao da casa
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Armazenando o valor recebido para a cor da casa
	public String getCor() {
		return this.cor;
	}
	
	//Recebe o valor enviado para a cor da casa
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Armazenando o valor recebido para a descricao e status da(s) porta(s) da casa
	public List<Janela> getListaDeJanelas() {
		return this.listaDeJanelas;
	}
	
	//Recebendo o valor enviado para a descricao e status da(s) porta(s) da casa
	public void setListaDeJanelas(List<Janela> listaDeJanelas) {
		this.listaDeJanelas = listaDeJanelas;
	}
	
	//Armazenando o valor recebido para a descricao e status da(s) janelas(s) da casa
	public List<Porta> getListaDePortas() {
		return this.listaDePortas;
	}
	
	//Recebendo o valor enviado para a descricao e status da(s) janelas(s) da casa
	public void setListaDePortas(List<Porta> listadePortas) {
		this.listaDePortas = listadePortas;
	}
	
	/*
	 * O metodo construirCasa() esta preparado para receber a Lista de Janelas(descricao, status),
	 * Lista de Portas(descricao, status), cor e descricao da casa. Observe que apos receber os
	 * valores da casa, estes sao repassados para os seus respectivos metodos de armazenamento,
	 * setListaJanelas(), setListaDePortas(), setCor(), setDescricao()
	 */
	public void construirCasa(String descricao, String cor, List<Janela> listaDeJanelas, List<Porta> listaDePortas) {
		
		setDescricao(descricao);
		setCor(cor);
		setListaDeJanelas(listaDeJanelas);
		setListaDePortas(listaDePortas);
	}
	
	/*
	 * O método abaixo recebe a cor informada pelo usuario e na sequencia o redireciona para o metodo 
	 * setCor(), para que este o armazene no atributo cor
	 */
	public void pintarCasa(String cor) {
		setCor(cor);//Passandro a variavel cor dentro do método SetCor recebido no metodo pintarCasa
	}
	
	public void movimentarPorta(int index, int status) {//Recebe a identificacao e status de cada porta
		
		Porta porta = listaDePortas.get(index);//Cria o objeto porta da classe Porta instanciando para a listaDePortas recebendo a identificacao da porta que foi recebida pelo metodo
		porta.setStatus(status);//Definindo no metodo setStatus() do objeto porta o status da porta
		listaDePortas.set(index, porta);//Definindo no objeto listaDePortas a identificacao de cada porta
	}
	
	public void movimentarJanela(int index, int status) {//Recebe a identificacao e status de cada janela
		
		Janela janela = listaDeJanelas.get(index);//Cria o objeto janela da classe Janela instanciando para a listaDeJanelas recebendo a identificacao da janela que foi recebida pelo metodo
		janela.setStatus(status);//Definindo no metodo setStatus() do objeto janela o status da janela
		listaDeJanelas.set(index, janela);//Definindo no objeto listaDeJanelas a identificacao de cada janela
	}
}