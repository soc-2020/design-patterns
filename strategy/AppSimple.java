package strategy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AppSimple {
    private JFrame frame;
    private ZaxPlain zax;

    public AppSimple() {
        zax = new ZaxPlain();

        frame = new JFrame();
        frame.setSize(1000, 840);
        frame.setTitle("The Zax");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel cPanel = new JPanel();
        cPanel.setLayout(null);
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("src/zax.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        cPanel.add(picLabel);
        picLabel.setBounds(190, 190, 20, 20);
        frame.add(cPanel, BorderLayout.CENTER);

        JPanel bPanel = new JPanel();
        JButton southBtn = new JButton("SOUTH");
        southBtn.addActionListener(event -> {
            zax.setDirection(ZaxPlain.Direction.SOUTH);
        });
        bPanel.add(southBtn);
        JButton northBtn = new JButton("NORTH");
        northBtn.addActionListener(event -> {
            zax.setDirection(ZaxPlain.Direction.NORTH);
        });
        bPanel.add(northBtn);
        JButton eastBtn = new JButton("EAST");
        eastBtn.addActionListener(event -> {
            zax.setDirection(ZaxPlain.Direction.EAST);
        });
        bPanel.add(eastBtn);
        JButton westBtn = new JButton("WEST");
        westBtn.addActionListener(event -> {
            zax.setDirection(ZaxPlain.Direction.WEST);
        });
        bPanel.add(westBtn);

        JButton fastBtn = new JButton("FAST");
        fastBtn.addActionListener(event -> {
            zax.setSpeed(ZaxPlain.Speed.FAST);
        });
        bPanel.add(fastBtn);
        JButton slowBtn = new JButton("SLOW");
        slowBtn.addActionListener(event -> {
            zax.setSpeed(ZaxPlain.Speed.SLOW);
        });
        bPanel.add(slowBtn);
        JButton stopBtn = new JButton("STOP");
        stopBtn.addActionListener(event -> {
            zax.setSpeed(ZaxPlain.Speed.STOP);
        });
        bPanel.add(stopBtn);
        frame.add(bPanel, BorderLayout.SOUTH);

        ZaxThread thread = new ZaxThread(zax, picLabel);
        thread.start();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppSimple app = new AppSimple();
    }
}
