
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectFlight extends UserDetails {

    static UserDetails uD = new UserDetails();
    UserInput uI = new UserInput();

    public SelectFlight() throws IOException {

    }

    public static JPanel makeButtons(UserDetails uD) throws IOException {

        String f1 = ("SFO -> LAX, 4:00pm, $110");
        String f2 = ("LAX -> SFO, 10:00pm, $90");
        String f3 = ("OAK -> SNA, 11:00am, $120");
        String f4 = ("SNA -> OAK, 2:00pm, $130");

        String f5 = ("MAD -> LAX, 4:00pm, $340");
        String f6 = ("LAX -> MAD , 10:00pm, $320");
        String f7 = ("EWR -> DXB, 11:00am, $120");
        String f8 = ("DXB -> EWR, 2:00pm, $130");

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);

        JLabel domestic = new JLabel("Domestic Flights");
        JLabel international = new JLabel("International Flights");

        domestic.setBounds(20, 10, 200, 25);
        international.setBounds(20, 150, 200, 25);

        JButton Dflight1 = new JButton(f1);
        JButton Dflight2 = new JButton(f2);
        JButton Dflight3 = new JButton(f3);
        JButton Dflight4 = new JButton(f4);

        Dflight1.setBounds(150, 20, 300, 25);
        Dflight2.setBounds(150, 50, 300, 25);
        Dflight3.setBounds(150, 80, 300, 25);
        Dflight4.setBounds(150, 110, 300, 25);

        JButton Iflight5 = new JButton(f5);
        JButton Iflight6 = new JButton(f6);
        JButton Iflight7 = new JButton(f7);
        JButton Iflight8 = new JButton(f8);

        Iflight5.setBounds(150, 160, 300, 25);
        Iflight6.setBounds(150, 190, 300, 25);
        Iflight7.setBounds(150, 220, 300, 25);
        Iflight8.setBounds(150, 250, 300, 25);

        panel2.add(Dflight1);
        panel2.add(Dflight2);
        panel2.add(Dflight3);
        panel2.add(Dflight4);
        panel2.add(domestic);
        panel2.add(international);
        panel2.add(Iflight5);
        panel2.add(Iflight6);
        panel2.add(Iflight7);
        panel2.add(Iflight8);
        panel2.add(domestic);
        panel2.setBackground(Color.GRAY);

        Dflight1.addActionListener(event -> {
            uD.setFrom("SFO");
            uD.setTo("LAX");
            uD.setTime("4:00 PM");
            uD.setCost("$110");
            Login.addUserInputPanel();
        });

        Dflight2.addActionListener(event -> {
            uD.setFrom("LAX");
            uD.setTo("SFO");
            uD.setTime("10:00 PM");
            uD.setCost("$90");
            Login.addUserInputPanel();

        });

        Dflight3.addActionListener(event -> {
            uD.setFrom("OAK");
            uD.setTo("SNA");
            uD.setTime("11:00 AM");
            uD.setCost("$120");
            Login.addUserInputPanel();

        });

        Dflight4.addActionListener(event -> {
            uD.setFrom("SNA");
            uD.setTo("OAK");
            uD.setTime("2:00 PM");
            uD.setCost("$130");
            Login.addUserInputPanel();

        });
//---------------------------------------------------------------
        Iflight5.addActionListener(event -> {
            uD.setFrom("MAD");
            uD.setTo("LAX");
            uD.setTime("4:00 PM");
            uD.setCost("$340");
            Login.addUserInputPanel();

        });

        Iflight6.addActionListener(event -> {
            uD.setFrom("LAX");
            uD.setTo("MAD");
            uD.setTime("10:00 PM");
            uD.setCost("$320");
            Login.addUserInputPanel();

        });

        Iflight7.addActionListener(event -> {
            uD.setFrom("EWR");
            uD.setTo("DXB");
            uD.setTime("11:00 AM");
            uD.setCost("$120");
            Login.addUserInputPanel();

        });

        Iflight8.addActionListener(event -> {
            uD.setFrom("DXB");
            uD.setTo("EWR");
            uD.setTime("2:00 PM");
            uD.setCost("$130");
            Login.addUserInputPanel();

        });

        return panel2;

    }

}
