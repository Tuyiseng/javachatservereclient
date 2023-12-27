/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javachat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author user
 */
public class clients {
    public static void main(String[]args)
    {
    
    try{
        Socket a=new Socket("localhost",45089);
        DataOutputStream x=new DataOutputStream(a.getOutputStream());
        x.writeUTF(" connection done ");
        x.flush();
        x.close();
        a.close();
    
    
    
    }
    catch(IOException e){}
    
    
    }
}
