package com.cognizant.challenge;

import com.cognizant.challenge.service.ChessPiece;
import com.cognizant.challenge.service.ChessPieceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ChessPieceApplication implements CommandLineRunner {

	@Autowired private ChessPiece chessPiece;

	public static void main(String[] args) {
		SpringApplication.run(ChessPieceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("ROOK,   A8, H8  :  {}", chessPiece.canMove("Rook", "A8", "H8"));
		log.info("Bishop, A7, G1  :  {}", chessPiece.canMove("Bishop", "A7", "G1"));
		log.info("Queen,  C4, D6  :  {}", chessPiece.canMove("Rook", "C4", "D6"));
	}
}
