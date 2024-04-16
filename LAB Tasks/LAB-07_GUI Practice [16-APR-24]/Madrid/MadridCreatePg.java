import javax.swing.*;
import java.awt.*;

public class MadridCreatePg extends JFrame{
    JPanel panel;
    JLabel nameL, passL, confirmPassL, imageL, genderL, headingL, emailL, usernameL;
    JTextField nameF, emailF, usernameF;
    JPasswordField passF;
    Font defFont;
    
    public MadridCreatePg(){
        super("HALA MADRID - Create Account");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);

        defFont = new Font("Ubuntu", Font.PLAIN, 16);

        headingL = new JLabel("Create Account"); 
        headingL.setBounds(120, 80, 150, 25);
        headingL.setFont(new Font("Roboto", Font.BOLD, 18));
        panel.add(headingL);

        nameL = new JLabel("Name:");
        nameL.setBounds(100, 120, 100, 25);
        nameL.setFont(defFont);
        panel.add(nameL);

        emailL = new JLabel("Email:");
        emailL.setBounds(100, 160, 100, 25);
        emailL.setFont(defFont);
        panel.add(emailL);

        usernameL = new JLabel("Username:");
        usernameL.setBounds(68, 200, 100, 25);
        usernameL.setFont(defFont);
        panel.add(usernameL);

        passL = new JLabel("Password:");
        passL.setBounds(68, 240, 100, 25);
        passL.setFont(defFont);
        panel.add(passL);

        

        nameF = new JTextField();
        nameF.setBounds(150, 120, 130, 25);
        panel.add(nameF);
        
        emailF = new JTextField();
        emailF.setBounds(150, 160, 130, 25);
        panel.add(emailF);

        usernameF = new JTextField();
        usernameF.setBounds(150, 200, 130, 25);
        panel.add(usernameF);
        
        passF = new JPasswordField();
        passF.setBounds(150, 240, 130, 25);
        passF.setEchoChar('*');
        panel.add(passF);

        this.add(panel);
    }
}