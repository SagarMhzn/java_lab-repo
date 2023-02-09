/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jnet_TCP;
import java.net.*;
import java.io.*;

public class Server {
    private Socket skt = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    
    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("server started");
            System.out.println("wating for client");
            skt = server.accept();//creating connecton with the client
            System.out.println("client accepted");
            
            in = new DataInputStream(new BufferedInputStream(skt.getInputStream()));
            String ans = "";
            while(!ans.equals("out")){
                ans =in.readUTF();
                System.out.println("client says" + ans); 
            }
            skt.close();
            in.close();
        }catch(IOException i){
            System.out.println(i);
        }
        try{
            skt.close();
            in.close();
        }catch(IOException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Server s1 = new Server(5000);
    }
}
