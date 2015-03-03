import java.sql.*;
public class ConnectToSQL {
	
	private Object myConn;

	public static void main(String[]args){
		
		Connection myConn = null;
		Statement stmt = null;//recomendation to use PreparedStatement
		ResultSet myRs = null;
		
		
		try{
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clients","root" , "root");
			stmt = myConn.createStatement();
			myRs = stmt.executeQuery("select * from users");
			while (myRs.next()){
				System.out.println(myRs.getString("id")+ ", "+myRs.getString("name")+", "+myRs.getString("lname")+", "+myRs.getString("email"));
			}
			
			
		}catch (Exception e){
			System.out.println("Something wrong");
			e.printStackTrace();
		}finally{
			try {
				myConn.close();
				stmt.close();
				myRs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
