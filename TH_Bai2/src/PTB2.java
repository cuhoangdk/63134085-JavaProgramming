import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class PTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextArea txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTB2 frame = new PTB2();
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
	public PTB2() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(10, 61, 75, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(159, 61, 69, 19);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(265, 61, 88, 19);
		contentPane.add(txtC);
		
		JLabel lblNewLabel = new JLabel("x^2+");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(90, 50, 59, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblX = new JLabel("x+");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblX.setBounds(238, 53, 29, 27);
		contentPane.add(lblX);
		
		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(350, 61, 45, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Tính Toán");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PTB2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(127, 112, 137, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Kết quả: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 188, 88, 19);
		contentPane.add(lblNewLabel_1);
		
		txtKetQua = new JTextArea();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(108, 163, 226, 90);
		contentPane.add(txtKetQua);
	}
	 private void PTB2() {
	        try {
	            double a = Double.parseDouble(txtA.getText());
	            double b = Double.parseDouble(txtB.getText());	
	            double c = Double.parseDouble(txtB.getText());		            
	            if (a==0) {
	            	if (b == 0) {
	           			if (c == 0) {
	           				txtKetQua.setText("Phương trình có vô số nghiệm");
	                        } else {
	                        	txtKetQua.setText("Phương trình vô nghiệm");
	                        }
	                    } else {
	                        double x = -c / b;
	                        txtKetQua.setText("Phương trình có 1 nghiệm:\n x = " + x);
	                    }
	            	}
	            else {
	            	double delta = b * b - 4 * a * c;

	            	if (delta > 0) {
	                    double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	                    double root2 = (-b - Math.sqrt(delta)) / (2 * a);
	                    txtKetQua.setText("Phương trình có 2 nghiệm phân biệt:\nx1 = " + root1 + "\nx2 = " + root2);
	                } else if (delta == 0) {
	                    double root = -c / (2 * b);
	                    txtKetQua.setText("Phương trình có nghiệm kép:\n x = " + root);
	                } else {
	                    double realPart = -c / (2 * b);
	                    double imaginaryPart = Math.sqrt(Math.abs(delta)) / (2 * b);
	                    txtKetQua.setText("Phương trình có 2 nghiệm ảo: \n x1 = " + realPart + " + i" + imaginaryPart + " \n x2 = " + realPart + " - i" + imaginaryPart);
	                }
	            }	            
	        } catch (NumberFormatException ex) {
	            txtKetQua.setText("Vui lòng nhập tham số hợp lệ");
	        }
	    }
}
