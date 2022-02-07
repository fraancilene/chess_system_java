package br.com.fcsilva.application.chess.pieces;

import br.com.fcsilva.application.boardgame.Board;
import br.com.fcsilva.application.chess.ChessPiece;
import br.com.fcsilva.application.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
