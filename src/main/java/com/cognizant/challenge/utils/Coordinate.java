package com.cognizant.challenge.utils;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Coordinate {
	int positionX;
	int positionY;

	public boolean equals(Coordinate coordinate) {
		return positionX == coordinate.getPositionX() && positionY == coordinate.getPositionY();
	}
}