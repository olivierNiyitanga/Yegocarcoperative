/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.imprementation;

import dao.AdminDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Admin;
import service.AdminService;

/**
 *
 * @author Rocky
 */
public class AdminImp extends UnicastRemoteObject implements AdminService {

    public AdminImp() throws RemoteException {
        super();
    }
    AdminDao dao = new AdminDao();

    @Override
    public String addAdmin(Admin admin) throws RemoteException {
        return dao.addAdmin(admin);
    }

    @Override
    public String updateAdmin(Admin admin) throws RemoteException {
        return dao.updateAdmin(admin);}

    @Override
    public String deleteAdmin(Admin admin) throws RemoteException {
      return dao.deleteAdmin(admin);}

    @Override
    public List<Admin> admins() throws RemoteException {
       return dao.admins();}

    @Override
    public Admin searchById(Admin admin) throws RemoteException {
        return dao.searchById(admin);}

    @Override
    public Admin login(Admin admin) throws RemoteException {
    return dao.login(admin);}

}
