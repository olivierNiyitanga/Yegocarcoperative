/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rocky
 */
public class AdminDao {
    public String addAdmin(Admin admin){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(admin);
            tr.commit();
            ss.close();
            return "admin Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String updateAdmin(Admin admin){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(admin);
            tr.commit();
            ss.close();
            return "admin updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public String deleteAdmin(Admin admin){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(admin);
            tr.commit();
            ss.close();
            return "admin deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public List<Admin> admins(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Admin> adminList=ss.createQuery("select admin from Admin admin").list();
               ss.close();
               return adminList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Admin searchById(Admin admin){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Admin admn = (Admin)ss.get(Admin.class, admin.getAdminId());
               ss.close();
               return admn;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Admin login(Admin admin) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("SELECT a FROM Admin a WHERE a.username = :username AND a.password = :password");
            query.setParameter("username", admin.getUsername());
            query.setParameter("password", admin.getPassword());
            Admin admn = (Admin) query.uniqueResult();
            ss.close();
            return admn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
