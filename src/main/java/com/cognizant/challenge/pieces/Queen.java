package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;

public class Queen extends Piece {

	/**
	 * Create a Queen
	 *
	 * @param player The player the queen belongs to
	 */
	public Queen(PlayerType player) {
		super(player, PieceType.QUEEN);
	}


	@Override
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
		if (initPos.equals(finalPos)) {
			return false;
		}

		//This is the bishop move.
		int diffX = Math.abs(initPos.getPositionX() - finalPos.getPositionX());
		int diffY = Math.abs(initPos.getPositionY() - finalPos.getPositionY());
		if (diffX == diffY) return true;

		//This is the rook move.
		return (initPos.getPositionX() == finalPos.getPositionX() ||
				initPos.getPositionY() == finalPos.getPositionY());
	}
}
