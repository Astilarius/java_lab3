import java.io.*;
import java.net.Socket;

public class Client
{  
    public static void main(String[] args) 
    {
        Socket sock = null; //создаем сокет
        try
        {
            System.out.println("Connecting to server..."); 
            sock = new Socket("localhost",12345);//подключаемся
            System.out.println("Connected");
            DataInputStream in = new DataInputStream(sock.getInputStream());//создаем поток для чтения
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());//создаем поток для отправки
            out.writeInt(7);
            double deg = in.readDouble();//читаем число
            String weather = in.readUTF();//читаем строку
            System.out.println(deg);
            System.out.println(weather);
        }
        catch(IOException e) {}//кстати обязательно ловим эту ошибку
    }
}