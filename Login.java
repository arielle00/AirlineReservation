
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

    static JFrame frame = new JFrame();
    static SelectFlight object = null;
    static UserInput uI = new UserInput();
    static UserDetails uD = new UserDetails();
    static Ticket tic = new Ticket();

    public static void main(String[] args) throws IOException {
        //JFrame frame = new JFrame();
        frame.setSize(500, 300);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Airline Reservation");
        title.setFont(title.getFont().deriveFont(30.0f));
        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JButton enter = new JButton("Login");

        JTextField user = new JTextField(15);
        JPasswordField pass = new JPasswordField(15);
        pass.setEchoChar('*');

        title.setBounds(85, 10, 300, 100);
        username.setBounds(100, 100, 150, 21);
        user.setBounds(250, 100, 100, 21);
        password.setBounds(100, 140, 100, 21);
        pass.setBounds(250, 140, 100, 21);
        enter.setBounds(160, 200, 100, 25);

        panel.add(title);
        panel.add(username);
        panel.add(user);
        panel.add(password);
        panel.add(pass);
        panel.add(enter);

        frame.add(panel);

        enter.addActionListener(event
                -> {
            String userName = user.getText();
            String passWord = pass.getText();

            if (userName.compareTo(passWord) == 0) {
                uD.setUserName(userName);
                frame.remove(panel);
                frame.setSize(500, 350);
                frame.repaint();
                frame.revalidate();

                try {
                    object = new SelectFlight();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try {
                    frame.add(object.makeButtons(uD));
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //frame.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
                /*prints this message when the username and/or password is wrong*/
            }

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.GRAY);
        frame.setVisible(true);

    }

    public static void addTicketPanel() {
        frame.getContentPane().removeAll();
        frame.add(tic.ticketPanel(uD));
        frame.setSize(560, 420);
        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }

    public static void addUserInputPanel() {
        frame.getContentPane().removeAll();
        frame.add(uI.inputPanel(uD));
        frame.setSize(560, 420);
        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }
}
