/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CiscoGT.ChatCliente;



import CiscoGT.ConfigCHAT.ChatInterfaz;
import CiscoGT.Interfaces.InterfazCHAT;
import CiscoGT.Interfaces.VerChat;
import java.rmi.RMISecurityManager;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Carlos Bautista
 * @CanalOficcial Cisco GT
 * @Carrera Ingenieria en Sistemas y TICs
 *
 */

public class ChatClient 
{
    public static void main(String[] args)
    {   
       // System.setProperty("java.security.policy","C:/Users/TeamIT/Documents/NetBeansProjects/ExamenPrograParte1/src/CiscoGT/ChatCliente/Permisos.policy");
       //#	::1             localhost
        
        if (System.getSecurityManager () == null) 
            {
                System.setSecurityManager (new RMISecurityManager ());
            }
        
        try 
        {  
            Registry registry = LocateRegistry.getRegistry("localhost", 9013);
            
                 ChatInterfaz chat = (ChatInterfaz)registry.lookup("stormbreaker");  // obteniendo una referencia remota      
            new InterfazCHAT(chat);  // pasar la referencia como parámetro 
        } 
        catch (Exception e) 
        {
           e.printStackTrace();
        }
    }        
}
