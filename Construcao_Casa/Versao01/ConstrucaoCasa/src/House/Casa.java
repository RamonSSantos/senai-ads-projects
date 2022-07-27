package House;

public class Casa {

    private String descricaoCasa;
    private String corCasa;
    private int movimentoPorta;
    private int movimentoJanela;

	public void construirCasa() {
		
		while(true) {
			
			descricaoCasa=MenuOpcoes.descricaoCasa();
			corCasa=MenuOpcoes.corCasa();
			
			int qt_Portas=MenuOpcoes.qtPortas();
			int qt_Janelas=MenuOpcoes.qtJanelas();
			
			String id_Porta=Porta.idPorta();
            movimentoPorta=MenuOpcoes.statusPorta(id_Porta);
            String movimentoPortaEscolhida=MenuOpcoes.statusPortaEscolhida(movimentoPorta);
                        
			String id_Janela=Janela.idJanela();
			movimentoJanela=MenuOpcoes.statusJanela(id_Janela);
            String movimentoJanelaEscolhida=MenuOpcoes.statusJanelaEscolhida(movimentoJanela);
			
			boolean mPorta=Porta.estadoPorta(movimentoPorta);
			boolean mJanela=Janela.estadoJanela(movimentoJanela);
                        
            int opcaoEscolhidaMenu=MenuOpcoes.exibirMenu();
			MenuOpcoes.exibirInformacoesCasa(opcaoEscolhidaMenu, descricaoCasa, corCasa, qt_Portas, qt_Janelas, id_Porta, id_Janela, movimentoPortaEscolhida, movimentoJanelaEscolhida);
		}
    }

    public String getDescricaoCasa() {
        return descricaoCasa;
    }

    public void setDescricaoCasa(String descricaoCasa) {
        this.descricaoCasa = descricaoCasa;
    }

    public String getCorCasa() {
        return corCasa;
    }

    public void setCorCasa(String corCasa) {
        this.corCasa = corCasa;
    }

    public int getMovimentoPorta() {
        return movimentoPorta;
    }

    public void setMovimentoPorta(int movimentoPorta) {
        this.movimentoPorta = movimentoPorta;
    }

    public int getMovimentoJanela() {
        return movimentoJanela;
    }

    public void setMovimentoJanela(int movimentoJanela) {
        this.movimentoJanela = movimentoJanela;
    }
}