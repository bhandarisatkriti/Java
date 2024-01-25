package online.banking.system;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener{
    JTextField textName,textName1,fileaddress,emailField;
    JRadioButton button,button1,button2;
    JDateChooser dateChooser;
    JButton sub,can;
    Random ran=new Random();
    long first1=(ran.nextLong()% 9000L)+1000L;
    String first=" "+Math.abs(first1);
    Signup(){
        super("Application Form");

        JLabel label1=new JLabel("APPLICATION FORM NO"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,34));
        add(label1);

        JLabel label2=new JLabel("Personal Details");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(290,90,600,30);
        add(label2);

        JLabel labelName=new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,134,30);
        add(labelName);

        textName=new JTextField();
        textName.setBounds(300,190,400,30);
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        add(textName);

        JLabel labelName1=new JLabel("Phone No:");
        labelName1.setFont(new Font("Raleway",Font.BOLD,20));
        labelName1.setBounds(100,240,134,30);
        add(labelName1);

        textName1=new JTextField();
        textName1.setBounds(300,240,400,30);
        textName1.setFont(new Font("Raleway",Font.BOLD,14));
        add(textName1);



        JLabel DOB=new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,304,134,30);
        add(DOB);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,104,104));
        dateChooser.setBounds(300,304,400,30);
        add(dateChooser);

        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,354,134,30);
        add(address);

        fileaddress=new JTextField();
        fileaddress.setBounds(300,354,400,30);
        fileaddress.setFont(new Font("Raleway",Font.BOLD,14));
        add(fileaddress);

        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,414,134,30);
        add(gender);

        button=new JRadioButton("Male");
        button.setBounds(300,414,60,30);
        button.setFont(new Font("Raleway",Font.BOLD,14));
        add(button);

        button1=new JRadioButton("Female");
        button1.setBounds(404,414,90,30);
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        add(button1);

        button2=new JRadioButton("Others");
        button2.setBounds(498,414,400,30);
        button2.setFont(new Font("Raleway",Font.BOLD,14));
        add(button2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(button);
        buttonGroup.add(button1);
        buttonGroup.add(button2);

        JLabel email=new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,484,134,30);
        add(email);

        emailField=new JTextField();
        emailField.setBounds(300,484,400,30);
        emailField.setFont(new Font("Raleway",Font.BOLD,14));
        add(emailField);



        sub=new JButton("Submit");
        sub.setBounds(284,624,100,30);
        sub.setFont(new Font("Raleway",Font.BOLD,18));
        sub.addActionListener(this);
        add(sub);

        can=new JButton("Cancel");
        can.setFont(new Font("Raleway",Font.BOLD,18));
        can.setBounds(450,624,100,30);
        can.addActionListener(this);
        add(can);

        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
     String formno=first;
        String name= textName.getText();

        String no =textName1.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String addr=fileaddress.getText();
        String gender=null;
        if(button.isSelected()){
            gender="Male";
        } else if (button1.isSelected()) {
            gender="Female";
        }else if (button2.isSelected()) {
            gender="Others";
        }

        String email=emailField.getText();

        try{
            if(textName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            }else{
                Connector c1=new Connector();
                String q="insert into signup values('"+formno+"',"+name+"','"+no+"''"+dob+"','"+addr+"','"+gender+"','"+email+"')";
                c1.statement.executeUpdate(q);
                setVisible(false);

            }

        }catch(Exception e1){
            e1.printStackTrace();
        }

    }


    public static void main(String[] args) {
      new Signup();
    }
}
