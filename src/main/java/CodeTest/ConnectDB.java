package CodeTest;

import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {
        String dbLocation = "jdbc:postgresql://localhost:5432/market";
        String user = "postgres";
        String password = "123";
        String sql = "select name, age from users where name=? order by id;";
        try {
            Connection con = DriverManager.getConnection(dbLocation, user, password);
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, "John");
      /*      pst.setString(2, "age");
            pst.setString(3, "users");
            pst.setString(3, "name");
            pst.setString(4, "'Boris'");
            pst.setString(5, "id");*/
            System.out.println(sql);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                System.out.printf("%s ", res.getString("name"));
                System.out.println(res.getShort("age"));
            }

            pst.close();
            ;
            con.close();
            ;

        } catch (SQLException e) {
            System.out.println("DB ERROR!");
            System.out.println(e.getMessage());
        } finally {

        }
    }
}
