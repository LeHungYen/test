package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class DonViTinh_view extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonViTinh_view frame = new DonViTinh_view();
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
	public DonViTinh_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1264, 681);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 116, 1244, 554);
		panel_1.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Danh sách đơn vị tính", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnThm = new JButton("Làm mới");
		btnThm.setBackground(new Color(255, 204, 102));
		btnThm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm.setBounds(1077, 578, 152, 42);
		panel_4.add(btnThm);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSa.setBackground(new Color(255, 204, 102));
		btnSa.setBounds(915, 578, 152, 42);
		panel_4.add(btnSa);
		
		JButton btnThm_2 = new JButton("Thêm");
		btnThm_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm_2.setBackground(new Color(255, 204, 102));
		btnThm_2.setBounds(753, 578, 152, 42);
		panel_4.add(btnThm_2);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(184, 11, 1045, 51);
		panel_4.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm Theo t\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 18, 1199, 29);
		panel_2_1.add(textField);
		textField.setBorder(null);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 93, 1219, 422);
		panel_4.add(scrollPane);
		
		SwitchButton switchButton_2 = new SwitchButton();
		switchButton_2.setBounds(10, 29, 55, 25);
		panel_4.add(switchButton_2);
		switchButton_2.setBackground(new Color(0, 153, 204));
		
		JLabel lblNewLabel = new JLabel("Trạng thái");
		lblNewLabel.setBounds(10, 3, 63, 31);
		panel_4.add(lblNewLabel);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00EAn \u0111\u01A1n v\u1ECB", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(418, 30, 475, 51);
		panel_1.add(panel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(10, 18, 455, 29);
		panel_2_1_1.add(textField_2);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "M\u00E3 \u0111\u01A1n v\u1ECB", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(10, 30, 398, 51);
		panel_1.add(panel_2_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(10, 18, 378, 29);
		panel_2_1_1_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Trạng thái");
		lblNewLabel_1.setBounds(972, 22, 63, 31);
		panel_1.add(lblNewLabel_1);
		
		SwitchButton switchButton_2_1 = new SwitchButton();
		switchButton_2_1.setBackground(new Color(0, 153, 204));
		switchButton_2_1.setBounds(972, 56, 55, 25);
		panel_1.add(switchButton_2_1);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(1165, 82, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnSa_1 = new JButton("Sửa");
		btnSa_1.setBackground(Color.ORANGE);
		btnSa_1.setBounds(1165, 56, 89, 23);
		panel_1.add(btnSa_1);
		
		JButton btnThm_1 = new JButton("Thêm");
		btnThm_1.setBackground(Color.ORANGE);
		btnThm_1.setBounds(1165, 30, 89, 23);
		panel_1.add(btnThm_1);
		
	}
}
