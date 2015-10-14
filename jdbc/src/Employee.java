import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee
{
  public static void main(String[] args) throws ClassNotFoundException
  {
    // load the sqlite-JDBC driver using the current class loader
    Class.forName("org.sqlite.JDBC");

    Connection connection = null;
    try
    {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.

      statement.executeUpdate("drop table if exists employee");
      statement.executeUpdate("create table employee (id integer, name string,salary int)");
      statement.executeUpdate("insert into employee values(1000, 'muvva',50000)");
      statement.executeUpdate("insert into employee values(2000, 'narasimharao',69000)");
      statement.executeUpdate("insert into employee values(3000, 'narasimhamuvva',68000)");
      statement.executeUpdate("insert into employee values(4000, 'narasimharaomuvva',90000)");
      ResultSet rs = statement.executeQuery("select * from employee");
      while(rs.next())
      {
        // read the result set
        System.out.println("name = " + rs.getString("name"));
        System.out.println("id = " + rs.getInt("id"));
        System.out.println("salary = " + rs.getInt("salary"));
      }
    }
    catch(SQLException e)
    {
      // if the error message is "out of memory", 
      // it probably means no database file is found
      System.err.println(e.getMessage());
    }
    finally
    {
      try
      {
        if(connection != null)
          connection.close();
      }
      catch(SQLException e)
      {
        // connection close failed.
        System.err.println(e);
      }
    }
  }
}
