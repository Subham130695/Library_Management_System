/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author SuBhAm
 */
import java.sql.Connection;
//import Project.ConnectionProvider;
public class TestConnection {
    public static void main(String[] args) {
        Connection con = ConnectionProvider.getCon();
        if(con != null){
            System.out.println("success");
        } else{
            System.out.println("Failed");
        }
    }
}
