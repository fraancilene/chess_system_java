package br.com.fcsilva.application.chess.pieces;

import br.com.fcsilva.application.boardgame.Board;
import br.com.fcsilva.application.chess.ChessPiece;
import br.com.fcsilva.application.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
