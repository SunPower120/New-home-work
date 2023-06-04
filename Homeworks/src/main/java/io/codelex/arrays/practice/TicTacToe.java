package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];
    private static final char X = 'X';
    private static final char O = 'O';


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();
        playerOTurn();


    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void playerOTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("'O', choose your location (row, column): ");
        int cordX = scan.nextInt();
        int cordY = scan.nextInt();
        if (board[cordX][cordY] == ' ') {
            board[cordX][cordY] = O;
            displayBoard();
            if (victoryConditions() || drawConditions()) {
                if (drawConditions()) {
                    System.out.println("It's a draw!");
                }
                return;
            }
            playerXTurn();
        } else {
            System.out.println("This spot is already taken");
            playerOTurn();
        }
    }

    public static void playerXTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("'X', choose your location (row, column): ");
        int cordX = scan.nextInt();
        int cordY = scan.nextInt();
        if (board[cordX][cordY] == ' ') {
            board[cordX][cordY] = X;
            displayBoard();
            if (victoryConditions() || drawConditions()) {
                if (drawConditions()) {
                    System.out.println("It's a draw!");
                }
                return;
            }
            playerOTurn();
        } else {
            System.out.println("This spot is already taken");
            playerXTurn();
        }
    }

    public static boolean victoryConditions() {
        for (int player = 0; player < 2; ++player) {
            char symbol = (player == 0) ? 'X' : 'O';
            String name = (player == 0) ? "Player X" : "Player O";
            if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                    (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                    (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
                    (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                    (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                    (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
                    (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                    (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
                System.out.println(name + " wins!");
                return true;
            }
        }
        return false;
    }

    public static boolean drawConditions() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


}

