/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.view.AddCustomerDetails;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author supun
 */
public class ValidationController {

//    public static  void genarateBirthday() {
//
//        AddCustomerDetails addCustomerDetails = new AddCustomerDetails();
//        String nic = AddCustomerDetails.nicTextField.getText();
//        String syy = nic.substring(0, 2);
//        String smm = nic.substring(2, 5);
//        syy = "19" + syy;
//        int iyy = Integer.parseInt(syy);
//        int imm = Integer.parseInt(smm);
//
////        char gender = 'M';
////        if (imm > 500) {
////            gender = 'F';
////            
////            imm -= 500;
////        }
//        //maleRadioButton.isSelected() ? "Male" : "Female"
//        String gender;
//        if (imm > 500) {
//            addCustomerDetails.femaleRadioButton.setSelected(true);
//        } else {
//            addCustomerDetails.maleRadioButton.setSelected(true);
//        }
//
//        if (iyy % 4 != 0) {
//            imm -= 1;
//        }
//
//        Calendar c1 = Calendar.getInstance();
//        c1.set(Calendar.YEAR, iyy);
//        c1.set(Calendar.DAY_OF_YEAR, imm);
//
//        Date d = c1.getTime();
////d.
//        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//        String dob = df.format(d);
//        String a = dob.split("/")[0];
//        String b = dob.split("/")[1];
//        String c = dob.split("/")[2];
//        int x = Integer.parseInt(b);
//        if (x < 10) {
//            String n = "0" + x;
//            addCustomerDetails.dateChooser.setDate(d);
//        } else {
//            addCustomerDetails.dateChooser.setDate(d);
//        }
//    }
}
