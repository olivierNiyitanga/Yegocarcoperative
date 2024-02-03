/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Contribution;

/**
 *
 * @author la paix
 */
public interface ContributionService extends Remote{
    public String addContribution(Contribution contribution) throws RemoteException;

    public String updateContribution(Contribution contribution) throws RemoteException;

    public String deleteContribution(Contribution contribution) throws RemoteException;

    public List<Contribution> contributions() throws RemoteException;

    public List<Contribution> searchById(String plateNo) throws RemoteException;
}
