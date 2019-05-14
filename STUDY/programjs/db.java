import java.sql.*;

class Db{
    public static void main(String[] args)throws Exception {
        Class.forName(com.mysql.jdbc.Driver);//register in the database
        String url="jdbc:mysql://localhost::3306/system";
        String name="system";
        String password="kalai12345";
        Connection con=DriverManager.getConnection(url,name,password);//create a connection
        Statement st=con.createStatement();//statement creation
        String querry="select * from employee";//querry execution
        ResultSet rs=st.executeQuery(querry);//process the result
        while(rs.next()){
            String s=rs.getString("emp_id");
            System.out.println(rs);
        }
        rs.close();
        st.close();
        con.close();

    }
}