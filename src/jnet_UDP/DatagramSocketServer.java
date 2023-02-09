/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jnet_UDP;
import java.io.*;
import java.net.*;

public class DatagramSocketServer {
    public static void main(String[] args) {
        //creating socket to listen port
        try{
            //creating server socket
            DatagramSocket ds = new DatagramSocket(2000);
            byte []rec = new byte[Byte.MAX_VALUE];
            DatagramPacket dprec = null;
            
            System.out.println("server started");
            
            dprec = new DatagramPacket(rec,rec.length);
            ds.receive(dprec);//receive packet from client
            String response = new String(dprec.getData());
                System.out.println("response is" + response);
        }catch(SocketException s){
            System.out.println(s);
        }catch(IOException s){
            System.out.println(s);
        }
    }
}
