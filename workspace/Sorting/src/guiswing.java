import javax.swing.BoxLayout;
import java.awt.LayoutManager;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guiswing implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel label2;
	private JTextField field;
	private JTextField field2;
	private JTextField field3;
	private JTextField field4;
	private JTextField field5;
	private JTextField field6;
	private JTextField field7;
	private JTextField field8;
	private JTextField field9;
	private JButton btn;
	public guiswing(){
		frame = new JFrame();
		frame.setSize(750, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		label = new JLabel();
		label.setText("Text");
		label2 = new JLabel();
		label2.setText("Text");
		
		field = new JTextField(5);
		field2 = new JTextField(5);
		field3 = new JTextField(5);
		field4 = new JTextField(5);
		field5 = new JTextField(5);
		field6 = new JTextField(5);
		field7 = new JTextField(5);
		field8 = new JTextField(5);
		field9 = new JTextField(5);
		
		btn = new JButton("BUTTON");
		btn.addActionListener(this);
		
		frame.add(panel);
		panel.add(label);
		panel.add(field);
		panel.add(field2);
		panel.add(field3);
		panel.add(field4);
		panel.add(field5);
		panel.add(field6);
		panel.add(field7);
		panel.add(field8);
		panel.add(field9);
		panel.add(btn);
		panel.add(label2);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
//		int[] numinput = {};
//		int[] numoutput = new int[numinput.length];
//		int length = numinput.length;
//		int counter = 0;
//		int i = 1;
//		int holder = 0;
//		
//		while (numinput[0]>numinput[1] || numinput[1]>numinput[2] || numinput[2]>numinput[3] || numinput[3]>numinput[4] || numinput[4]>numinput[5] || numinput[5]>numinput[6] || numinput[6]>numinput[7] || numinput[7]>numinput[8] || numinput[8]>numinput[9]) {
//			if (numinput[counter] > numinput[counter + i]) {
//				holder = numinput[counter]; //if numinput[counter] is 4 and numinput[counter+1] is 6, holder is now 4, then numinput[counter] becomes 6, then numinput[counter+1] becomes 4, so now holder is 4, numinput[counter] is 6, and numinput[counter+1] is 4
//				numinput[counter] = numinput[counter + i];
//				numinput[counter + i] = holder; // ^TLDR everything is OK
//			} else if (numinput[counter] < numinput[counter + i]) {
//				counter++; //if theyre already in the right spots dont move them
//			} else if (numinput[counter] == numinput[counter + i]) {
//				counter++; //if they are equal dont move them
//			}
//			
//			if ((counter + i) >= length){
//				counter = 0; //to try the whole thing over again to check the moved numbers
//			}else{
//				i = 1;
//			}
//		}
	}
}
