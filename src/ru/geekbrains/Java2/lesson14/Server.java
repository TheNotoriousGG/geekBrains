package ru.geekbrains.Java2.lesson14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try (ServerSocket serverSocket = new ServerSocket(8800)) {
            System.out.println("Сервер зпущен.");
            System.out.println("Ожидание клиента...");

            socket = serverSocket.accept();
            System.out.println("Клиент подключен.");
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String message = dis.readUTF();

                if (message.equalsIgnoreCase("/stopserver")) {
                    dos.writeUTF(message);
                    break;
                }
                System.out.println("Клиент: "+message);
                dos.writeUTF(scanner.nextLine());

            }
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
