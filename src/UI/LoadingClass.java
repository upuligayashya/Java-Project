
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoadingClass {
    public static void main(String[] args) {
        Loading load = new Loading();
        load.setVisible(true);
        Loginwindow login = new Loginwindow();
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(150);
                load.lbl.setText(Integer.toString(i)+" %");
                load.pbr.setValue(i);
                
                if(i==10){
                   load.lbl2.setText("Turning On Modules...");
                } if(i==25){
                   load.lbl2.setText("Loading On Modules...");
                }
                if(i==35){
                   load.lbl2.setText("Connecting DataBase...");
                }
                if(i==50){
                   load.lbl2.setText("Generating Interfaces...");
                }
                 if(i==65){
                   load.lbl2.setText("Loading Java Libraries...");
                }
                if(i==88){
                   load.lbl2.setText("Finalizing...");
                }
                if(i==100){
                 load.setVisible(false);  
                 login.setVisible(true);
                }
            
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    

     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/schooldb", "root", "");
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM tech_regi WHERE username='admin' AND usertype='Admin' AND password='admin'";
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()){
                //do nothing if true
            }else{
                String insert = "INSERT INTO tech_regi (username,usertype, password) VALUES ('admin','Admin', 'admin')";
                PreparedStatement pstmt = conn.prepareStatement(insert);
                pstmt.executeUpdate();
            }
      
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }  
 }

