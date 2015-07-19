import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.GregorianCalendar;

import javax.swing.JTable;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;





public class Calendar {
	private DefaultTableModel m_defTblModel = null;
	private int m_realMonth = -1;
	private int m_realYear = -1;
	private int m_realDay = -1;
	private int m_currentMonth = -1;
	private int m_currentYear = -1;
	private JButton btnPrev=null;
	private JButton btnNext=null;
	JLabel lblMonth=null;
	JComboBox<String> comboBox=null;
	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar window = new Calendar();
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
	public Calendar() {
		m_defTblModel = new DefaultTableModel();
		GregorianCalendar cal = new GregorianCalendar();
		m_realDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
		m_realMonth = cal.get(GregorianCalendar.MONTH);
		m_realYear = cal.get(GregorianCalendar.YEAR);
		m_currentMonth = m_realMonth; 
		m_currentYear = m_realYear;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 776, 467);
		frame.getContentPane().add(panel);
		
		btnPrev = new JButton("Previous");
		btnPrev.setBackground(Color.YELLOW);
		btnPrev.setBounds(103, 15, 100, 23);
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (m_currentMonth == 0)
				{ 
					m_currentMonth = 11;
					m_currentYear -= 1;
				}
				else
				{ 
					m_currentMonth -= 1;
				}

				refreshCalendar(m_currentMonth, m_currentYear);

			}
		});
		
		panel.setLayout(null);
		btnPrev.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnPrev);
		
		lblMonth = new JLabel("Month");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(268, 15, 73, 23);
		panel.add(lblMonth);
		
		btnNext = new JButton("Next");
		btnNext.setBackground(Color.YELLOW);
		btnNext.setBounds(392, 15, 100, 23);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (m_currentMonth == 11)
				{ 
					m_currentMonth = 0;
					m_currentYear += 1;
				}
				else
				{ 
					m_currentMonth += 1;
				}

				refreshCalendar(m_currentMonth, m_currentYear);

			}
		});
		panel.setLayout(null);
		btnNext.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnNext);
		
		JLabel lblChangeYear = new JLabel("Year:");
		lblChangeYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangeYear.setBounds(255, 398, 100, 23);
		panel.add(lblChangeYear);
		
		comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.YELLOW);
		
		for (int i=m_realYear-100; i<=m_realYear+100; i++)
		{
			   comboBox.addItem(String.valueOf(i));
		}

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (comboBox.getSelectedItem() != null)
				{
					String b = comboBox.getSelectedItem().toString();
					m_currentYear = Integer.parseInt(b); 
					refreshCalendar(m_currentMonth, m_currentYear); 
				}

			}
		});
		
		comboBox.setBounds(416, 398, 100, 23);
		panel.add(comboBox);
	
		table_1= new JTable(m_defTblModel );
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 49, 637, 346);
		scrollPane.setViewportView(table_1);
		panel.add(scrollPane);
		
		
		
		
		
		String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; 
		
		for (int i=0; i<headers.length; i++)
		{
		   m_defTblModel.addColumn(headers[i]);
		}
		
		table_1.setColumnSelectionAllowed(true);
		table_1.setRowSelectionAllowed(true);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		
		table_1.setRowHeight(64);
		m_defTblModel.setColumnCount(7);
		m_defTblModel.setRowCount(6);

		table_1.getParent().setBackground(table_1.getBackground());
	
		
		refreshCalendar(m_realMonth, m_realYear);
	
		}
	
	
	
	public void refreshCalendar(int month, int year)
	{
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int numberOfDays= -1;  
		int startOfMonth = -1; 

		btnPrev.setEnabled(true); 
		btnNext.setEnabled(true);

	
		if ((month == 0) && (year <= m_realYear - 100))
		{
			
			btnPrev.setEnabled(false);
		}

		if ((month == 11) && (year >= m_realYear + 100))
		{
			
			btnNext.setEnabled(false);

		}
		
		lblMonth.setText(months[month]);
		comboBox.setSelectedItem(String.valueOf(year));
		
		GregorianCalendar cal = new GregorianCalendar(year, month, 1);
		numberOfDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		startOfMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);

		//Clear table
		for (int i=0; i<6; i++)
		{
			for (int j=0; j<7; j++)
			{
				m_defTblModel.setValueAt(null, i, j);
			}
		}

		for (int i=1; i<=numberOfDays; i++)
		{
			int row = new Integer((i+startOfMonth-2)/7);
			int column  =  (i+startOfMonth-2)%7;
			m_defTblModel.setValueAt(i, row, column);
		}


	}
}

		
