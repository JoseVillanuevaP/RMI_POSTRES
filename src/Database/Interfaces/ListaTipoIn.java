/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Interfaces;
import java.rmi.RemoteException;
import java.rmi.Remote;
/**
 *
 * @author O-5-K
 */
public interface ListaTipoIn extends Remote{
    public String[] lista()throws RemoteException;
}
