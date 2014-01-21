/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author cassiano
 */
public class HelloWorld {
    
    static Server server;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        server = new Server ();
        server.message();
        
    }
}
