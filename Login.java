
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{ //to active the click button and it beongs to java awt events
    //in ActionListener tere is an unimplimented abstract method named as public void actionperformed(ActionEvent e)
    // if we implement anything inside the class , all the unimplimented methods or abstracts should be overwritten
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        //to add component or image on the frame
        setLayout(null);
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading=new JLabel("Quiz & Fun");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(796,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname =new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD, 20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(735,300, 120, 25);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(915,300, 120, 25);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
            
        }
    }
    public static void main(String[] args){
        new Login();  // Annonymous object
    }
}
