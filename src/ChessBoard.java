package sef.module3.sample;

import java.util.Scanner;


public class ChessBoard {
	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 //Mover Cavalo
		 System.out.println("");
		 board[5][5] = board[7][6];
		 board[7][6] = "";

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 // Mover Peao
			/*
			 * System.out.println(""); board[4][2] = board[6][2]; board[6][2] = " ";
			 * 
			 * for (int i = 0; i < board.length; i++) { for (int j = 0; j < board[i].length;
			 * j++) { System.out.print(board[i][j]+"  "); } System.out.println(""); }
			 */
		 //imprimirBoard(board);

		// Mover Peao com Scanner
		 
        while (true) {
            System.out.print("Digite a linha de origem do peão (0-7): ");
            int origemLinha = scanner.nextInt();
            System.out.print("Digite a coluna de origem do peão (0-7): ");
            int origemColuna = scanner.nextInt();
            System.out.print("Digite a linha de destino do peão (0-7): ");
            int destinoLinha = scanner.nextInt();
            System.out.print("Digite a coluna de destino do peão (0-7): ");
            int destinoColuna = scanner.nextInt();

            if (moverPeao(board, origemLinha, origemColuna, destinoLinha, destinoColuna)) {
                imprimirBoard(board);
            } else {
                System.out.println("Movimento inválido. Tente novamente.");
            }
        }
    }

    public static boolean moverPeao(String[][] board, int origemLinha, int origemColuna, int destinoLinha, int destinoColuna) {
        
        if (!board[origemLinha][origemColuna].equals("p") && !board[origemLinha][origemColuna].equals("P")) {
            return false;
        }

      
        if (!board[destinoLinha][destinoColuna].equals(" ")) {
            return false;
        }

        if (board[origemLinha][origemColuna].equals("p")) {
            
            if (origemLinha - destinoLinha == 1 && origemColuna == destinoColuna) {
                board[destinoLinha][destinoColuna] = board[origemLinha][origemColuna];
                board[origemLinha][origemColuna] = " ";
                return true;
            }
        } else if (board[origemLinha][origemColuna].equals("P")) {
            
            if (destinoLinha - origemLinha == 1 && origemColuna == destinoColuna) {
                board[destinoLinha][destinoColuna] = board[origemLinha][origemColuna];
                board[origemLinha][origemColuna] = " ";
                return true;
            }
        }

        return false;
    }
    
 // --------------Impressão do Tabuleiro---------------------------------------
 	public static void imprimirBoard(String[][] board) {
 		 for (int i = 0; i < board.length; i++) {
 		        for (int j = 0; j < board[i].length; j++) {
 		        	System.out.print(board[i][j]+"  ");
 		        }
 		        System.out.println("");
 		    }
 	}
 }