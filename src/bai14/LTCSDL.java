package bai14;

import bai14.business.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class LTCSDL {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            System.out.println("Connection established successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
