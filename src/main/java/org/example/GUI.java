package org.example;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI implements KeyListener {
    public GUI() {
        JFrame f = new JFrame();
        JTextField tf = new JTextField();
        JTextField nf = new JTextField();
        JLabel l = new JLabel("Enter Username:");
        JList jl = new JList();
        JPanel panel = new JPanel();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(420,450);
        f.add(panel);
        f.setLayout(null);
        f.setVisible(true);
        //enter username
        l.setText("Enter username:");
        l.setLocation(20,200);
        l.setHorizontalTextPosition(JLabel.CENTER);
        nf.setSize(100,30);
        nf.setLocation(190,200);
        nf.setBorder(new LineBorder(Color.blue,2));
        nf.addKeyListener(this);
        f.add(l);
        f.add(nf);
        //chat
        tf.setSize(400,30);
        tf.setLocation(10,350);
        tf.setBorder(new LineBorder(Color.blue,2));
        jl.setSize(400,300);
        jl.setLocation(10,50);
        jl.setBorder(new LineBorder(Color.blue,2));
        tf.setVisible(false);
        jl.setVisible(false);
        f.add(tf);
        f.add(jl);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        ;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_ENTER) {
            ;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public static void main(String[] args) {
        ;
    }
}


