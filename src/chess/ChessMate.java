package br.com.fcsilva.application.chess;

import br.com.fcsilva.application.boardgame.Board;
import br.com.fcsilva.application.chess.pieces.King;
import br.com.fcsilva.application.chess.pieces.Rook;

public class ChessMate {
    private final Board board;

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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void inicialSetup(){
      placeNewPiece('c', 1, new Rook(board, Color.WHITE));
      placeNewPiece('c', 2, new Rook(board, Color.WHITE));
      placeNewPiece('d', 2, new Rook(board, Color.WHITE));
      placeNewPiece('e', 2, new Rook(board, Color.WHITE));
      placeNewPiece('e', 1, new Rook(board, Color.WHITE));
      placeNewPiece('d', 1, new King(board, Color.WHITE));

      placeNewPiece('c', 7, new Rook(board, Color.WHITE));
      placeNewPiece('c', 8, new Rook(board, Color.WHITE));
      placeNewPiece('d', 7, new Rook(board, Color.WHITE));
      placeNewPiece('e', 7, new Rook(board, Color.WHITE));
      placeNewPiece('e', 8, new Rook(board, Color.WHITE));
      placeNewPiece('d', 8, new King(board, Color.WHITE));

    }
}
