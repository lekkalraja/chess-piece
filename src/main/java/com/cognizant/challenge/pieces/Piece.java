package com.cognizant.challenge.pieces;

import com.cognizant.challenge.player.PlayerType;
import com.cognizant.challenge.utils.Coordinate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Piece {
    private PlayerType player;
    private PieceType type;


    public abstract boolean isValidMove(Coordinate initPos, Coordinate finalPos);
}