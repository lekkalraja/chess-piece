package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;

public class Pawn extends Piece {

	public Pawn(PlayerType player) {
		super(player, PieceType.PAWN);
	}

	@Override
	public boolean isValidMove(Coordinate initPos, Coordinate finalPos) {
		if (initPos.equals(finalPos)) {
			return false;
		}

		// This is for normal pawn moves.
		if (Math.abs(initPos.getPositionY() - finalPos.getPositionY()) == 1
				&& Math.abs(initPos.getPositionX() - finalPos.getPositionX()) == 0) {
			// White can only move forward
			if (this.getPlayer() == PlayerType.WHITE) {
				if (initPos.getPositionY() < finalPos.getPositionY()) {
					return true;
				}
			}
			// Black can only move backward in a sense.
			if (this.getPlayer() == PlayerType.BLACK) {
				if (initPos.getPositionY() > finalPos.getPositionY()) {
					return true;
				}
			}

		}

		// This is for first pawn move.
		if (Math.abs(initPos.getPositionY() - finalPos.getPositionY()) == 2
				&& Math.abs(initPos.getPositionX() - finalPos.getPositionX()) == 0
				&& (initPos.getPositionY() == 1 || initPos.getPositionY() == 6)) {

			// White can only move forward
			if (this.getPlayer() == PlayerType.WHITE) {
				if (initPos.getPositionY() < finalPos.getPositionY()) {
					return true;
				}
			}
			// Black can only move backward in a sense.
			if (this.getPlayer() == PlayerType.BLACK) {
				if (initPos.getPositionY() > finalPos.getPositionY()) {
					return true;
				}
			}

		}

		// This if for normal pawn captures.
		// this is for Enpassant.

		return false;
	}
}
