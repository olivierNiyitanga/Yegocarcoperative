/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.imprementation;

import dao.DriverDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Driver;
import service.DriverService;

/**
 *
 * @author Rocky
 */
public class DriverImp extends UnicastRemoteObject implements DriverService{

    public DriverImp() throws RemoteException{
        super();
    }
    DriverDao dao = new DriverDao();

    @Override
    public String addCarDriver(Driver driver) throws RemoteException {
      return dao.addCarDriver(driver);
    }

    @Override
    public String updateCarDriver(Driver driver) throws RemoteException {
      return dao.updateCarDriver(driver);
    }

    @Override
    public String deleteCarDriver(Driver driver) throws RemoteException {
    return dao.deleteCarDriver(driver);
    }

    @Override
    public List<Driver> carDrivers() throws RemoteException {
     return dao.drivers();
    }

    @Override
    public Driver searchById(Driver driver) throws RemoteException {
     return dao.searchById(driver);
    }

    @Override
    public Driver login(Driver driver) throws RemoteException {
    return dao.login(driver);
    }
    
}
