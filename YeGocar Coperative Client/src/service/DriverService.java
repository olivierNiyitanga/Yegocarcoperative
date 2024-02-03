/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Driver;

/**
 *
 * @author la paix
 */
public interface DriverService extends Remote{
     public String addCarDriver(Driver driver) throws RemoteException;

    public String updateCarDriver(Driver driver) throws RemoteException;

    public String deleteCarDriver(Driver driver) throws RemoteException;

    public List<Driver> carDrivers() throws RemoteException;

    public Driver searchById(Driver driver) throws RemoteException;  
    public Driver login(Driver driver) throws RemoteException;
}
