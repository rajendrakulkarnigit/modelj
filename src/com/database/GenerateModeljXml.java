package com.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenerateModeljXml {

	public static void main(String[] args) throws Exception {
		Connection conn = getMySqlConnection();
//		System.out.println("Got Connection.");
		Statement st = conn.createStatement();
		DatabaseMetaData dbm = conn.getMetaData();
		ResultSet rs = null;
		
		StringBuffer modeljXml = new StringBuffer("");
		
		// Get all Columns for given Table
		try {
			
			// @TODO Pick this from Props file
			String selectedTable[] = 
				{
//					"SymbolMaster",
					"ProcessedIndicatorsData"
//					"DerivativeSegment", 
//					"Portfolio"   
				};
			
			dbm = (DatabaseMetaData) conn.getMetaData();
			
			for (int i=0; i < selectedTable.length; i++) {

				rs = dbm.getColumns(null, null, selectedTable[i], null);
				String tableName2Lower = selectedTable[i].toLowerCase();
				modeljXml.append("<bean>\n");
				modeljXml.append("<name>");
				modeljXml.append(tableName2Lower);
				modeljXml.append("</name>\n");
				modeljXml.append("<className>");
				modeljXml.append(selectedTable[i]);
				modeljXml.append("</className>\n");
				modeljXml.append("<description>");
				modeljXml.append(selectedTable[i]);
				modeljXml.append("</description>\n");
				
				while (rs.next()) {
					String columnName = rs.getString("COLUMN_NAME");
					int dataType = rs.getInt("DATA_TYPE");
					String typeName = rs.getString("TYPE_NAME");
					int columnSize = rs.getInt("COLUMN_SIZE");
					short decimalDigits = rs.getShort("DECIMAL_DIGITS");
	
					modeljXml.append("<attribute>\n");
					modeljXml.append("<name>" + columnName + "</name>\n");
					modeljXml.append("<title>" + columnName + "</title>\n");
					modeljXml.append("<type>" + typeName + "</type>\n");
					modeljXml.append("<width>" + columnSize + "</width>\n");
					modeljXml.append("<htmlType>text</htmlType>\n");
					modeljXml.append("</attribute>\n");
					
//					System.out.print("columnName=" + columnName);
//					System.out.print(", dataType=" + dataType);
//					System.out.print(", typeName" + typeName);
//					System.out.print(", columnSize" + columnSize);
//					System.out.println(", decimalDigits" + decimalDigits);
				}
				
				modeljXml.append("</bean>");
			}
			
			System.out.println(modeljXml);
			
		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("No any table in the database");
		}		
		
		st.close();
		conn.close();
	}

	private static Connection getHSQLConnection() throws Exception {
		Class.forName("org.hsqldb.jdbcDriver");
		System.out.println("Driver Loaded.");
		String url = "jdbc:hsqldb:data/tutorial";
		return DriverManager.getConnection(url, "sa", "");
	}

	public static Connection getMySqlConnection() throws Exception {
		String driver = "org.gjt.mm.mysql.Driver";
		String url = "jdbc:mysql://localhost/TechnicalAnalysis";
		String username = "root";
		String password = "admin";

		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}

	public static Connection getOracleConnection() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:caspian";
		String username = "mp";
		String password = "mp2";

		Class.forName(driver); // load Oracle driver
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}

}
