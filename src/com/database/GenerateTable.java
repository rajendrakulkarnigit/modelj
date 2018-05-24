package com.database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.DatabaseMetaData;

public class GenerateTable {
	
	public static void main(String[] Args) {
		java.sql.Connection conn = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		} catch (Exception E) {
			System.err.println("Unable to load driver.");
			E.printStackTrace();
		}

		try {
			
			conn = DriverManager
					.getConnection("jdbc:mysql://dev02/ecorporation?user=root&password=root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from voter WHERE 1=2");
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

			rs.close();
			stmt.close();
			System.out.println("*** End of Program ***");

		}

		catch (SQLException E) {
			E.printStackTrace();
			System.out.println("SQLException: " + E.getMessage());
			System.out.println("SQLState:     " + E.getSQLState());
			System.out.println("VendorError:  " + E.getErrorCode());
		}

		try {
			DatabaseMetaData dbm = (DatabaseMetaData) conn.getMetaData();
			String[] types = { "TABLE" };
			ResultSet rs = dbm.getTables(null, null, "%", types);
			System.out.println("Table name:");
			while (rs.next()) {
				String table = rs.getString("TABLE_NAME");
				System.out.println(table);
			}
		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("No any table in the database");
		}


		try {
			DatabaseMetaData dbm = (DatabaseMetaData) conn.getMetaData();
			System.out.println(dbm);
			ResultSet rs = dbm.getColumns(null, null, "VOTER", null);
			System.out.println("VOTER Table:");
			while (rs.next()) {
			      String columnName = rs.getString("COLUMN_NAME");
			      int dataType = rs.getInt("DATA_TYPE");
			      String typeName = rs.getString("TYPE_NAME");
			      int columnSize = rs.getInt("COLUMN_SIZE");
			      short decimalDigits = rs.getShort("DECIMAL_DIGITS");

			      System.out.println("tableName=survey");
			      System.out.println("columnName=" + columnName);
			      System.out.println("dataType=" + dataType);
			      System.out.println("typeName" + typeName);
			      System.out.println("columnSize" + columnSize);
			      System.out.println("decimalDigits" + decimalDigits);
		    
			}
		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("No any table in the database");
		}
		
		try {
			conn.close();
		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("No any table in the database");
		}		


	}

}