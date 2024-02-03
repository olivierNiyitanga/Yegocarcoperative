/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Rocky
 */

public class Contribution implements Serializable{
  
   private Integer contributionId;
   
   private Driver plate;
   private Integer amount;
   private Date date;

    public Contribution(Integer contributionId, Driver plate, Integer amount, Date date) {
        this.contributionId = contributionId;
        this.plate = plate;
        this.amount = amount;
        this.date = date;
    }

    public Contribution() {
    }
    

    public Integer getContributionId() {
        return contributionId;
    }

    public void setContributionId(Integer contributionId) {
        this.contributionId = contributionId;
    }

    public Driver getPlate() {
        return plate;
    }

    public void setPlate(Driver plate) {
        this.plate = plate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}
