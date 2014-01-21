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
public class Client {

    String msg;
    Socket connection;
    ObjectInputStream in;
    ObjectOutputStream out;

    public void message() throws Exception {

        connection = new Socket("localhost", 1024);

        out = new ObjectOutputStream(connection.getOutputStream());
        in = new ObjectInputStream(connection.getInputStream());

        msg = (String) in.readObject();
        System.out.println(msg);

        msg = new String(" Cliente -> Olá Mundo ... ");
        out.writeObject(msg);

        in.close();
        out.close();
        connection.close();

    }
}
