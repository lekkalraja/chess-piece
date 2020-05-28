package com.cognizant.challenge.service;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChessPieceImplTest {

    ChessPiece chessPiece;

    @Before
    public void setup() {
        chessPiece = new ChessPieceImpl();
    }

    @Test
    public void canMove() {
        assertTrue(chessPiece.canMove("Rook", "A8", "H8"));
        assertTrue(chessPiece.canMove("Bishop", "A7", "G1"));
        assertFalse(chessPiece.canMove("Rook", "C4", "D6"));
    }
}