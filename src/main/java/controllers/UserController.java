package controllers;

import DAO.DBConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.UserModel;

public class UserController {
    /**
     * UserModel registration
     * @param user
     */
    public void register(UserModel user) {
        DBConnect co = new DBConnect();
        co.connect();

        String req = "Insert into user (fullname, email, password) "
                + "values ('" + user.getFullname() + "', '" + user.getEmail() + "', '" + user.getPassword() + "')";

        try {
            co.state.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * UserModel login
     * @param email
     * @param password
     * @return 
     */
    public boolean login(String email, String password){
        boolean x = false;
        DBConnect co = new DBConnect();
        co.connect();

        String req = "Select * from user where email = '" + email + "' and password = '" + password +"'";

        try {
            ResultSet res = co.state.executeQuery(req);
            
            while (res.next()) {
                x = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    /**
     * modify a profile
     * @param user 
     */
    public void profil(UserModel user){
        DBConnect co = new DBConnect();
        co.connect();
        
        String req = "Update user set fullname = '"+ user.getEmail() +"', email = '"+ user.getEmail() +"', "
                + "password = '"+ user.getPassword()+"'";
        
        try {
            co.state.executeUpdate(req);
            JOptionPane.showMessageDialog(null, "profil succesfully modified");
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}