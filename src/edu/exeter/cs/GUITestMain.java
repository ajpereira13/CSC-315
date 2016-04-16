package edu.exeter.cs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITestMain extends JFrame implements ActionListener{

	public static void main(String[] args) {

		new GUITestMain();

	}
	
	private JFrame f;
	private JPanel p;
	private JButton b;
	private JLabel l;
	private JTextField t;
	
	public GUITestMain() {
		f = new JFrame("JFrame Test Window");
		
		p = new JPanel();
		p.setBackground(Color.BLUE);
		
		b = new JButton("Input");
		b.addActionListener(this);
		b.setActionCommand("clicked");
		
		l = new JLabel("Input your text here and the click the button to submit it.");
		
		t = new JTextField();
		p.add(t);
		t.setColumns(10);
		p.add(b);
		p.add(l);
		
		f.add(p);
		f.setVisible(true);
		f.setSize(200,120);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("clicked"))
		{
		String input = t.getText();
			System.out.print(input);
			p.remove(l);
			l = new JLabel("You successfully submitted your text.");
			p.add(l);
			//p.setBackground(Color.PINK);
			f.add(p);
			f.setVisible(true);
		}
		
	}

}
