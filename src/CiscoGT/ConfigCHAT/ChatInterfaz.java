/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CiscoGT.ConfigCHAT;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author Carlos Bautista
 * @CanalOficcial Cisco GT
 * @Carrera Ingenieria en Sistemas y TICs
 * 
 */

public interface ChatInterfaz extends Remote
{
    // declarando métodos para llamar de forma remota
    public boolean login(String username) throws RemoteException;
        public void logout(String username) throws RemoteException;
            public void sendMessage(Mensaje message) throws RemoteException;
        public List<Mensaje> getAllMessages() throws RemoteException;
    public List<String> getAllUsers() throws RemoteException;
}
