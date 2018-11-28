import java.sql.*;
public class jdbc {
    public static void main(String[] args){
        Connection conn = getConnection("demo.user", "demo.passwd");
        String SQL = "";
        String showAll = "select * from Student";
        query(conn,showAll);
        SQL = "insert into Student values ('1003','李六')";
        conn =  getConnection("demo.user", "demo.passwd");
        insert(conn,SQL);
        conn =  getConnection("demo.user", "demo.passwd");
        query(conn,showAll);

        SQL = "delete from Student where id =1003";
        conn =  getConnection("demo.user", "demo.passwd");
        delete(conn,SQL);
        conn =  getConnection("demo.user", "demo.passwd");
        query(conn,showAll);

        SQL = "update Student set name = '张四' where id = 1000";
        conn =  getConnection("demo.user", "demo.passwd");
        update(conn,SQL);
        conn =  getConnection("demo.user", "demo.passwd");
        query(conn,showAll);


        releaseConnection(conn);


    }

    public static void query(Connection conn,String Sql) {
//        String Sql = "select * from Student";
        try{
            Statement stmt=conn.createStatement();

            ResultSet rs=stmt.executeQuery(Sql);
            while(rs.next()) {
                int i = rs.getInt("id");
                String s = rs.getString("name");
                System.out.println("ROW = " + i + " " + s + " ");
            }
        }catch(Exception e){
            System.out.println("no");
            e.printStackTrace();
        }finally {
            releaseConnection(conn);
        }
    }

    public static void insert(Connection conn,String Sql) {
//        String Sql = "insert into Student values ('1002','李五')";

        try{
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(Sql);
            System.out.println("insertOK");
        }catch(Exception e){
            System.out.println("no");
            e.printStackTrace();
        }finally {
            releaseConnection(conn);
        }
    }

    public  static void delete(Connection conn,String Sql){
//        String Sql = "delete from Student where id =1001";
        try{
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(Sql);
            System.out.println("deleteOK");
        }catch(Exception e){
            System.out.println("no");
            e.printStackTrace();
        }finally {
            releaseConnection(conn);
        }
    }

    public static void update(Connection conn,String Sql) {
//        String Sql = "update Student set name = '张六' where id = 1000";
        try{
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(Sql);
            System.out.println("updateOK");
        }catch(Exception e){
            System.out.println("no");
            e.printStackTrace();
        }finally {
            releaseConnection(conn);
        }
    }

    public static Connection getConnection(String user,String password){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://192.168.1.180:3306/db_demo" ;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
             System.out.println("Not found");
            e.printStackTrace() ;
        }return conn;

    }

    public static void releaseConnection(Connection conn) {
        try {
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
