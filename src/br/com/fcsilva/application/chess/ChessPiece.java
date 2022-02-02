package br.com.fcsilva.application.chess;

import br.com.fcsilva.application.boardgame.Board;
import br.com.fcsilva.application.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
