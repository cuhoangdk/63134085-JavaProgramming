import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	public ManHinhTinhToan() {
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 174, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(10, 67, 174, 29);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(183, 10, 188, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(183, 71, 188, 19);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý cộng
				//Viết lệnh ở một thủ tục/hàm, rồi gọi 
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(57, 128, 48, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(136, 130, 48, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(227, 130, 48, 21);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(311, 130, 48, 21);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(10, 189, 174, 29);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(183, 193, 188, 19);
		contentPane.add(txtKetQua);
	}// hết hàm tao;
	void HamXuLyCong() {
		try {
		// lấy dữ liệu từ điều khiển
		String str_soA=txtA.getText();
		String str_soB=txtB.getText();
		//chuyển kiểu
		double a = Double.parseDouble(str_soA);		
		double b = Double.parseDouble(str_soB);	
		//tính toán
		double tong = a+b;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
		} catch (NumberFormatException ex) {
			txtKetQua.setText("Số đã nhập không hợp lệ");
        }
	}
	void HamXuLyTru() {
		try {
		// lấy dữ liệu từ điều khiển
		String str_soA=txtA.getText();
		String str_soB=txtB.getText();
		//chuyển kiểu
		double a = Double.parseDouble(str_soA);		
		double b = Double.parseDouble(str_soB);	
		//tính toán
		double hieu = a-b;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(hieu));
		} catch (NumberFormatException ex) {
			txtKetQua.setText("Số đã nhập không hợp lệ");
    	}
	}
	void HamXuLyNhan() {
		try {
		// lấy dữ liệu từ điều khiển
		String str_soA=txtA.getText();
		String str_soB=txtB.getText();
		//chuyển kiểu
		double a = Double.parseDouble(str_soA);		
		double b = Double.parseDouble(str_soB);	
		//tính toán
		double tich = a*b;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tich));
		} catch (NumberFormatException ex) {
			txtKetQua.setText("Số đã nhập không hợp lệ");
		}
	}
	void HamXuLyChia() {
		try {
		// lấy dữ liệu từ điều khiển
		String str_soA=txtA.getText();
		String str_soB=txtB.getText();
		//chuyển kiểu
		double a = Double.parseDouble(str_soA);		
		double b = Double.parseDouble(str_soB);	
		//tính toán
		double thuong = a/b;
		// Đưa ra hiển thị lên điều khiển
		if (b==0)txtKetQua.setText("Không thể chia với số 0");
		else txtKetQua.setText(String.valueOf(thuong));
		} catch (NumberFormatException ex) {
			txtKetQua.setText("Số đã nhập không hợp lệ");
		}
	}
}
