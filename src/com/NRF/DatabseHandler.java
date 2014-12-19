package com.NRF;

import java.util.ArrayList;

public class DatabseHandler {

	//Variables--------------------------------------------------------------
	private static String DatabaseAddress;
	private static String DatabaseUserName;
	private static String DatabasePassword;
	private static String DatabaseName;

	
	//Variables--------------------------------------------------------------

	
	public static boolean isConnected() {
		
		//TODO
		
		return true;
	}
	
	public static boolean TryToConnectToDB(String address, String username, String pass, String name) {
		
		DatabseHandler.DatabaseAddress = address;
		DatabseHandler.DatabaseUserName = username;
		DatabseHandler.DatabasePassword = pass;
		DatabseHandler.DatabaseName = name;
		
		//TODO
		
		return true;
	}
	
	/**
	 * @param nrf: A NRFObject to select it from DB
	 * @param position: Position of needed character
	 * @return a list of possible characters in a specific position. 
	 * 	it will return null in case that there are no row with (equal or less) length of this position
	 */
	public static ArrayList<Character> getAllPossibleCharacters(NRFObject nrf, int position) {
		
		//TODO
		
		return null;
	}
	
	
	/**
	 * @param nrf: A NRFObject to select it from DB
	 * @param position: Position of needed character
	 * @return a list of possible characters in a specific position. 
	 * 	it will return null in case that there are no row with (equal or less) length of this position
	 */
	public static ArrayList<Character> getAllPossibleCharacters(NRFObject nrf, int position, NRFObject nrfWhere, int positionWhere, char chWhere) {
		
		//TODO
		//Check field of "nrf" in position of "position" where: in field of "nrfWhere" in position of "positionWhere" character is: "chWhere"
		//It will return all possible character in requested position or returns null in case that nothing was found of position is bigger than all of their lengths
		
		return null;
	}
}
