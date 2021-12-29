import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MainConnection {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"
					);
			
			System.out.println("---------------------------------------- All Records From Table -------------------------------------------------");
			
			Statement s=con.createStatement();
			ResultSet r1=s.executeQuery("Select * from Bus");
			ResultSetMetaData d=r1.getMetaData();
			System.out.println(d.getColumnName(1)+" "+d.getColumnName(2));
				while(r1.next())
				{
					System.out.println(r1.getInt(1)+"\t"+r1.getString(2)+"\t"+r1.getString(3)+"\t"+r1.getString(4)+"\t"+r1.getInt(5));
				}
				
			 PreparedStatement newst=con.prepareStatement("Delete from Bus Where busid=101");
			 
			int r=newst.executeUpdate();
			 if(r>0)
				{
					System.out.println("Record Deleted");

				}
				else
				{
					System.out.println("Record Deletion Error");
				}
			 r1=s.executeQuery("Select * from Bus");
			 if(r1==null)
			 {
				System.out.println("No Record Found"); 
			 } 
			 else
			 {
				while(r1.next())
				{
					System.out.println(r1.getInt(1)+"\t"+r1.getString(2)+"\t"+r1.getString(3)+"\t"+r1.getString(4)+"\t"+r1.getInt(5));
				}
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
