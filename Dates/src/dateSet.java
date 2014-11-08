import java.awt.Color;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JComboBox;


public class dateSet {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dateSet window = new dateSet();
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
	public dateSet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] months = { "January", "February", "March", "April", "May", "June", "July"
				, "August", "September", "October", "November", "December"};
		Integer[] days = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
		Integer[] years = { 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014 };
		
	    Calendar date = Calendar.getInstance();
	    int year = date.get(Calendar.YEAR);
	    int month = date.get(Calendar.MONTH);
	    //subtract one because these are index values
	    int day = date.get(Calendar.DAY_OF_MONTH) - 1;

		JComboBox comboBox = new JComboBox(months);
		comboBox.setBounds(35, 59, 96, 20);
		frame.getContentPane().add(comboBox);
		comboBox.setSelectedIndex(month);
		
		JComboBox comboBox_1 = new JComboBox(days);
		comboBox_1.setBounds(35, 104, 96, 20);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.setSelectedIndex(day);
		
		JComboBox comboBox_3 = new JComboBox(years);
		comboBox_3.setBounds(35, 162, 96, 20);
		frame.getContentPane().add(comboBox_3);
		comboBox_3.setSelectedItem(year);
		

	} 
			
		
	
	}

