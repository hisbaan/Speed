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

        for(int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                //paint object in array here
            }
        }
    }
}
