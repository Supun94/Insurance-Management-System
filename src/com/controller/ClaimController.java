/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dbconnection.DBConnection;
import com.dbconnection.DBHandler;
import com.model.Claim;
import com.model.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author supun
 */
public class ClaimController {
    
    public static Claim searchClaimAmount(String claimId) throws SQLException, ClassNotFoundException {
        String query = "select count(ClaimAmount) from Claim where PolicyID=?";

        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = DBHandler.getData(query, connection, claimId);

        Claim claim = null;

        if (rst.next()) {
            claim = new Claim();
        }
        return claim;
    }
    
    public static int addClaim(Claim claim) throws SQLException, ClassNotFoundException {
        String query = "insert into Claim values(?,?,?,?,?)" ;
        Connection connection = DBConnection.getInstance().getConnection();
       
        return DBHandler.setData(query, connection, claim.getClaimId(), claim.getPolicyId(),claim.getClaimDate(),claim.getClaimAmount(),claim.getDescription());
        
        
    }  
    
    
    public static String getLastClaimId() throws SQLException, ClassNotFoundException {
        String query = "select ClaimID from Claim where ClaimID like 'CI%' order by 1 desc limit 1";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;

    }
    
}
