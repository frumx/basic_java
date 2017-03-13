package DataBase;

import java.sql.*;

public class SQLiteJDBC {

	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS Employee(" 
					+ "id INTEGER PRIMARY KEY AUTOINCREMENT, " 
					+ "name TEXT NOT NULL, "
					+ "surname TEXT NOT NULL, " 
					+ "dept_id INT, " 
					+ "mgr_id INT, " 
					+ "salary INT, " 
					+ "comission INT, "
					+ "hire_date TEXT, "
					+ "job TEXT " 
					+ ")";
			stmt.executeUpdate(sql);
			
		
		//	String insertMyselfSql="INSERT INTO Employee(name, surname) VALUES('Mateusz', 'Cieciak')";
	//		stmt.executeUpdate(insertMyselfSql);
			
			String checkMyself="SELECT id, name, surname FROM Employee";
			ResultSet result=stmt.executeQuery(checkMyself);
			while(result.next()){
				int id=result.getInt("id");
			    String name=result.getString("name");
			    String surname = result.getString("surname");
			    System.out.println(id+" "+name+" "+surname);
			}
			result.close();
			
			
			sql="CREATE TABLE IF NOT EXISTS Salgrade("
					+"grade INTEGER PRIMARY KEY, "
					+"losal INTEGER NOT NULL, "
					+"hisal INTEGER NOT NULL "
					+")";
			stmt.executeUpdate(sql);
			
				
	/*	
			String insert1, insert2;
			insert1 = "INSERT INTO Salgrade VALUES(1, 1000, 2000)";
			insert2 = "INSERT INTO Salgrade VALUES(2, 2000, 3000)";
			stmt.executeUpdate(insert1);
			stmt.executeUpdate(insert2);
			
			*/
			
			String query = "SELECT *FROM Salgrade";
			result = stmt.executeQuery(query);
			while (result.next()){
				int lo = result.getInt("losal");
				int hi = result.getInt("hisal");
				
				System.out.println("salary range: "+lo+", "+hi);
			}
			
			result.close();		
			
		//	System.out.println("is goood");
			
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	//	System.out.println("Table created successfully");
	}

}
