package hello;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    private final int TILE_SIZE = 20;
    private final int SCALE = 3;
    private final int SCREEN_TILE_SIZE = 60;
    private final int SCREEN_TILE_HORIZONTAL_COUNT = 10;
    private final int SCREEN_TILE_VERTICAL_COUNT = 10;
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
    Thread gameThread1;
    public GamePanel() {
        this.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        this.setBackground(Color.LIGHT_GRAY);
        this.setDoubleBuffered(true);

    }
    public void startThread() {
        gameThread1 = new Thread(this);
        gameThread1.start();
    }
    @Override
    public void run() {
        while (gameThread1 != null) {
            long currentTimeNano = System.nanoTime();
            System.out.println(currentTimeNano);

            update();
            repaint();
        }
    }

    public void update() {

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;
        g2D.setColor(Color.black);
        g2D.fillRect(60,60,SCREEN_TILE_SIZE,SCREEN_TILE_SIZE);
        g2D.dispose();
    }
}
