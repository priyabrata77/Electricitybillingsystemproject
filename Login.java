package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
public class Login extends JFrame {
    Login() {
        super ("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout (null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(350, 40, 100, 20);
        add (lblusername);
        
        JTextField username = new JTextField();
        username.setBounds(450, 40, 150, 20);
        add(username);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(350, 80, 100, 20);
        add (lblpassword);
        
         JTextField password = new JTextField();
        password.setBounds(450, 80, 150, 20);
        add(password);
        
        
        JLabel loggininas = new JLabel("Loggin in as");
        loggininas.setBounds(350, 120, 100, 20);
        add (loggininas);
        
        Choice logginin = new Choice();
        logginin.add("Admin");
        logginin.add("Customer");
        logginin. setBounds(450, 120, 150, 20);
        add (logginin);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/login.png"));
        Image i2 = i1.getImage() .getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        JButton login = new JButton("Login" , new ImageIcon(i2));
        login.setBounds(350, 180, 100, 20);
        add(login);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("Icon/cancel.jpg"));
        Image i4 = i3.getImage() .getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        JButton cancle = new JButton("Cancle", new ImageIcon(i4));
        cancle.setBounds(480, 180, 100, 20);
        add(cancle);
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("Icon/signup.png"));
        Image i6 = i5.getImage() .getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        JButton signup = new JButton("Signup", new ImageIcon(i6));
        signup.setBounds(420, 220, 100, 20);
        add(signup);
                
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Icon/second.jpg"));
        Image i8 = i7.getImage() .getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 250, 250);
        add(image);
        
                
        
        setSize (660, 400);
        setLocation(400,200);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Login();
    }
            
    
}
