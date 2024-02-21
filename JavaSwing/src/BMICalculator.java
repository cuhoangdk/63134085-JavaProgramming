import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {
    private JTextField heightField;
    private JTextField weightField;
    private JLabel resultLabel;
    private JLabel commentLabel;

    public BMICalculator() {
        super("BMI Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo panel chính với GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); // Giúp quản lý vị trí và kích thước của GridLayout
        gbc.insets = new Insets(5, 5, 5, 5); // Khoảng cách giữa các thành phần

        // Tạo các label và text field cho chiều cao và cân nặng
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(new JLabel("Chiều cao (met):"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 7; // Tỉ lệ 7 phần của width
        gbc.fill = GridBagConstraints.HORIZONTAL;
        heightField = new JTextField();
        mainPanel.add(heightField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        mainPanel.add(new JLabel("Cân nặng (kg):"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 7; // Tỉ lệ 7 phần của width
        gbc.fill = GridBagConstraints.HORIZONTAL;
        weightField = new JTextField();
        mainPanel.add(weightField, gbc);

        // Tạo Button để tính BMI
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1; // Thiết lập trở lại tỉ lệ mặc định
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton calculateButton = new JButton("Tính BMI");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });
        mainPanel.add(calculateButton, gbc);

        // Kết quả BMI
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        resultLabel = new JLabel();
        mainPanel.add(resultLabel, gbc);
        
        gbc.gridy = 4;
        Font font = new Font("Segoe UI", Font.PLAIN, 25);
        commentLabel = new JLabel();
        commentLabel.setFont(font);
        mainPanel.add(commentLabel, gbc);

        // Thêm panel vào frame
        add(mainPanel);

        setSize (300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculateBMI() {
        try {
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            if (height <= 0 || height>3 || weight<=0) {
            	commentLabel.setText(String.format("Bạn có phải con người không?"));  
            }
            else {
            double bmi = weight / (height * height);          
            
            if (bmi<16) {
            	commentLabel.setText(String.format("Bạn gầy độ III"));
            }
            else if (bmi<17) {
            	commentLabel.setText(String.format("Bạn gầy độ II"));
            }
            else if (bmi<18.5) {
            	commentLabel.setText(String.format("Bạn gầy độ I"));
            }
            else if (bmi<25) {
            	commentLabel.setText(String.format("Bạn Bình thường"));
            }
            else if (bmi<30) {
            	commentLabel.setText(String.format("Bạn Thừa cân"));
            }
            else if (bmi<35) {
            	commentLabel.setText(String.format("Bạn Béo phì độ I"));
            }
            else if (bmi<40) {
            	commentLabel.setText(String.format("Bạn Béo phì độ II"));
            }
            else{
            	commentLabel.setText(String.format("Bạn Béo phì độ III"));
            }
            resultLabel.setText(String.format("BMI: %.2f", bmi));    
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Số đã nhập không hợp lệ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BMICalculator();
            }
        });
    }
}