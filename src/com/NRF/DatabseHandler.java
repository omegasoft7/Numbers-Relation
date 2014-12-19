package com.NRF;

import java.util.ArrayList;
import java.sql.*;

public class DatabseHandler {

	// Variables--------------------------------------------------------------
	// http://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm

	private static Connection conn;

	private static String DatabaseAddress; // for example:
											// "jdbc:mysql://localhost:3306/"
	private static String DatabaseUserName;
	private static String DatabasePassword;
	private static String DatabaseName;

	private static final String driver = "com.mysql.jdbc.Driver";

	// Variables--------------------------------------------------------------

	public static boolean isConnected() {

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			// oracle
			rs = stmt.executeQuery("SELECT 1 FROM Dual");
			// others
			// rs = stmt.executeQuery("SELECT 1");
			if (rs.next())
				return true; // connection is valid
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		//TODO check it for mysql later
		
		return false;
	}

	public static void Disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean TryToConnectToDB(String address, String username,
			String pass, String name) {

		DatabseHandler.DatabaseAddress = address;
		DatabseHandler.DatabaseUserName = username;
		DatabseHandler.DatabasePassword = pass;
		DatabseHandler.DatabaseName = name;

		// TODO

		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(DatabseHandler.DatabaseAddress
					+ DatabseHandler.DatabaseName,
					DatabseHandler.DatabaseUserName,
					DatabseHandler.DatabasePassword);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * @param nrf
	 *            : A NRFObject to select it from DB
	 * @param position
	 *            : Position of needed character
	 * @return a list of possible characters in a specific position. it will
	 *         return null in case that there are no row with (equal or less)
	 *         length of this position
	 */
	public static ArrayList<Character> getAllPossibleCharacters(NRFObject nrf,
			int position) {

		// TODO

		// Statement st = conn.createStatement();
		// ResultSet res = st.executeQuery("SELECT * FROM event");
		// while (res.next()) { int id = res.getInt("id"); String msg =
		// res.getString("msg");
		// System.out.println(id + "\t" + msg); } int val =
		// st.executeUpdate("INSERT into event VALUES("+1+","+"'Easy'"+")");
		// if(val==1) System.out.print("Successfully inserted value");
		// conn.close(); } catch (Exception e) { e.printStackTrace(); } }

		return null;
	}

	/**
	 * @param nrf
	 *            : A NRFObject to select it from DB
	 * @param position
	 *            : Position of needed character
	 * @return a list of possible characters in a specific position. it will
	 *         return null in case that there are no row with (equal or less)
	 *         length of this position
	 */
	public static ArrayList<Character> getAllPossibleCharacters(NRFObject nrf,
			int position, NRFObject nrfWhere, int positionWhere, char chWhere) {

		// TODO
		// Check field of "nrf" in position of "position" where: in field of
		// "nrfWhere" in position of "positionWhere" character is: "chWhere"
		// It will return all possible character in requested position or
		// returns null in case that nothing was found of position is bigger
		// than all of their lengths

		return null;
	}
}
