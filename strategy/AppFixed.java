package strategy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AppFixed {
    private JFrame frame;
    private Zax zax;

    public AppFixed() {
        zax = new Zax();

        frame = new JFrame();
        frame.setSize(1000, 840);
        frame.setTitle("The Zax (with Strategy Pattern)");
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
            zax.setDirectionBehaviour(new DirectionSouth());
        });
        bPanel.add(southBtn);
        JButton northBtn = new JButton("NORTH");
        northBtn.addActionListener(event -> {
            zax.setDirectionBehaviour(new DirectionNorth());
        });
        bPanel.add(northBtn);
        JButton eastBtn = new JButton("EAST");
        eastBtn.addActionListener(event -> {
            zax.setDirectionBehaviour(new DirectionEast());
        });
        bPanel.add(eastBtn);
        JButton westBtn = new JButton("WEST");
        westBtn.addActionListener(event -> {
            zax.setDirectionBehaviour(new DirectionWest());
        });
        bPanel.add(westBtn);
        JButton nwBtn = new JButton("NW");
        nwBtn.addActionListener(event -> {
            zax.setDirectionBehaviour(new DirectionNorthWest());
        });
        bPanel.add(nwBtn);

        JButton fastBtn = new JButton("FAST");
        fastBtn.addActionListener(event -> {
            zax.setSpeedBehaviour(new SpeedFast());
        });
        bPanel.add(fastBtn);
        JButton slowBtn = new JButton("SLOW");
        slowBtn.addActionListener(event -> {
            zax.setSpeedBehaviour(new SpeedSlow());
        });
        bPanel.add(slowBtn);
        JButton stopBtn = new JButton("STOP");
        stopBtn.addActionListener(event -> {
            zax.setSpeedBehaviour(new SpeedStopped());
        });
        bPanel.add(stopBtn);
        frame.add(bPanel, BorderLayout.SOUTH);

        ZaxThread thread = new ZaxThread(zax, picLabel);
        thread.start();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppFixed app = new AppFixed();
    }
}
