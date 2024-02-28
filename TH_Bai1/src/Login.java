import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDangNhap;
	private JPasswordField txtMatKhau;
	public Login() {
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 132, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(10, 77, 132, 31);
		contentPane.add(lblMtKhu);
		
		txtDangNhap = new JTextField();
		txtDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDangNhap.setBounds(152, 18, 194, 23);
		contentPane.add(txtDangNhap);
		txtDangNhap.setColumns(10);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(129, 157, 151, 21);
		contentPane.add(btnDangNhap);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(152, 77, 194, 27);
		contentPane.add(txtMatKhau);
	}
	void XuLyDangNhap() {
		//Lấy tên DN và MK
		String strTen =txtDangNhap.getText();
		String strMK = txtMatKhau.getText();
		if (strTen.equals("63CNTT")&&strMK.equals("123")) {
			//hiện trang chủ
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			this.setVisible(false);
		}else {
			txtDangNhap.setText("");
			txtMatKhau.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
			
		}
	}
}
