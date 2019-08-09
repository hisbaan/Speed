/*
File: Drawing.java
Created: 08/08/2019
Author: Hisbaan Noorani
*/

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    Drawing() {
        repaint();
    }

    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;

        g.setColor(Color.black);
        g.fillRect(0, 0, Speed.FRAME_X, Speed.FRAME_Y);

        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                g.setColor(Color.red);
                if (Speed.apple[x][y] == 1)
                    g.fillRect((Speed.FRAME_X / 20) * x, (Speed.FRAME_Y / 20) * y, (Speed.FRAME_X / 20), (Speed.FRAME_Y / 20));
                g.setColor(Color.white);
                if (Speed.position[x][y] == 1)
                    g.fillRect((Speed.FRAME_X / 20) * x, (Speed.FRAME_Y / 20) * y, (Speed.FRAME_X / 20), (Speed.FRAME_Y / 20));
            }
        }
    }
}