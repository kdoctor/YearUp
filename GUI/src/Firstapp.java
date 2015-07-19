import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Firstapp {

	private JFrame frame;
	private JTextField nametext;
	private JTextField agetext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Firstapp window = new Firstapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Firstapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton whoButton = new JButton("Who am I?");
		whoButton.setFont(new Font("Algerian", Font.PLAIN, 16));
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (whoButton.getText().equals("Who am I?"))
				{
					nametext.setText("Keisha Doctor");
					agetext.setText("24");
					whoButton.setText("Clear me!");
				}
				else if(whoButton.getText().equals("Clear me!"))
				{
					nametext.setText("");
					agetext.setText("");
					whoButton.setText("Who am I?");
				}
			}
		});
		whoButton.setBounds(155, 185, 127, 23);
		frame.getContentPane().add(whoButton);
		
		JLabel lblNewLabel = new JLabel("My name is:");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 12));
		lblNewLabel.setBounds(20, 65, 96, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("I am:");
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 137, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("I am a YearUp Student!");
		lblNewLabel_2.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(125, 11, 212, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		nametext = new JTextField();
		nametext.setFont(new Font("Arial", Font.PLAIN, 11));
		nametext.setBounds(177, 66, 86, 20);
		frame.getContentPane().add(nametext);
		nametext.setColumns(10);
		
		agetext = new JTextField();
		agetext.setFont(new Font("Arial", Font.PLAIN, 16));
		agetext.setBounds(177, 132, 86, 20);
		frame.getContentPane().add(agetext);
		agetext.setColumns(10);
	}
}
