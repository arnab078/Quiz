
package quiz.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+ name +" to Quiz & Fun");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
            "<html>"+ 
                "1. The decision of the quiz-master will be final and will not be subjected to any change." + "<br><br>" +
                "2. The participants shall not be allowed to use mobile or other electronic instruments during\n" +
"the quiz time." + "<br><br>" +
                "3. The questions shall be in the form of multiple choice, true/false statement, specific answer\n" +
"question etc." + "<br><br>" +
                "4. Audience/Supporters shall not give any hints or clues to the competitors." + "<br><br>" +
                "5. Replacement of any participant is not allowed after registration." + "<br><br>" +
                "6. Each Question carries 1 marks." +

 "<br><br>" +
                
                "7. You will get two 50-50 lifeline." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        
        back=new JButton("Back");
        back.setBounds(250,500, 100, 30);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(450,500, 100, 30);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Rules("User");
    }
}
