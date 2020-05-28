package com.cognizant.challenge.service;

import com.cognizant.challenge.pieces.*;
import com.cognizant.challenge.player.Player;
import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;
import org.springframework.stereotype.Service;

@Service
public class ChessPieceImpl implements ChessPiece {

    @Override
    public boolean canMove(String pieceType,  String initPos, String finalPos) {
        Piece piece = null;
        var initCoordination = getCoordinate(initPos);
        var destCoordination = getCoordinate(finalPos);
        PlayerType playerType = PlayerType.WHITE;
        switch (PieceType.valueOf(pieceType.toUpperCase())) {
            case BISHOP: piece = new Bishop(playerType); break;
            case PAWN: piece = new Pawn(playerType);  break;
            case ROOK: piece = new Rook(playerType);  break;
            case KING: piece = new King(playerType);  break;
            case KNIGHT: piece = new Knight(playerType); break;
            case QUEEN: piece = new Queen(playerType); break;
        }
        if (piece == null) return false;
        return piece.isValidMove(initCoordination, destCoordination);
    }

    private Coordinate getCoordinate(String position){
        var x = 0;
        var y = Integer.parseInt(String.valueOf(position.charAt(1)));
        switch (position.charAt(0)) {
            case 'A' : x = 1; break;
            case 'B' : x = 2; break;
            case 'C' : x = 3; break;
            case 'D' : x = 4; break;
            case 'E' : x = 5; break;
            case 'F' : x = 6; break;
            case 'G' : x = 7; break;
            case 'H' : x = 8; break;
        }
        return Coordinate.builder().positionX(x).positionY(y).build();
    }

}