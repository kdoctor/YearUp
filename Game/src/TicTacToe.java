import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TicTacToe {

	private JFrame frame;
	
	private String m_perviousMove =null;
	private JButton[][] m_allButtons = new JButton[3][3];
	private static String s_o = "o";
	private static String s_x= "x";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Button_1 = new JButton("");
		Button_1.setBounds(1, 0, 144, 83);
		frame.getContentPane().add(Button_1);
		m_allButtons[0][0]=Button_1;

		
		JButton Button_2 = new JButton("");
		Button_2.setBounds(145, 0, 144, 83);
		frame.getContentPane().add(Button_2);
		m_allButtons[0][1]=Button_2;

		
		JButton Button_3 = new JButton("");
		Button_3.setBounds(289, 0, 144, 83);
		frame.getContentPane().add(Button_3);
		m_allButtons[0][2]=Button_3;

		
		JButton Button_4 = new JButton("");
		Button_4.setBounds(1, 91, 144, 83);
		frame.getContentPane().add(Button_4);
		m_allButtons[1][0]=Button_4;

		
		JButton Button_5 = new JButton("");
		Button_5.setBounds(145, 91, 144, 83);
		frame.getContentPane().add(Button_5);
		m_allButtons[1][1]=Button_5;

		
		JButton Button_6 = new JButton("");
		Button_6.setBounds(289, 91, 144, 83);
		frame.getContentPane().add(Button_6);
		m_allButtons[1][2]=Button_6;

		
		JButton Button_7 = new JButton("");
		Button_7.setBounds(1, 178, 144, 83);
		frame.getContentPane().add(Button_7);
		m_allButtons[2][0]=Button_7;

		
		JButton Button_8 = new JButton("");
		Button_8.setBounds(145, 178, 144, 83);
		frame.getContentPane().add(Button_8);
		m_allButtons[2][1]=Button_8;

		
		JButton Button_9 = new JButton("");
		Button_9.setBounds(289, 178, 144, 83);
		frame.getContentPane().add(Button_9);
		m_allButtons[2][2]=Button_9;

	}
	private void ChangeButtonText(JButton button)
	{
		if (m_perviousMove != null)
		{
			if (m_perviousMove.equals(s_o))
			{
				button.setText(s_x);
				button.setEnabled(false);
				m_perviousMove = s_x;
			}
			else if (m_perviousMove.equals(s_x))
			{
				button.setText(s_o);
				button.setEnabled(false);
				m_perviousMove = s_o;
			}
		}
		else
		{
			button.setText(s_x);
			button.setEnabled(false);
			m_perviousMove = s_x;
		}
	}

        void DisableAllButtons()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
				m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}
	private void AddAllEventHandlers()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					JButton currentButton = m_allButtons[i][j];
					currentButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						ChangeButtonText(currentButton);
						currentButton.setEnabled(false);
						CheckGameWinner();
					}
				});
				}
			}
		}
	}
	private void CheckGameWinner()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[i][2].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if(! empty)
				{
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						m_allButtons[i][0].setBackground(Color.green);
						m_allButtons[i][1].setBackground(Color.green);
						m_allButtons[i][2].setBackground(Color.green);
						DisableAllButtons();
					}
				}
			}
			
			for (int i = 0; i < 3; i++)
			{
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if(! empty)
				{
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						m_allButtons[0][i].setBackground(Color.blue);
						m_allButtons[1][i].setBackground(Color.blue);
						m_allButtons[2][i].setBackground(Color.blue);
						DisableAllButtons();
					}
				}
			}
			
			String one = m_allButtons[0][0].getText();
			String two = m_allButtons[1][1].getText();
			String three = m_allButtons[2][2].getText();
		
			boolean diagonalOneEmpty = one.isEmpty() || two.isEmpty() || three.isEmpty();
		
			if(! diagonalOneEmpty)
			{
				boolean diagonalOneSame = (one == two) && (two == three);
			
				if(diagonalOneSame)
				{
					m_allButtons[0][0].setBackground(Color.blue);
					m_allButtons[1][1].setBackground(Color.blue);
					m_allButtons[2][2].setBackground(Color.blue);
					DisableAllButtons();
				
				}
			}
		
			String four = m_allButtons[0][2].getText();
			String five= m_allButtons[1][1].getText();
			String six = m_allButtons[2][0].getText();
		
			boolean diagonalTwoEmpty = four.isEmpty() || five.isEmpty() || six.isEmpty();
		
			if(! diagonalTwoEmpty)
			{
			boolean diagonalTwoSame = (four == five) && (five == six);
			
				if(diagonalTwoSame)
				{
					m_allButtons[0][2].setBackground(Color.blue);
					m_allButtons[1][1].setBackground(Color.blue);
					m_allButtons[2][0].setBackground(Color.blue);
					DisableAllButtons();
				
				}
			}
		}
	}
}
