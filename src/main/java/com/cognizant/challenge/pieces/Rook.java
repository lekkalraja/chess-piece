package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;

public class Rook extends Piece {

	public Rook(PlayerType player) {
		super(player, PieceType.ROOK);
	}


	@Override
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
		if (initPos.equals(finalPos)) {
			return false;
		}
		return (initPos.getPositionX() == finalPos.getPositionX() ||
				initPos.getPositionY() == finalPos.getPositionY());
	}
}
