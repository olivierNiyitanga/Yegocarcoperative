/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Rocky
 */
@Entity
public class Driver implements Serializable{
    @Id
    private String plateNo;
    private String fname;
    private String lname;
    private String phone;
    private String address;
    private String password;   
   

    public Driver(String plateNo, String fname, String lname, String phone, String address, String password) {
        this.plateNo = plateNo;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }

    public Driver() {
    }
    

    public Driver(String plateNo) {
        this.plateNo = plateNo;
    }

   
    

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  

   
}
