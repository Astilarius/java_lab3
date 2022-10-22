import java.io.*;
import java.net.Socket;

public class Client
{  
    public static void main(String[] args) 
    {
        Socket sock = null; try
        {
            System.out.println("Connecting to server..."); 
            sock = new Socket("localhost",12345); 
            System.out.println("Connected");
            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            out.writeInt(7);
            double deg = in.readDouble();
            String weather = in.readUTF();
            System.out.println(deg);
            System.out.println(weather);
        }
        catch(IOException e) {}
    }
}