/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dbconnection.DBConnection;
import com.dbconnection.DBHandler;
import com.model.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author supun
 */
public class CustomerController {

    public static Customer searchCustomer(String nic) throws SQLException, ClassNotFoundException {
        String query = "select *from Customer where Nic=?";

        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = DBHandler.getData(query, connection, nic);

        Customer customer = null;

        if (rst.next()) {
            customer = new Customer(rst.getString("Nic"), rst.getString("FirstName"), rst.getString("LastName"), rst.getDate("Dob"),rst.getString("Address"),rst.getString("ContactNo"));
        }
        return customer;
    }
    
        public static int addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String query = "insert into Customer values(?,?,?,?,?,?)" ;
        Connection connection = DBConnection.getInstance().getConnection();
       
        return DBHandler.setData(query, connection, customer.getNic(), customer.getFirstName(),customer.getLastName(),customer.getDob(),customer.getAddress(),customer.getContactNo());
        
        
    }  
    
}
