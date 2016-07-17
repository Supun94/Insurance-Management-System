
package com.model;

import java.util.Date;

public class Claim {
    private String claimId;
    private String policyId;
    private String claimDate;
    private double claimAmount;
    private String description;

    public Claim() {
    }
    
    public Claim(String policyId,double claimAmount){
        this.claimId = policyId; 
        this.claimAmount = claimAmount;
    }

     public Claim(String policyId, String claimDate, double claimAmount, String description) {
        this.policyId = policyId;
        this.claimDate = claimDate;
        this.claimAmount = claimAmount;
        this.description = description;
    }
    
    public Claim(String claimId, String policyId, String claimDate, double claimAmount, String description) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.claimDate = claimDate;
        this.claimAmount = claimAmount;
        this.description = description;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
