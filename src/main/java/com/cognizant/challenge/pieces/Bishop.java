package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;

public class Bishop extends Piece{

    public Bishop(PlayerType player){
        super(player, PieceType.BISHOP);
    }

	@Override
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
		if (initPos.equals(finalPos)){return false;}
		int diffX=Math.abs(initPos.getPositionX()-finalPos.getPositionX());
		int diffY=Math.abs(initPos.getPositionY()-finalPos.getPositionY());
		return diffX==diffY;
	}
}