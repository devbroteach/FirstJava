package firstjava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Circles {
    public static void main(String[] args) {
        var img = new BufferedImage(500, 400,
                BufferedImage.TYPE_INT_RGB);
        var g = img.createGraphics();
        for (int x = 0; x < 12 ; x++) {
            for (int y = 0; y < 12; y++) {
                 if(x==2) g.setColor(Color.BLUE);
                 else g.setColor(Color.WHITE);

                g.fillOval(x * 30 + 50, y * 30 + 20, 25, 25);

            }
        }
        var f = new JFrame("원 나열하기");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel(new ImageIcon(img)));
        f.pack();
        f.setVisible(true);
    }
}
