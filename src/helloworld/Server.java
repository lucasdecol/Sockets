/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.*;
import java.net.*;

/**
 *
 * @author cassiano
 */
public class Server {

    String msg;
    Socket connection;
    ObjectInputStream in;
    ObjectOutputStream out;
    ServerSocket serverSocket;

    public void message() throws Exception {

        serverSocket = new ServerSocket(1024);
        System.out.println(" Servidor aguardando conexão ... ");

        connection = serverSocket.accept();

        out = new ObjectOutputStream(connection.getOutputStream());
        in = new ObjectInputStream(connection.getInputStream());
        msg = new String(" Servidor -> Olá Mundo ... ");
        
        out.writeObject(msg);

        msg = (String) in.readObject();
        System.out.println(msg);
        in.close();
        out.close();
        connection.close();
        serverSocket.close();
        System.out.println("Conexão Fechada");
    }
}
