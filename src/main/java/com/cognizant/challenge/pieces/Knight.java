package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;

public class Knight extends Piece {

	public Knight(PlayerType player) { super(player, PieceType.KNIGHT); }

	@Override
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
		if (initPos.equals(finalPos)) {
			return false;
		}

		int diffX = Math.abs(initPos.getPositionX() - finalPos.getPositionX());
		int diffY = Math.abs(initPos.getPositionY() - finalPos.getPositionY());
		return ((diffX + diffY) == 3 && diffX != 0 && diffY != 0);
	}
}