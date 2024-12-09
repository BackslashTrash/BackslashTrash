package hello;

import javax.swing.*;

public class MainGameFrame extends JFrame{
    public MainGameFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Pet Sim");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        GamePanel john = new GamePanel();
        frame.add(john);
        frame.pack();
        john.startThread();
    }
    public static void main(String[] args)throws InterruptedException {
        new MainGameFrame();

    }
}
