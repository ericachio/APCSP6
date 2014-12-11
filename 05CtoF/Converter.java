import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame implements ActionListener{
    private Container pane;
    private JButton b, clear;
    private JLabel l, a;
    private JTextField text, ans;
    private Container buttons;
    private Container textStuff;
    private Container checkBox;
    private JCheckBox f, c;
    
    public Converter(){
	this.setTitle("Degree Converter");
	this.setSize(600,100);
	this.setLocation(100,100);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(3,1));

	l = new JLabel("Degrees to Convert:", null, JLabel.CENTER);
	a = new JLabel("to", null, JLabel.CENTER);
	b = new JButton("CONVERT!");
	clear = new JButton("Exterminate");
	text = new JTextField(10);
	ans = new JTextField(15);
	f = new JCheckBox("Fahrenheit");
	c = new JCheckBox("Celcius");

	b.setActionCommand("convert");
	b.addActionListener(this);
	clear.setActionCommand("clear");
	clear.addActionListener(this);

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(clear);
	buttons.add(b);

	textStuff = new Container();
	textStuff.setLayout(new FlowLayout());
	textStuff.add(l);
	textStuff.add(text);
	textStuff.add(a);
	textStuff.add(ans);

	checkBox = new Container();
	checkBox.setLayout(new FlowLayout());
	checkBox.add(f);
	checkBox.add(c);

	pane.add(textStuff);
	pane.add(buttons);
	pane.add(checkBox);
	
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if(action.equals("convert")){
	    String s = text.getText();
	    int i = Integer.parseInt(s);
	    int a;
	    String n = "";
	    if (f.isSelected()){
		a = (i*(9/5))+32;
		n = Integer.toString(a);
	    }else if (c.isSelected()){
		a = ((i-32)*5)/9;
		n = Integer.toString(a);
	    }
	    ans.setText(n);
	}
	if(action.equals("clear")){
	    text.setText("");
	    ans.setText("");
	}

    }

    public static void main(String[]args){
	Converter a = new Converter();
	a.setVisible(true);
    }
}
