/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg01_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author DELL
 */
public interface Adder extends Remote{
	int add(int a, int b) throws RemoteException;
}

