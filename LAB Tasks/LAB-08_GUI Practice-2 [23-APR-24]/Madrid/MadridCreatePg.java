import javax.swing.*;
import java.awt.*;

public class MadridCreatePg extends JFrame{
    JPanel panel;
    ImageIcon UCL, FCM, bg;
    JLabel nameL, passL, confirmPassL, uclImgL, fcmImgL, genderL, headingL, emailL, usernameL, playerL, bgCreate, mainHeading, bgImgLabel;
    JTextField nameF, emailF, usernameF;
    JPasswordField passF, confirmPassF;
    JRadioButton r1, r2, r3;
    JComboBox playersCombo;
    ButtonGroup genderBrnGrp;
    JButton createBtn, exitBtn;
    Font defFont, optionFont, btnFont, inputFont;
    
    public MadridCreatePg(){
        super("HALA MADRID - Create Account");
        this.setSize(900, 630);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);

        defFont = new Font("Bahnschrift", Font.PLAIN, 16);
        inputFont = new Font("Bahnschrift", Font.PLAIN, 14);
        optionFont = new Font("Bahnschrift", Font.PLAIN, 14);
        btnFont = new Font("Bahnschrift", Font.BOLD, 17);

        mainHeading = new JLabel("J O I N   R E A L   M A D R I D   F A N   C L U B");
        mainHeading.setBounds(135, 40, 700, 30);
        mainHeading.setFont(new Font("Bahnschrift", Font.BOLD, 30));
        mainHeading.setForeground(Color.WHITE);
        panel.add(mainHeading);

        UCL = new ImageIcon("ucl-logo.png");
		uclImgL = new JLabel(UCL);
		uclImgL.setBounds(560, 100, 200, 200);
		panel.add(uclImgL);

        FCM = new ImageIcon("fcm-logo.png");
		fcmImgL = new JLabel(FCM);
		fcmImgL.setBounds(560, 325, 200, 200);
		panel.add(fcmImgL);

        headingL = new JLabel("Create Account"); 
        headingL.setBounds(182, 135, 150, 25);
        headingL.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        panel.add(headingL);

        nameL = new JLabel("Name:");
        nameL.setBounds(185, 180, 100, 25);
        nameL.setFont(defFont);
        panel.add(nameL);

        emailL = new JLabel("Email:");
        emailL.setBounds(185, 220, 100, 25);
        emailL.setFont(defFont);
        panel.add(emailL);

        usernameL = new JLabel("Username:");
        usernameL.setBounds(150, 260, 100, 25);
        usernameL.setFont(defFont);
        panel.add(usernameL);

        passL = new JLabel("Password:");
        passL.setBounds(157, 300, 100, 25);
        passL.setFont(defFont);
        panel.add(passL);

        confirmPassL = new JLabel("Confirm Password:");
        confirmPassL.setBounds(94, 340, 150, 25);
        confirmPassL.setFont(defFont);
        panel.add(confirmPassL);

        genderL = new JLabel("Gender:");
        genderL.setBounds(145, 380, 100, 25);
        genderL.setFont(defFont);
        panel.add(genderL);

        playerL = new JLabel("Favorite Player:");
        playerL.setBounds(115, 420, 150, 25);
        playerL.setFont(defFont);
        panel.add(playerL);

        nameF = new JTextField();
        nameF.setBounds(240, 180, 150, 25);
        nameF.setFont(inputFont);
        panel.add(nameF);
        
        emailF = new JTextField();
        emailF.setBounds(240, 220, 150, 25);
        emailF.setFont(inputFont);
        panel.add(emailF);

        usernameF = new JTextField();
        usernameF.setBounds(240, 260, 150, 25);
        usernameF.setFont(inputFont);
        panel.add(usernameF);
        
        passF = new JPasswordField();
        passF.setBounds(240, 300, 150, 25);
        passF.setFont(inputFont);
        passF.setEchoChar('*');
        panel.add(passF);

        confirmPassF = new JPasswordField();
        confirmPassF.setBounds(240, 340, 150, 25);
        confirmPassF.setFont(inputFont);
        confirmPassF.setEchoChar('*');
        panel.add(confirmPassF);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r3 = new JRadioButton("Other");

        r1.setBounds(210, 380, 60, 25);
        r2.setBounds(265, 380, 74, 25);
        r3.setBounds(337, 380, 62, 25);

        r1.setOpaque(false);
        r2.setOpaque(false);
        r3.setOpaque(false);

        r1.setFont(optionFont);
        r2.setFont(optionFont);
        r3.setFont(optionFont);

        genderBrnGrp = new ButtonGroup();
        genderBrnGrp.add(r1);
        genderBrnGrp.add(r2);
        genderBrnGrp.add(r3);

        panel.add(r1);
        panel.add(r2);
        panel.add(r3);

        String players[] = {"Select Player", "Andriy Lunin", "Dani Carvajal", "Antonio Rüdiger", "Nacho", "Ferland Mendy", "Eduardo Camavinga", "Toni Kroos", "Federico Valverde", "Jude Bellingham", "Rodrygo", "Vinicius Junior", "Éder Militão", "Luka Modrić", "Lucas Vázquez", "Brahim Díaz", "Joselu", "Dani Ceballos", "Fran García", "Arda Güler", "Kepa Arrizabalaga", "Fran González"};

        playersCombo = new JComboBox(players);
        playersCombo.setBounds(240, 420, 160, 25);
        playersCombo.setFont(optionFont);
        panel.add(playersCombo);

        createBtn = new JButton("Create");
        createBtn.setBounds(130, 475, 90, 30);
        createBtn.setFont(btnFont);
        createBtn.setBackground(Color.GREEN);
        panel.add(createBtn);
        
        exitBtn = new JButton("Cancel");
        exitBtn.setBounds(290, 475, 90, 30);
        exitBtn.setFont(btnFont);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setBackground(Color.RED);
        panel.add(exitBtn);

        bgCreate = new JLabel();
        bgCreate.setBounds(70, 110, 370, 420);
        bgCreate.setBackground(new Color(255, 255, 255, 220));
        bgCreate.setOpaque(true);
        panel.add(bgCreate);

        bg = new ImageIcon("Gui-bg-resized.jpg");
		bgImgLabel = new JLabel(bg);
		bgImgLabel.setBounds(0, 0, 900, 630);
		panel.add(bgImgLabel);

        this.add(panel);
    }
}