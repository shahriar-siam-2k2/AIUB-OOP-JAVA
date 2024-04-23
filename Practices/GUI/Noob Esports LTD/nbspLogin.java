import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class nbspLogin extends JFrame {
    JPanel panel;
    JLabel nameL, passL, imageL, headingL, panelHeadingL, genderL, roleL, bgLogin, bgGender, bgRole;
    JTextField nameF;
    JPasswordField passF;
    JRadioButton r1, r2, r3;
    ButtonGroup radioGrp1;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JComboBox combo;
    JButton loginBtn, exitBtn;
    ImageIcon img;
    Font defFont, radioChkFont, btnFont;
    Color LoginPanCol, GenderPanCol, RolePanCol;

    public nbspLogin(){
        super("Noob Esports LTD. - Login");
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = new ImageIcon("BG-IMG.jpg").getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);

        defFont = new Font("Ubuntu", Font.PLAIN, 18);
        radioChkFont = new Font("Ubuntu", Font.PLAIN, 15);
        btnFont = new Font("Rooto", Font.BOLD, 18);

        LoginPanCol = new Color(255, 255, 255, 220);
        GenderPanCol = new Color(255, 182, 8, 100);
        RolePanCol = new Color(255, 107, 9, 100);

        headingL = new JLabel("N O O B   E S P O R T S   L T D.");
        headingL.setBounds(250, 130, 1200, 50);
        headingL.setFont(new Font("Roboto", Font.BOLD, 50));
        headingL.setForeground(Color.WHITE);
        panel.add(headingL);      

        panelHeadingL = new JLabel("LOGIN");
        panelHeadingL.setBounds(565, 260, 270, 25);
        panelHeadingL.setFont(new Font("Roboto", Font.BOLD, 25));
        panel.add(panelHeadingL);

        nameL = new JLabel("Username:");
        nameL.setBounds(490, 310, 100, 25);
        nameL.setFont(defFont);
        panel.add(nameL);

        nameF = new JTextField();
        nameF.setBounds(580, 310, 130, 28);
        nameF.setFont(defFont);
        panel.add(nameF);

        passL = new JLabel("Password:");
        passL.setBounds(490, 350, 100, 25);
        passL.setFont(defFont);
        panel.add(passL);

        passF = new JPasswordField();
        passF.setBounds(580, 350, 130, 28);
        passF.setFont(defFont);
        passF.setEchoChar('*');
        panel.add(passF);

        genderL = new JLabel("Gender");
        genderL.setBounds(473, 400, 100, 25);
        genderL.setFont(defFont);
        panel.add(genderL);

        r1 = new JRadioButton("Male");
        r1.setBounds(467, 425, 100, 25);
        r1.setFont(radioChkFont);
        r1.setOpaque(false);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(467, 455, 100, 25);
        r2.setFont(radioChkFont);
        r2.setOpaque(false);
        panel.add(r2);

        r3 = new JRadioButton("Other");
        r3.setBounds(467, 485, 100, 25);
        r3.setFont(radioChkFont);
        r3.setOpaque(false);
        panel.add(r3);

        radioGrp1 = new ButtonGroup();
        radioGrp1.add(r1);
        radioGrp1.add(r2);
        radioGrp1.add(r3);

        roleL = new JLabel("Role");
        roleL.setBounds(625, 400, 100, 25);
        roleL.setFont(defFont);
        panel.add(roleL);

        c1 = new JCheckBox("Sniper");
        c1.setBounds(550, 425, 100, 25);
        c1.setFont(radioChkFont);
        c1.setOpaque(false);
        panel.add(c1);

        c2 = new JCheckBox("Camper");
        c2.setBounds(550, 455, 100, 25);
        c2.setFont(radioChkFont);
        c2.setOpaque(false);
        panel.add(c2);

        c3 = new JCheckBox("Assaulter");
        c3.setBounds(550, 485, 100, 25);
        c3.setFont(radioChkFont);
        c3.setOpaque(false);
        panel.add(c3);

        c4 = new JCheckBox("Commander");
        c4.setBounds(635, 425, 150, 25);
        c4.setFont(radioChkFont);
        c4.setOpaque(false);
        panel.add(c4);

        c5 = new JCheckBox("Healer");
        c5.setBounds(635, 455, 100, 25);
        c5.setFont(radioChkFont);
        c5.setOpaque(false);
        panel.add(c5);

        c6 = new JCheckBox("Fragger");
        c6.setBounds(635, 485, 100, 25);
        c6.setFont(radioChkFont);
        c6.setOpaque(false);
        panel.add(c6);

        String comboItems[] = {"Choose Character", "Victor", "Sara", "Carlo", "Andy", "Anna"};
        combo = new JComboBox(comboItems);
        combo.setBounds(530, 540, 150, 25);
        combo.setFont(radioChkFont);
        panel.add(combo);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(490, 590, 90, 30);
        loginBtn.setBackground(Color.GREEN);
        loginBtn.setFont(btnFont);
        panel.add(loginBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(630, 590, 90, 30);
        exitBtn.setBackground(Color.RED);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setFont(btnFont);
        panel.add(exitBtn);

        bgGender = new JLabel();
        bgGender.setBounds(465, 398, 78, 120);
        bgGender.setBackground(GenderPanCol);
        bgGender.setOpaque(true);
        panel.add(bgGender);

        bgRole = new JLabel();
        bgRole.setBounds(548, 398, 197, 120);
        bgRole.setBackground(RolePanCol);
        bgRole.setOpaque(true);
        panel.add(bgRole);

        bgLogin = new JLabel();
        bgLogin.setBounds(450, 240, 310, 400);
        bgLogin.setBackground(LoginPanCol);
        bgLogin.setOpaque(true);
        panel.add(bgLogin);

        this.add(panel);
    }
}