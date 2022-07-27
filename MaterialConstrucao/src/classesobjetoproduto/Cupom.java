package classesobjetoproduto;

public class Cupom {

	private static int codigo=1;
	private int id;
	private double precoVenda;
	private int idProduto;
	
	public static int getCodigo() {
		return codigo++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
}