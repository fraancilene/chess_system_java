package br.com.fcsilva.application.chess;

import br.com.fcsilva.application.boardgame.Board;
import br.com.fcsilva.application.boardgame.Position;
import br.com.fcsilva.application.chess.pieces.King;
import br.com.fcsilva.application.chess.pieces.Rook;

public class ChessMate {
    private Board board;

    public ChessMate() {
        board = new Board(8,8);
        inicialSetup();

    }

    // método que retorna a matriz de peças da partida de xadrez
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void inicialSetup(){
      board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
      board.placePiece(new King(board, Color.BLACK), new Position(3,4));
      board.placePiece(new King(board, Color.WHITE), new Position(7,4));
    }
}
