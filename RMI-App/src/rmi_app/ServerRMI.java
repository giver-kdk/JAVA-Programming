/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.app;
//import java.rmi.registry.Registry;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;               // For 'UnicastRemoteObject'

public class ServerRMI extends AdderRemote {
    public ServerRMI(){
        
    }
    
    public static void main(String[] args){
        try{
           AdderRemote obj = new AdderRemote();
           // Exporting interface to client for accessing the skeleton
           Adder skeleton = (Adder) UnicastRemoteObject.exportObject(obj, 0);
           Registry registry = LocateRegistry.getRegistry();
           // Bind the registry with skeleton
           registry.bind("csit", skeleton);
           System.out.println("Server is Ready...");                  // Inform server side program completion
            
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
