package harshit;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
	}

}

class Frame extends JFrame implements ActionListener{
	
	JLabel name ;
	JTextField t ;
	JLabel p ;
	JTextField t2 ;
	JButton sub ;
	JTextArea tout ;
	
	public Frame(){
		
		JFrame fr = new JFrame();
	
		fr.setTitle("Login Form");
		fr.setBounds(500, 90, 600, 600);
		
		
		JLabel title = new JLabel("Login Form");
	    title.setFont(new Font("Arial", Font.PLAIN, 30));
	    title.setSize(300, 40);
	    title.setLocation(220, 30);
	    fr.add(title);
	    
	    name = new JLabel("User ID");
		name.setSize(90,250);
		name.setLocation(60, 30);
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		fr.add(name);
		
		t = new JTextField();
		t.setSize(300, 30);
		t.setLocation(150,141);
		fr.add(t);
	
		 p = new JLabel("Password");
		p.setSize(90,250);
		p.setLocation(40, 100);
		p.setFont(new Font("Arial", Font.PLAIN, 20));
		fr.add(p);
		
		 t2 = new JTextField();
		t2.setSize(300, 30);
		t2.setLocation(150,210);
		fr.add(t2);
		
		 sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(240, 270);
        sub.addActionListener(this);
        fr.add(sub);
        
         tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(400, 50);
        tout.setLocation(100, 330);
        tout.setLineWrap(true);
        tout.setEditable(false);
        fr.add(tout);
        
		fr.setLayout(null);
		fr.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == sub) {
			String uid = (String)t.getText();
			String pass = (String)t2.getText();
			if(uid.equalsIgnoreCase("HarshitBhatt14")  && pass.equalsIgnoreCase("welcome") ) {
				
				tout.setText("Welcome Harshit...!!");
                tout.setEditable(false);
			}
			else {
				tout.setText("Wrong Username and password..!!");
			}
			
			
		}
		
		
	}
}