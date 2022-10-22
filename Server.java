// import java.math.BigInteger;
// import java.net.ServerSocket;
// import java.util.Scanner;
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
//import java.util.function.IntToDoubleFunction;

public class Server {
    public static void main(String[] args) 
    {
        Weather[] w = WeatherGenerator.getWeather();
        System.out.println(w[0].getW());
        Socket sock = null;//создаем сокет
        ServerSocket server=null; //создаем сокет
        try
        {
            server = new ServerSocket(12345);
            while(true){
                System.out.println("Waiting for a client...");
                sock = server.accept();//ждем подключения
                System.out.println("Client connected");
                DataInputStream in = new DataInputStream(sock.getInputStream());//создаем поток для чтения
                DataOutputStream out = new DataOutputStream(sock.getOutputStream());//создаем поток для отправки
                int temp = in.readInt();
                System.out.println(w[temp-1].getW());
                System.out.println(w[temp-1].getDeg());
                out.writeDouble(w[temp-1].getDeg());//отправляем число
                out.writeUTF(w[temp-1].getW());//отправляем строку
            }
        }
        catch(IOException e) {}//кстати обязательно ловим эту ошибку
    }
}
