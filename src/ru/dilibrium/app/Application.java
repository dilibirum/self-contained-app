package ru.dilibrium.app;

import java.awt.*;
import java.io.Serializable;
import javax.swing.*;

/**
 * Тестовое приложение для проверки технологии запаковки приложения в JVM
 */
public class Application implements Serializable {

    private static final long serialVersionUID = -2007001247123456L;

    public final int MAIN_FRAME_WIDTH = 900;
    public final int MAIN_FRAME_HEIGHT = 500;

    public Application() {
        String TITLE = "Self-Contained Application Packaging Framework";
        JFrame mainFrame = new JFrame(TITLE);
        ImageIcon img = new ImageIcon(Application.class.getResource("/app-icon.png"));
        mainFrame.setIconImage(img.getImage());
        mainFrame.setSize(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        BorderLayout layout = new BorderLayout();
        mainFrame.setLayout(layout);

        Icon imgIcon = new ImageIcon(Application.class.getResource("/dino.gif"));
        JLabel label = new JLabel(imgIcon, SwingConstants.CENTER);
        label.setSize(MAIN_FRAME_WIDTH,184);
        mainFrame.add(label);

        String sb = "<html><div style='text-align: center;'>" +
                "Если Вы читаете это сообщение, значит мне удалось преодолеть простарнственно-временной контиинум <br/>" +
                "и запустить Java-приложение на устройстве без установленной JVM!</div></html>";
        JLabel label2 = new JLabel(sb, SwingConstants.CENTER);
        label2.setFont(new Font("Consolas", Font.PLAIN, 16));

        mainFrame.add(label2);
        mainFrame.getContentPane().setBackground(Color.WHITE);

        mainFrame.setVisible(true);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
