
public class Cenario {
	public static void main(String[] args) {
		int[][] x = {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0}
		};
		
		
		
		for (int i = 0; i < x.length; ++i) {
			for (int j = 0; j < x[i].length; ++j){
				System.out.print("L = " + i + " | C = " + j + " = " + x[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
