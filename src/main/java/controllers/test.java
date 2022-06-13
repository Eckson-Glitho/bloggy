/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.DBConnect;

/**
 *
 * @author gecks
 */
public class test {
    public static void main(String [] arg){
    
    DBConnect cb = new DBConnect();
    
    cb.connect();
    }
}
