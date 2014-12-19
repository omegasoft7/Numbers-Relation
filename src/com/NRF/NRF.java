package com.NRF;

import java.util.ArrayList;

public class NRF {

	// Variables------------------------------------------------
	private static NRF Instance;

	ArrayList<NRFObject> NRFObjects = new ArrayList<>();
	ArrayList<NRFObject> NRFChangeableObjects;
	private int length = 0;
	
	
	

	// Variables------------------------------------------------
	private NRF() {
	}

	public static NRF getInstance() {
		if (Instance == null)
			Instance = new NRF();

		return Instance;
	}

	public void ADDNRFObject(NRFObject nrf) {
		if (NRFObjects.add(nrf))
			length++;
	}
	
	public void RemoveNRFObject(NRFObject nrf) {
		if (NRFObjects.remove(nrf))
			length--;
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean ConnectToDB(String address, String username, String pass, String name) {
		return DatabseHandler.TryToConnectToDB(address, username, pass, name);
	}
	
	public void Start() {
		if (length <= 0 || NRFObjects.size() <= 0) {
			throw new IllegalArgumentException("You need to add NRFObjects");
		}
		
		if (!DatabseHandler.isConnected()) {
			throw new IllegalArgumentException("You need to pass valid parameters to connect to DB. Error in connectin to DB");
		}
		
		
		for (int i = 0; i < NRFObjects.size(); i++) {
			CalculateOneField(NRFObjects.get(i));
		}
	}
	
	
	private void CalculateOneField(NRFObject nrf) {
		
		for (int i = 0; i < nrf.getMaxLength(); i++) {
			
			ArrayList<Character> chars = DatabseHandler.getAllPossibleCharacters(nrf, i);
			
			//There is no value with equal or less than this position
			if(chars == null) return;
			
			
			for (int j = 0; j < chars.size(); j++) {
				CalculateOneCharacter(nrf, chars.get(j), i);
			}
		}
		
	}
	
	
	private void CalculateOneCharacter(NRFObject nrf, char ch, int position) {
	
		//Get all changeable objects
		if(NRFChangeableObjects == null) {
			
			NRFChangeableObjects = new ArrayList<>();
			
			for (int i = 0; i < NRFObjects.size(); i++) {
				if (NRFObjects.get(i).getValueType() == NRFValueType.CHANGEABLE) {
					NRFChangeableObjects.add(NRFObjects.get(i));
				}
			}
		}
		
		for (int i = 0; i < NRFChangeableObjects.size(); i++) {
			
			for (int j = 0; j < NRFChangeableObjects.get(i).getMaxLength(); j++) {
				
				ArrayList<Character> chars = DatabseHandler.getAllPossibleCharacters(NRFChangeableObjects.get(i), j, nrf, position, ch);
				if(chars == null) break;
				
				//TODO check and make reports
			}
					
		}
	}
}
