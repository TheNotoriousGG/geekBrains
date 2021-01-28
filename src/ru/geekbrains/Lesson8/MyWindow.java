package ru.geekbrains.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private int width;
    private int height;

    public MyWindow(int width, int height, int size) {
        this.width = width;
        this.height = height;

        setTitle("Пусть черное станет белым");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(700, 300);
        setSize(width, height);

        setLayout(new GridLayout(size, size));
        JButton[] btn = new JButton[size * size];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            if (i % 2 != 0) {
                btn[i].setBackground(Color.black);
            }
            else{
                btn[i].setBackground(Color.white);
            }

            int finalI = i;

            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (finalI % 2 != 0) {
                        btn[finalI].setBackground(Color.white);
                    }
                    else{
                        btn[finalI].setBackground(Color.black);
                    }

                }
            });
            add(btn[i]);
        }


        setVisible(true);


    }

}
