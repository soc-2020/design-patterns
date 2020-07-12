package strategy;

import javax.swing.*;

public class ZaxThread extends Thread {

    private Movable zax;
    private JLabel label;

    public ZaxThread(Movable zax, JLabel label) {
        this.zax = zax;
        this.label = label;
    }

    public void run() {
        while(true) {
            zax.move();
            label.setLocation(zax.getPosX()-10, zax.getPosY()-10);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
