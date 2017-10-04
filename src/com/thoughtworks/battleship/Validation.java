package com.thoughtworks.battleship;


/**
 * @author abhilashjain
 *
 */
public class Validation {

	/**
	 * @param battleArea
	 * @param location
	 * @throws BattleShipException
	 */
	static void validateLocation(BattleArea battleArea, String location) throws BattleShipException
	{
		Coordinate area = battleArea.getBoard();
		if (area.getX() < (Integer.parseInt(location.substring(1))) || area.getY() < location.charAt(0))
			throw new BattleShipException("Invalid Location Found");
	}
}
