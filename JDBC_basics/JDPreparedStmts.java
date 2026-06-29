package JDBC_basics;

import java.sql.*;

public class JDPreparedStmts {
    private static final String url="jdbc:mysql://localhost:3306/sms1   ";
    private static final String user="root";
    private static final String password="Harshi@465";

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver
        Connection con = DriverManager.getConnection(url, user, password);
        /*
        String query="select * from students";
        PreparedStatement ps=con.prepareStatement(query);

        //retreiving
        ResultSet rs=ps.executeQuery(query);

        while(rs.next())
        {
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String email=rs.getString("email");
            int marks=rs.getInt("marks");
            System.out.println(id+" "+name+" "+email+" "+marks);
        }*/

        //inserting

        String q="insert into students (id,name,email,marks) values (?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(q);
        ps.setInt(1,101);
        ps.setString(2,"Harshitha");
        ps.setString(3,"harshi@gamil.com");
        ps.setInt(4,45);
        int myResult=ps.executeUpdate();
        if(myResult>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }

        System.out.println("Rows affected: " + myResult);
        /*
        //updating
        String q="update students set marks=? where id=?";
        PreparedStatement ps=con.prepareStatement(q);
        ps.setInt(1,79);
        ps.setInt(2,1);
        int myResult=ps.executeUpdate();
        if(myResult>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }
         */
        String check = "select * from students where id=?";
        PreparedStatement ps2 = con.prepareStatement(check);
        ps2.setInt(1, 1);

        ResultSet rs = ps2.executeQuery();

        while(rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                            rs.getString("name") + " " +
                            rs.getInt("marks")
            );
        }
        ps.close();
        con.close();
    }
}
