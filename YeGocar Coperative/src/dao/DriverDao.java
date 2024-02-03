/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Driver;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rocky
 */
public class DriverDao {
    public String addCarDriver(Driver driver){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(driver);
            tr.commit();
            ss.close();
            return "carDriver Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public String updateCarDriver(Driver driver){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(driver);
            tr.commit();
            ss.close();
            return "carDriver Updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String deleteCarDriver(Driver driver){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(driver);
            tr.commit();
            ss.close();
            return "carDriver deletd";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      
       public List<Driver> drivers(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Driver> adminList=ss.createQuery("select admin from Driver admin").list();
               ss.close();
               return adminList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       
       public Driver searchById(Driver carDriver){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Driver mtr = (Driver)ss.get(Driver.class, carDriver.getPlateNo());
               ss.close();
               return mtr;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       //////////////////////////////////////////////////
     public Driver login(Driver driver) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT m FROM Driver m WHERE m.plateNo = :plateno AND m.password = :password");
        query.setParameter("plateno", driver.getPlateNo());
        query.setParameter("password", driver.getPassword());
        Driver mtr = (Driver) query.uniqueResult();
        session.close();
        return mtr;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
}
