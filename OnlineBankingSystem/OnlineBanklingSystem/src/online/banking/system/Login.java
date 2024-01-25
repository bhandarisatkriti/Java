
package online.banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
  JLabel label1,label2,label3; //Globally declared
  JTextField textField;
  JPasswordField Password;
  JButton button1,button2,button3;
//Constructor
  Login(){
    super("Online Banking System");

    label2=new JLabel("WELCOME TO SBANK");
    label2.setBounds(340,20,450,40);
    label2.setFont(new Font("AvantGarde",Font.BOLD,34));
    add(label2);


    label1=new JLabel ("Phone No:");
    label1.setFont(new Font("Ralway",Font.BOLD,18));
    label1.setBounds(340,140,345,40);
    add(label1);
    textField=new JTextField(15);
    textField.setBounds(440,140,345,40);
    textField.setFont(new Font("Ariel",Font.BOLD,14));
    add(textField);

    label3=new JLabel("Password:");
    label3.setFont(new Font("Ralway",Font.BOLD,18));
    label3.setBounds(340,220,345,40);
    add(label3);
    Password=new JPasswordField(15);
    Password.setBounds(440,220,345,40);
    Password.setFont(new Font("Ariel",Font.BOLD,14));
    add(Password);

    button1=new JButton("Sign in");
    button1.setFont(new Font("Ariel",Font.BOLD,14));
    button1.setBounds(400,320,100,30);
    button1.addActionListener(this);
    add(button1);

    button2=new JButton("Clear");
    button2.setFont(new Font("Ariel",Font.BOLD,14));
    button2.setBounds(540,320,100,30);
    button2.addActionListener(this);
    add(button2);

    button3=new JButton("Sign up");
    button3.setFont(new Font("Ariel",Font.BOLD,14));
    button3.setBounds(414,374,200,30);
    button3.addActionListener(this);
    add(button3);


    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/backbg.png"));
    Image i2=i1.getImage().getScaledInstance(840,480, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,840,480);

    add(image);



    setLayout(null);
    setSize(840,480);
    setLocation(400,200);
    setVisible(true);

    }

  @Override
  public void actionPerformed(ActionEvent e) {
    try{
      if(e.getSource()==button1) {
      }
        else if (e.getSource()==button2){
        textField.setText("");
          Password.setText("");
      }else if(e.getSource()==button3){

      }

    }catch(Exception E){
      E.printStackTrace();
    }

  }

  public static void main(String[] args) {
        new Login();
    }

}


