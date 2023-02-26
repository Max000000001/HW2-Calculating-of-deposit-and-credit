package hw02;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class MainClass {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setLocation(500, 500);
		frame.setTitle("My Frame");
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0, 2));
		
		frame.add(new JLabel("тип"));
		frame.add(new JComboBox<String>(new String[] {"кредит", "вклад"}));
		frame.add(new JLabel("срок (мес.)"));
		JComboBox<Integer> period = new JComboBox<Integer>(new Integer[] {3, 6, 12});
		frame.add(period);
		frame.add(new JLabel("сумма"));
		final JTextField firstField = new JTextField("          ");
		frame.add(firstField);
		frame.add(new JLabel("годовой процент"));
		final JTextField secondField = new JTextField("          ");
		frame.add(secondField);
		final JButton calculateButton = new JButton("сумма к выплате = ");
		frame.add(calculateButton);
		final JTextField resultField = new JTextField("          ");
		frame.add(resultField);
		
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float x = Float.parseFloat(firstField.getText());
				float y = Float.parseFloat(secondField.getText());
				float z = Float.parseFloat(period.getSelectedItem().toString());
				float result = x * y / 100 * z / 12;
				resultField.setText(String.valueOf(result));
			}			
		});
	}
}
