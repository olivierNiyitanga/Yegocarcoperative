/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.imprementation;

import dao.ContributionDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Contribution;
import service.ContributionService;

/**
 *
 * @author Rocky
 */
public class ContributionImp extends UnicastRemoteObject implements ContributionService{

    public ContributionImp() throws RemoteException{
        super();
    }
    ContributionDao dao= new ContributionDao();

    @Override
    public String addContribution(Contribution contribution) throws RemoteException {
     return dao.addContribution(contribution);
    }

    @Override
    public String updateContribution(Contribution contribution) throws RemoteException {
     return dao.updateContribution(contribution);
    }

    @Override
    public String deleteContribution(Contribution contribution) throws RemoteException {
    return dao.deleteContribution(contribution);
    }

    @Override
    public List<Contribution> contributions() throws RemoteException {
    return dao.contributions();
    }

    @Override
    public List<Contribution> searchById(String plateNo) throws RemoteException {
     return dao.searchById(plateNo);
    }
    
}
