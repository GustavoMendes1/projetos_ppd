/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author Gustavo Mendes
 */
import java.rmi.Remote; 
import java.rmi.RemoteException;

public interface InverterItf extends Remote {

  void enviarmensagem(String msg) throws  RemoteException;
  
  void moverpeca(String peca, int x, int y) throws  RemoteException;
  
  void comer(String pecaAtual,int x, int y, String pecaComida) throws  RemoteException;
  
  void desistir() throws  RemoteException;
}
