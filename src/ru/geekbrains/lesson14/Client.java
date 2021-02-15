package ru.geekbrains.lesson14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        final String HOST = "localhost";
        final int PORT = 8800;
        connection(HOST,PORT);

   }

    private static void connection(String HOST, int PORT) throws IOException {
        Socket socket = new Socket(HOST, PORT);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner scan = new Scanner(System.in);

        new Thread(() -> {
            while (true) {
                try {
                    //System.out.println("Клиент) Введи сообщение");
                    dos.writeUTF(scan.nextLine());
                    String msg = dis.readUTF();

                    if(msg.equalsIgnoreCase("/stopserver")){
                        break;
                    }
                    System.out.println("Echo: "+msg);
                    msg = " ";
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
