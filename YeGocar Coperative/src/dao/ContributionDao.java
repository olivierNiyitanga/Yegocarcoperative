/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Contribution;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rocky
 */
public class ContributionDao {
  public String addContribution(Contribution contribution){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(contribution);
            tr.commit();
            ss.close();
            return "contribution Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String updateContribution(Contribution contribution){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(contribution);
            tr.commit();
            ss.close();
            return "contribution updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public String deleteContribution(Contribution contribution){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(contribution);
            tr.commit();
            ss.close();
            return "contribution deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public List<Contribution> contributions(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Contribution> contributionList=ss.createQuery("select contribution from Contribution contribution").list();
               ss.close();
               return contributionList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public List<Contribution> searchById(String plateNo){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Query query = ss.createQuery("SELECT contribution FROM Contribution contribution WHERE contribution.plate.plateNo = :plateNo");
        query.setParameter("plateNo", plateNo);
        List<Contribution> contributionList = query.list();
        ss.close();
        return contributionList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }   
}
