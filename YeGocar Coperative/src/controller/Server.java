/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import service.AdminService;
import service.ContributionService;
import service.DriverService;
import service.imprementation.AdminImp;
import service.imprementation.ContributionImp;
import service.imprementation.DriverImp;

/**
 *
 * @author Rocky
 */
public class Server extends UnicastRemoteObject{
    private ContributionService contributionService;
    private DriverService driverService;
    private AdminService adminService;

    public Server() throws RemoteException{
        this.adminService=new AdminImp();
        this.driverService= new DriverImp();
        this.contributionService= new ContributionImp();
    }
    
    public static void main(String[] args) {
         try {
            //set property
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        //create registry
            Registry registry=LocateRegistry.createRegistry(6000);
            registry.rebind("contributionService",new Server().contributionService);
            registry.rebind("driverService", new Server().driverService);           
            registry.rebind("adminService",new Server().adminService);
            System.out.println("YeGocar Coperative Server is Running on port 6000");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
