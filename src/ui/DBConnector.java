
package ui;

import java.util.ArrayList;
import model.UserPanel;
import oracle.jdbc.datasource.*;
import java.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author sujiitramurukeshan
 */
public class DBConnector {
   private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
   private static final String USERNAME = "admin";
   private static final String PASSWORD = "admin";

DBConnector(){
}

 public static void addPatient(UserPanel patient) {
    String query = "INSERT INTO REGISTEREDPATIENTS(FIRST,LAST,EMAILID,PATIENTTYPE) VALUES(?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, patient.getFirstName());
        stmt.setString(2, patient.getLastName());
        stmt.setString(3, patient.getEmail());
        stmt.setString(4, patient.getPatientType());
        int rows = stmt.executeUpdate();
        System.out.println("Rows impacted : " + rows);
        conn.close();
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
 
public static ArrayList<UserPanel> getAllPatients() {

    ArrayList<UserPanel> patient = new ArrayList<>();
    String query = "SELECT PATIENTID,FIRST,LAST,EMAILID,PATIENTTYPE FROM REGISTEREDPATIENTS";
    try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
        UserPanel p = new UserPanel();
        p.setPid(rs.getInt("PATIENTID"));
        p.setFirstName(rs.getString("FIRST"));
        p.setLastName(rs.getString("LAST"));
        p.setEmail(rs.getString("EMAILID"));
        p.setPatientType(rs.getString("PATIENTTYPE"));
        patient.add(p);
        }
        rs.close();
        conn.close();
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
    return patient;
}
 
 public static void deletePatient(UserPanel p) {
String query = "DELETE from REGISTEREDPATIENTS where PATIENTID = ?";
try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
PreparedStatement stmt = conn.prepareStatement(query);
stmt.setInt(1, p.getPid());
stmt.executeUpdate();
conn.close();
} catch (SQLException e) {
e.printStackTrace();
}
}
 
 public static void editPatient(UserPanel newPatient) {
    String query = "UPDATE REGISTEREDPATIENTS SET FIRST=?, LAST=?, EMAILID=?, PATIENTTYPE=? WHERE PATIENTID=?";
    try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, newPatient.getFirstName());
        stmt.setString(2, newPatient.getLastName());
        stmt.setString(3, newPatient.getEmail());
        stmt.setString(4, newPatient.getPatientType());
        stmt.setInt(5, newPatient.getPid());
        stmt.executeUpdate();
        conn.close();
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

}
