package com.software_design.tic_tac_toe.model;

public class PlayingPiece {
    PieceType pieceType;

    public PlayingPiece(PieceType pieceType) { this.pieceType = pieceType; }

    public PieceType getPieceType() {
        return pieceType;
    }
}
