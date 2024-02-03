/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Admin;

/**
 *
 * @author la paix
 */
public interface AdminService extends Remote{
     public String addAdmin(Admin admin) throws RemoteException;

    public String updateAdmin(Admin admin) throws RemoteException;

    public String deleteAdmin(Admin admin) throws RemoteException;

    public List<Admin> admins() throws RemoteException;

    public Admin searchById(Admin admin) throws RemoteException;

    public Admin login(Admin admin) throws RemoteException;
}
