import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ProductService
{
    public static void main(String[] args) throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Krishna756");
        System.out.println("Connected to Db "+con);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from student;");
        rs.next();
        System.out.println(rs.getInt("sid"));
        System.out.println(rs.getString("sname"));
    }
}