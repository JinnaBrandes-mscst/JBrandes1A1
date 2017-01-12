import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JLabel GrossPayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblgrossPay = new JLabel("Gross Pay:");
		lblgrossPay.setBounds(31, 46, 140, 23);
		contentPane.add(lblgrossPay);
		
		JButton btncalcButton = new JButton("Calculate:");
		btncalcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btncalcButton_actionPerformed(arg0);
			}
		});
		btncalcButton.setBounds(10, 102, 140, 23);
		contentPane.add(btncalcButton);
		
		GrossPayLabel = new JLabel("");
		GrossPayLabel.setBounds(208, 46, 216, 23);
		contentPane.add(GrossPayLabel);
	}
	protected void do_btncalcButton_actionPerformed(ActionEvent arg0) {
		int hours = 40;
		double grossPay, payRate = 25.0;
		
		grossPay = hours * payRate;
		GrossPayLabel.setText("Your gross pay is $ " + grossPay);
	}
}
