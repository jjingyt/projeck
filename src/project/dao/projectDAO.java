package project.dao;

public class projectDAO {
	
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}