package br.com.fcsilva.application;

import br.com.fcsilva.application.chess.ChessMate;

public class Program {
    public static void main(String[] args) {
        ChessMate chessMate = new ChessMate();
        UI.printBoard(chessMate.getPieces());


    }
}
