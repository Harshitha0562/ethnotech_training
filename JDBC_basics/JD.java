package JDBC_basics;

import java.sql.*;

public class JD {

    private static final String url="jdbc:mysql://localhost:3306/sms1   ";
    private static final String user="root";
    private static final String password="Harshi@465";

    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver
        Connection con=DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();

        //retreiving
        /*String query="select * from students";
        st.executeQuery(query);
        ResultSet rs=st.executeQuery(query);

        while(rs.next())
        {
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String email=rs.getString("email");
            int marks=rs.getInt("marks");
            System.out.println(id+" "+name+" "+email+" "+marks);
        }*/

        //insertion
        /*
        String q=String.format("insert into students (id,name,email,marks) values (%d,'%s','%s',%d)"  ,3,"bindu","b@gmail.com",85);
        int myResult=st.executeUpdate(q);
        if(myResult>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }
        */

        //update
        /*
        String q=String.format("update students set marks=%d where id=%d",90,1);
        int myResult=st.executeUpdate(q); //we are storing our result in int as whenever we update or insert we will get one row updated or something
        if(myResult>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }

         */


        //delete
        String q=String.format("delete from students where id=%d",3);
        int myResult=st.executeUpdate(q);
        if(myResult>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
