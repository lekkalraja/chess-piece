package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;

public class King extends Piece{

	public King(PlayerType player){
        super(player, PieceType.KING);
    }

	@Override
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
			if (initPos.equals(finalPos)){return false;}
			
			return Math.abs(finalPos.getPositionX()-initPos.getPositionX()) <= 1
			    && Math.abs(finalPos.getPositionY()-initPos.getPositionY()) <= 1 ;
	}
}