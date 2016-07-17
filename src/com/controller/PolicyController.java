/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dbconnection.DBConnection;
import com.dbconnection.DBHandler;
import com.model.Customer;
import com.model.Policy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author supun
 */
public class PolicyController {

    public static String getLastLifePolicyId() throws SQLException, ClassNotFoundException {
        String query = "select PolicyID from Policy where PolicyID like 'L%' order by 1 desc limit 1";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;

    }

    public static String getLastVehiclePolicyId() throws SQLException, ClassNotFoundException {
        String query = "select PolicyID from Policy where PolicyID like 'V%' order by 1 desc limit 1";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;

    }

    public static String getLastMedicalPolicyId() throws SQLException, ClassNotFoundException {
        String query = "select PolicyID from Policy where PolicyID like 'M%' order by 1 desc limit 1";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;

    }

    public static int addPolicy(Policy policy) throws SQLException, ClassNotFoundException {
        String query = "insert into Policy values(?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();

        return DBHandler.setData(query, connection, policy.getNic(), policy.getPolicyId(), policy.getPolicyType(), policy.getAmount(), policy.getStartDate());

    }

    public static Policy[] getPolicyDetails(String poicyId) throws ClassNotFoundException, SQLException {
        String query = "Select*from Policy where PolicyID='" + poicyId + "'";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        Policy[] policyList = new Policy[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            policyList[i] = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return policyList;

    }

    public static Policy[] getNicDetails(String nic) throws ClassNotFoundException, SQLException {
        String query = "Select*from Policy where Nic='" + nic + "'";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        Policy[] policyList = new Policy[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            policyList[i] = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return policyList;

    }
    
    public static Policy[] getAllPolicys() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Policy";
        ResultSet rst = DBHandler.getData(sql, DBConnection.getInstance().getConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        Policy[] doctorList = new Policy[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            doctorList[i] = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return doctorList;
    }
    
       public static Policy searchPolicy(String policyId) throws SQLException, ClassNotFoundException {
        String query = "select * from Policy where PolicyID=?";

        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = DBHandler.getData(query, connection, policyId);

        Policy policy = null;

        if (rst.next()) {
            policy = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return policy;
    }
       
       public static Policy[] showPolicy() throws ClassNotFoundException, SQLException {
        String sql = "Select * From Policy ";
        ResultSet rst = DBHandler.getData(sql, DBConnection.getInstance().getConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        Policy[] policyList = new Policy[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            policyList[i] = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return policyList;
    }
       
       public static Policy[] getCIDDetails(String id) throws ClassNotFoundException, SQLException {
        String query = "Select*from Policy where Nic='" + id + "'";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        Policy[] policytList = new Policy[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            policytList[i] = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return policytList;

    }
       
       public static Policy[] getNameDetails(String name) throws ClassNotFoundException, SQLException {
        String query = "Select*from Policy where PolicyType='" + name + "'";
        ResultSet rst = DBHandler.getData(query, DBConnection.getInstance().getConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        Policy[] policyList = new Policy[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            policyList[i] = new Policy(rst.getString("Nic"), rst.getString("PolicyID"), rst.getString("PolicyType"), rst.getDouble("Amount"), rst.getString("StartDate"));
        }
        return policyList;

    }
       
       
       public static int updatePolicy(Policy policy) throws ClassNotFoundException, SQLException {
        String query = "Update Policy set Nic=?, PolicyType=?,Amount=?, StartDate=? where PolicyID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        return DBHandler.setData(query, connection, policy.getNic(), policy.getPolicyType(), policy.getAmount(), policy.getStartDate(), policy.getPolicyId());

    }

}
