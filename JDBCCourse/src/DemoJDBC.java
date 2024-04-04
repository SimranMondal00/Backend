import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
        * 1) import the package
        * 2) load the driver
        * 3) register the driver
        * 4) create connection
        * 5) create statement
        * 6) execute statement
        * 7) close
         */
        int sid = 501;
        String name = "Simr";
        int marks = 89;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "pass";
      //  String sql = "select * from student";
        // CRUD operations
        //Insertion Query
           // String sql = "insert into student values (5,'SimSam',67)";
        //Update Query
           // String sql = "update student set name='Mac' where sid=5";
        //Delete Query
           // String sql = "delete from student where sid=5";
        String sql = " insert into student values (?,?,?)";

        //Establishment of the connection
        Class.forName("org.postgresql.Driver"); //optional
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        //Statement st = con.createStatement();
        PreparedStatement st2 = con.prepareStatement(sql);


//        ResultSet rs = st.executeQuery(sql);
//
////        rs.next();
////        String name = rs.getString("name");
////       System.out.println("The name of the student is : " + name);
//
//        while(rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }

        //execution of the query for Statement
       // st.execute(sql);

        // execution of query for PreparedStatement
        st2.setInt(1,sid);
        st2.setString(2,name);
        st2.setInt(3,marks);
        st2.execute();

        con.close();
        System.out.println("Connection Closed");

    }
}
