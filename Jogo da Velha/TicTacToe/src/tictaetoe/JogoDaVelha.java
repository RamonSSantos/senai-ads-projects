package tictaetoe; //Pacote principal

//Importando bibliotecas
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Iniciando a classe JogoDaVelha / extendida no JPanel / implementando MouseListener (captura as coordenadas do mouse)
public class JogoDaVelha extends JPanel implements MouseListener {
    
	private static final long serialVersionUID = 1L;
	
	//Fontes
	private Font Casas = new Font("Consolas", Font.BOLD, 80);
    private Font Vencedor = new Font("Consolas", Font.BOLD, 30);
    private Font Placar = new Font("Consolas", Font.BOLD, 15); 
    
    //Variáveis privadas
    private int matriz[][];
    private int jogador;
    private int ganhador;
    private int jogarNovamente;
    private boolean jogarNov;
    private int vitoria1;
    private int vitoria2;
    private int empates;
    
    //Método
    public JogoDaVelha() {

    //Variáveis
    jogador = 1;
    ganhador = 0;
    jogarNov = false;
    vitoria1 = 0;
    vitoria2 = 0;
    empates = 0;
    matriz = new int[3][3];
    
    	//Mostra a matriz no Console
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                System.out.print(matriz[lin][col]);
            }
            System.out.println();
        }
    }
    
    //Método paintComponent
    @Override
    public void paintComponent(Graphics tela2) {
    
        Graphics2D tela = (Graphics2D) tela2.create();
        System.out.println();
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                System.out.print(matriz[lin][col]);
            }
            System.out.println();
        }
        
        //Verifica variável jogarNov
        if(jogarNov) {
    		//Pergunta se o usuário deseja jogar novamente
            jogarNovamente = JOptionPane.showConfirmDialog(null, "Deseja jogador novamente?");
            
            //Se a opcao jogar novamente for sim
            if (jogarNovamente == JOptionPane.YES_OPTION) {
                jogarNov = false;
                reiniciarJogo();
            } else { //Se a opcao jogar novamente for nao
                System.exit(1);
            }
        }
        
        //Desenha as linhas e colunas do jogo da velha
        tela.setFont(Casas);
        tela.setStroke(new BasicStroke(5)); //Expessura da Linha
        tela.setColor(Color.WHITE);
        tela.fillRect(0,0,610,635); //Preenche a área do jogo em forma de retangulo
        
        tela.setColor(Color.BLACK);
        tela.drawLine(0,200,610,200);
        tela.drawLine(0,400,610,400);
        
        tela.drawLine(200,0,200,635);
        tela.drawLine(400,0,400,635);
        
        //Desenha a construcao do jogo da velha
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                if(matriz[lin][col] == 1) {
                	//Jogador 01 "O" - VERMELHO
                    tela.setColor(Color.RED);
                    tela.drawString("O", 80 + col*200, 125 + lin*200);
                } else if(matriz[lin][col] == 2) {
                	//Jogador 02 "X" - AZUL
                    tela.setColor(Color.BLUE);
                    tela.drawString("X", 80 + col*200, 125 + lin*200);
                }
            }
            System.out.println();
        }
        
        //Verifica se houve ganhador na partida
        if(ganhador != 0) {
            tela.setFont(Vencedor);
            
          //Verifica se houve empate na partida
            if(ganhador == 3) {
                tela.setColor(Color.GRAY);
                tela.drawString("O jogo empatou", 180,180);
            } else {
                
            	//Verifica se o ganhador foi o jogador 01
                if(ganhador == 1) {
                    tela.setColor(Color.RED);
                } else if(ganhador == 2) { //Verifica se o ganhador foi o jogador 02
                    tela.setColor(Color.BLUE);
                }
                
                //Mostra o ganhador da partida
                tela.drawString("O jogador " + ganhador + " venceu", 150, 180);
            }
            
            jogarNov = true; //Variável jogarNov recebe verdadeiro
            repaint(); //Atualiza o JPanel
        }
        
        //Mostra o placar na tela
        tela.setFont(Placar);
        
        //Jogador 01
        tela.setColor(Color.RED);
        tela.drawString("Vitorias: " + vitoria1, 55,20);
        
        //Empate
        tela.setColor(Color.BLACK);
        tela.drawString("Empates: " + empates, 260,20);
        
        //Jogador 02
        tela.setColor(Color.BLUE);
        tela.drawString("Vitorias: " + vitoria2, 455,20);   
    }
    
    //Método Clique do mouse para o desenvolvimento do jogo da velha
    @Override
    public void mouseClicked(MouseEvent e) {
        
        //System.out.println(e.getX() + " , " + e.getY());
        
    	//Definindo os espaços limites nas coordenadas X e Y
        int linha = (e.getY() - 25) / 200;
        int coluna = (e.getX() - 5) / 200;
        
        //Se o usuário clicar fora do limite da matriz (linha 3)
        if(linha == 3) {
            linha = 2;
        } //Se o usuário clicar fora do limite da matriz (coluna 3)
        if(coluna == 3) {
            coluna =2;
        }
        
        //Mostra no Console qual linha e coluna o usuário clicou
        System.out.println("Clicou na linha " + linha);
        System.out.println("Clicou na coluna " + coluna);
        
        //Alterna as posicoes jogador 01 e jogaor 02 durante cada rodada
        if(jogador == 1 && matriz[linha][coluna] == 0) {
            matriz[linha][coluna] = 1;
            jogador = 2;
        } else if(jogador == 2 && matriz[linha][coluna] == 0) {
            matriz[linha][coluna] = 2;
            jogador = 1;
        }
        
        verificaGanhador(); //Inicia o método verificaGanhador
        repaint(); //Atualiza o JPanel
    }
    
    //Método reiniciar o jogo
    private void reiniciarJogo() {
        
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                matriz[lin][col] = 0; //Zerando a matriz
                ganhador = 0; //Zerando a variável ganhador
            }    
        }
    }
    
    //Método verifica o ganhador da partida
    private void verificaGanhador() {
    
    	//Verifica as linhas
        for(int lin = 0; lin < 3; lin++) {
            if(matriz[lin][0] == matriz[lin][1] && matriz[lin][0] == matriz[lin][2] && matriz[lin][0] != 0) {
                System.out.println("Houve um ganhador");
                ganhador = matriz[lin][0];
                break;
            }
        }
        
        //Verifica as colunas
        for(int col = 0; col < 3; col++) {
            if(matriz[0][col] == matriz[1][col] && matriz[0][col] == matriz[2][col] && matriz[0][col] != 0) {
                System.out.println("Houve um ganhador");
                ganhador = matriz[0][col];
                break;
            }
        }
        
        //Verifica a diagonal principal
        if(matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 0) {
            System.out.println("Houve um ganhador");
            ganhador = matriz[0][0];
        }
        
      //Verifica a diagonal secundária
        if(matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0] && matriz[0][2] != 0) {
            System.out.println("Houve um ganhador");
            ganhador = matriz[0][2];
        }
        
        //Conta 1 vitória quando o jogador 01 vence alguma partida
        if(ganhador == 1) {
            vitoria1++;
        } else if(ganhador == 2) { //Conta 1 vitória quando o jogador 02 vence alguma partida
            vitoria2++;
        } else {
            
        	////Conta 1 empate quando o jogo termina empatado
            boolean cheia = true; //Posiçao inicial = verdadeira
            
            for(int lin = 0; lin < 3; lin++) {
                for(int col = 0; col <3; col++) {
                    if(matriz[lin][col] == 0) {
                        cheia = false; //Recebe falsa quando a matriz estiver zerada
                    }
                }    
            }
            if(cheia) { //Se for verdadeiro
                ganhador = 3; //Ganhador recebe 3
                empates++; //Contagem de empates
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
         
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}