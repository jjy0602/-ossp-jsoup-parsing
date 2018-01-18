package parssing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;

public class Guiparssing extends JFrame {

	private JPanel contentPane;
	private JTextField UrlField;
	private JTextField TagField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guiparssing frame = new Guiparssing();
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
	public Guiparssing() {
		setTitle("OSSP 20134836 \uC815\uC900\uC601");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(352, 22, 102, 37);
		contentPane.add(panel);
		
		JButton ResultButton = new JButton("Result");
		panel.add(ResultButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(352, 83, 102, 37);
		contentPane.add(panel_1);
		
		JButton SaveButton = new JButton("Save");
		panel_1.add(SaveButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(14, 22, 288, 37);
		contentPane.add(panel_2);
		
		JLabel UrlLabel = new JLabel("URL :");
		panel_2.add(UrlLabel);
		
		UrlField = new JTextField();
		panel_2.add(UrlField);
		UrlField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(14, 83, 288, 37);
		contentPane.add(panel_3);
		
		JLabel TagLabel = new JLabel("TAG : ");
		panel_3.add(TagLabel);
		
		TagField = new JTextField();
		panel_3.add(TagField);
		TagField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 152, 435, 291);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
	}
}
