/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jnet_UDP;
import java.io.*;
import java.net.*;
import java.util.*;

public class DatagramSocketClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            //creating datagram socket client
            DatagramSocket ds =  new DatagramSocket();
            //extracting ip addresss of local host
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println(ip);
            byte []bstr = null;
            System.out.println("client started");
            System.out.println("enter anything you like");
            //reading inout from console and converting in
                String str1 = sc.nextLine();
                bstr = str1.getBytes();
                //creating datagram packet
            DatagramPacket dp = new DatagramPacket(bstr,bstr.length,ip,2000);
            //invoking send to send data packet
            ds.send(dp);
            System.out.println("request is sent");
        }catch(SocketException s){
            System.out.println(s);
        }catch(IOException s){
            System.out.println(s);
        }
    }
}
