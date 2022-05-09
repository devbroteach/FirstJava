package firstjava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DiffSampleInheritInterface {
    public static void m밍in(String[] args) {
        var f = new JFrame("차분 프로그래밍");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var g = img.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 600, 400);
        g.drawImage(lineImage(), 10,10, f);
        g.drawImage(rectImage(), 280, 80, f);
        var label = new JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
    }

    interface ImageDrawer {
        default BufferedImage createImage() {
            var image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
            var graphics = image.createGraphics();
            draw(graphics);
            return image;
        }

        void draw(Graphics2D g);
    }

    static BufferedImage lineImage() {
        return new ImageDrawer() {
            @Override
            public void draw(Graphics2D g) {
                g.drawLine(10, 10, 220, 180);
            }
        }.createImage();
    }

    static BufferedImage rectImage() {
        return new ImageDrawer() {
            @Override
            public void draw(Graphics2D g) {
                g.drawRect(10, 10, 220, 180);
            }
        }.createImage();
    }
}
