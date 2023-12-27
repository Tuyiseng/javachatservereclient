/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javachat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.lang.*;

/**
 *
 * @author user
 */
public class server {
 
   /* private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    private String nick;  

   public void run()
    {
        try{
        ServerSocket server= new ServerSocket(5555);
           Socket client =server.accept(); 
      
       
            out= new PrintWriter(client.getOutputStream(),true);
            in= new BufferedReader(new InputStreamReader(client.getInputStream()));
            out.println("Enter nick name ");
            nick=in.readLine();
            
        }
        catch (IOException e){}
    
    
    
    }
        

   class connectionhandler implements Runnable {
  
    public connectionhandler (Socket client)
    {
        this.client=client; 
    }
        }

*/

    public static void main (String[] args)
    {
        try{
        ServerSocket server=new ServerSocket(45089);
        Socket x=server.accept();
       // BufferedReader a= new BufferedReader(InputStreamReader(x.getInputStream()));
       DataInputStream a=new DataInputStream(x.getInputStream()); 
       
       String out=(String) a.readUTF();
       System.out.print("message is: "+out);
  
       
       server.close();
        }
        catch(IOException e){}
        
        
        
        
        
        
    }

    private static Reader InputStreamReader(InputStream inputStream) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    }
  

    
   