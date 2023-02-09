/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jnet_TCP;
import java.net.*;
import java.io.*;


public class Client {
    private Socket skt = null;//creating client refrences
    private DataInputStream dis = null;//to take input from console
    private DataOutputStream dos = null;//to send data
    
    //constructor
    public Client(String address,int port){
        try{
               skt = new Socket(address,port);
               System.out.println("client connected");
               dis = new DataInputStream(System.in);
               dos =  new DataOutputStream(System.out);
               
//               String str = "";
//               while(!str.equalsIgnoreCase("out")){
//                   str = dis.readUTF();
//                   dos.writeUTF(str);
//                }
//               dis.close();
//               dos.close();
//               skt.close();
            }catch(UnknownHostException u){     //socket is absent
                System.out.println(u);
            }catch(IOException i){              //io error
                System.out.println(i);
            }
        try{
             String str = "";
               while(!str.equalsIgnoreCase("out")){
                   str = dis.readUTF();
                   dos.writeUTF(str);
                }
               dis.close();
               dos.close();
               skt.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }
    
    public static void main(String[] args) {
        Client c1 = new Client("localhost",5000);
    }
}

