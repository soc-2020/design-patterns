package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewsGUI {
    private JFrame newsFrame;
    private JTextField newsField;
    private JCheckBox dbCheck;
    private JCheckBox logCheck;
    private JCheckBox netCheck;

    private NewsFeed feed;
    private NewsDBRecorder db;
    private NewsLog log;
    private NewsDistributor net;

    public NewsGUI() {
        feed = new NewsFeed();
        db = new NewsDBRecorder();
        log = new NewsLog();
        net = new NewsDistributor();

        newsFrame = new JFrame();
        newsField = new JTextField();
        newsField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feed.distribute(newsField.getText());
                newsField.setText("");
            }
        });

        newsFrame.add(newsField, BorderLayout.NORTH);

        newsFrame.add(getCheckBoxPanel(), BorderLayout.SOUTH);

        newsFrame.setSize(400,150);
        newsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        newsFrame.setVisible(true);
    }

    public JPanel getCheckBoxPanel() {
        JPanel panel = new JPanel();
        dbCheck = new JCheckBox("db");
        dbCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dbCheck.isSelected()) {
                    feed.register(db);
                }
                else {
                    feed.unregister(db);
                }
            }
        });
        panel.add(dbCheck);
        logCheck = new JCheckBox("log");
        logCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(logCheck.isSelected()) {
                    feed.register(log);
                }
                else {
                    feed.unregister(log);
                }
            }
        });
        panel.add(logCheck);
        netCheck = new JCheckBox("net");
        netCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(netCheck.isSelected()) {
                    feed.register(net);
                }
                else {
                    feed.unregister(net);
                }
            }
        });
        panel.add(netCheck);
        return panel;
    }

    public static void main(String[] args) {
        NewsGUI gui = new NewsGUI();
    }
}
