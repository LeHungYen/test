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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SanPhamVaDichVu_view extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SanPhamVaDichVu_view frame = new SanPhamVaDichVu_view();
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
	public SanPhamVaDichVu_view() {
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
		tabbedPane.setBounds(10, 11, 1244, 659);
		panel_1.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Danh Sách", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Trạng thái");
		lblNewLabel.setBounds(20, 11, 63, 31);
		panel_3.add(lblNewLabel);
		
		SwitchButton switchButton = new SwitchButton();
		switchButton.setBounds(20, 37, 55, 25);
		panel_3.add(switchButton);
		switchButton.setBackground(new Color(0, 153, 204));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(543, 19, 338, 51);
		panel_3.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Nh\u00F3m s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(10, 18, 318, 28);
		comboBox.setBorder(new EmptyBorder(-11, -4, -11, -1));
		panel_2.add(comboBox);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 81, 610, 51);
		panel_3.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm Theo t\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 18, 543, 29);
		panel_2_1.add(textField);
		textField.setBorder(null);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 137, 1219, 483);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Lo\u1EA1i", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(195, 19, 338, 51);
		panel_3.add(panel_2_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Sản phẩm", "Dịch vụ"}));
		comboBox_2.setBorder(new EmptyBorder(-11, -4, -11, -1));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(10, 18, 318, 28);
		panel_2_2.add(comboBox_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "S\u1EAFp x\u1EBFp", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(891, 19, 338, 51);
		panel_3.add(panel_2_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Tên A => Z", "Tên Z => A", "Giá: Thấp => Cao", "Giá: Cao => Thấp", "Ngày cập nhật: Cũ nhất", "Ngày cập nhật: Mới nhất"}));
		comboBox_3.setBorder(new EmptyBorder(-11, -4, -11, -1));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(10, 18, 318, 28);
		panel_2_3.add(comboBox_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cập Nhật Sản Phẩm - Dịch Vụ", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 198, 1207, 78);
		panel_4.add(textArea);
		
		JButton btnThm = new JButton("Làm mới");
		btnThm.setBackground(new Color(255, 204, 102));
		btnThm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm.setBounds(1077, 588, 152, 32);
		panel_4.add(btnThm);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("MÔ TẢ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(10, 167, 185, 32);
		panel_4.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Thông tin chung");
		lblNewLabel_1_3.setForeground(new Color(255, 153, 102));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 0, 371, 32);
		panel_4.add(lblNewLabel_1_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Nh\u00F3m s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_4.setBackground(Color.WHITE);
		panel_2_4.setBounds(646, 105, 583, 51);
		panel_4.add(panel_2_4);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBorder(new EmptyBorder(-11, -4, -11, -1));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(10, 18, 563, 28);
		panel_2_4.add(comboBox_4);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00EAn H\u00E0ng H\u00F3a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(10, 43, 1219, 51);
		panel_4.add(panel_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(10, 18, 543, 29);
		panel_2_1_1.add(textField_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "M\u00E3 s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(10, 105, 583, 51);
		panel_4.add(panel_2_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(10, 18, 563, 29);
		panel_2_1_2.add(textField_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "\u0110\u01A1n v\u1ECB t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 287, 1219, 290);
		panel_4.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 120, 577, 159);
		panel.add(scrollPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("Đơn vị tính đã chọn - Hoạt động");
		lblNewLabel_1.setBounds(10, 105, 225, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Gi\u00E1 tr\u1ECB quy \u0111\u1ED5i", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(262, 27, 171, 51);
		panel.add(panel_2_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(10, 18, 151, 22);
		panel_2_1_1_1_1.add(textField_4);
		
		JPanel panel_2_1_1_1_3 = new JPanel();
		panel_2_1_1_1_3.setLayout(null);
		panel_2_1_1_1_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Gi\u00E1 b\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_3.setBackground(Color.WHITE);
		panel_2_1_1_1_3.setBounds(443, 27, 171, 51);
		panel.add(panel_2_1_1_1_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(10, 18, 151, 22);
		panel_2_1_1_1_3.add(textField_6);
		
		JPanel panel_2_4_2 = new JPanel();
		panel_2_4_2.setLayout(null);
		panel_2_4_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "\u0110\u01A1n v\u1ECB c\u01A1 b\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_4_2.setBackground(Color.WHITE);
		panel_2_4_2.setBounds(10, 27, 242, 51);
		panel.add(panel_2_4_2);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setBorder(new EmptyBorder(-11, -4, -11, -1));
		comboBox_4_1.setBackground(Color.WHITE);
		comboBox_4_1.setBounds(10, 18, 222, 28);
		panel_2_4_2.add(comboBox_4_1);
		
		JButton btnNewButton = new JButton("Làm mới");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(1104, 27, 105, 51);
		panel.add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setBackground(Color.ORANGE);
		btnSa.setBounds(989, 27, 105, 51);
		panel.add(btnSa);
		
		JButton btnNewButton_1_1 = new JButton("Thêm");
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(874, 27, 105, 51);
		panel.add(btnNewButton_1_1);
		
		SwitchButton switchButton_1 = new SwitchButton();
		switchButton_1.setBackground(new Color(0, 153, 204));
		switchButton_1.setBounds(620, 53, 55, 25);
		panel.add(switchButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Trạng thái");
		lblNewLabel_2.setBounds(620, 19, 63, 31);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(632, 120, 577, 159);
		panel.add(scrollPane_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đơn vị tính đã chọn - Không hoạt động");
		lblNewLabel_1_1.setBounds(632, 105, 263, 14);
		panel.add(lblNewLabel_1_1);
		
		JButton btnSa_1 = new JButton("Sửa");
		btnSa_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSa_1.setBackground(new Color(255, 204, 102));
		btnSa_1.setBounds(915, 588, 152, 32);
		panel_4.add(btnSa_1);
		
		JButton btnThm_3 = new JButton("Thêm");
		btnThm_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm_3.setBackground(new Color(255, 204, 102));
		btnThm_3.setBounds(753, 588, 152, 32);
		panel_4.add(btnThm_3);
		
	}
}
