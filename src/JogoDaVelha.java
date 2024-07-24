package sef.module3.sample;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String jogadorAtual = "X";
        boolean jogoAcabou = false;
    	String[][] tabuleiro = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}};


        do {
            // Impressão do tabuleiro
            System.out.print("\n\n 0   1    2\n\n");
            for (int posicao1 = 0; posicao1 < 3; posicao1++) {
                for (int posicao2 = 0; posicao2 < 3; posicao2++) {
                    System.out.print(" " + tabuleiro[posicao1][posicao2]);
                    if (posicao2 < 2) {
                        System.out.print(" | ");
                    }
                    if (posicao2 == 2) {
                        System.out.print("  " + posicao1);
                    }
                }
                if (posicao1 < 2) {
                    System.out.print("\n------------");
                }
                System.out.println("\n");
            }

            // Obter a jogada do jogador atual
            System.out.println("Jogador " + jogadorAtual + ", informe a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.println("Jogador " + jogadorAtual + ", informe a coluna (0-2): ");
            int coluna = scanner.nextInt();

            // Verificar se a posição está vazia
            if (tabuleiro[linha][coluna].equals(" ")) {
                tabuleiro[linha][coluna] = jogadorAtual;

                // Verificar se o jogador atual ganhou
                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    System.out.println("Jogador " + jogadorAtual + " ganhou!");
                    jogoAcabou = true;
                } else {
                    // Trocar o jogador atual
                    jogadorAtual = jogadorAtual.equals("X") ? "O" : "X";
                }
            } else {
                System.out.println("Posição já ocupada!");
            }
        } while (!jogoAcabou);
    }

    private static boolean verificarVitoria(String[][] tabuleiro, String jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0].equals(jogador) && tabuleiro[i][1].equals(jogador) && tabuleiro[i][2].equals(jogador)) {
                return true;
            }
        }

        // Verificar colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i].equals(jogador) && tabuleiro[1][i].equals(jogador) && tabuleiro[2][i].equals(jogador)) {
                return true;
            }
        }

        // Verificar diagonais
        if ((tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador)) ||
                (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador))) {
            return true;
        }

        return false;
    }
}