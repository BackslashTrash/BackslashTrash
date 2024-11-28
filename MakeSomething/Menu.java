import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Menu extends JFrame{
    private JMenu menu;
    private JMenuBar bar;
    private JMenuItem exit;
    public Menu() {
        setLayout(new FlowLayout());
        bar = new JMenuBar();
        setJMenuBar(bar);
        menu = new JMenu("Menu");
        bar.add(menu);
        exit = new JMenuItem("Exit");
        menu.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D myg2d = (Graphics2D)g;
        myg2d.drawRect(280,280,20,20);
    }

    public static void main(String[] args) {
        Menu myMenu = new Menu();
        myMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myMenu.setSize(600, 600);
        myMenu.setVisible(true);
        new GamePanel();

    }
}
