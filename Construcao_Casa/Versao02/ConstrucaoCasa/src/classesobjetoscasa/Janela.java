package classesobjetoscasa; //Declaracao do pacote classesobjetoscasa

public class Janela {//Declaracao da classe Janela

	//Declaracao dos atributos da classe
	//private só podem ser acessados por esta classe
	private String identificacao;
	private int status;
	
	//Metodo que vai ler e retornar o dado armazenado no atributo identificacao
	public String getIdentificacao() {
		return identificacao;
	}
	
	//Metodo que armazena o dado no atributo identificacao
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	//Metodo que vai ler e retornar o dado armazenado no atributo status
	public int getStatus() {
		return status;
	}
	
	//Metodo que armazena o dado no atributo status
	public void setStatus(int status) {
		this.status = status;
	}
}