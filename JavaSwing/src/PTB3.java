import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PTB3 extends JFrame {
    private JTextField coefATextField, coefBTextField, coefCTextField, coefDTextField;
    private JTextArea resultTextArea;

    public PTB3() {
        setTitle("Cubic Equation Solver");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Enter coefficient a:"));
        coefATextField = new JTextField();
        panel.add(coefATextField);

        panel.add(new JLabel("Enter coefficient b:"));
        coefBTextField = new JTextField();
        panel.add(coefBTextField);

        panel.add(new JLabel("Enter coefficient c:"));
        coefCTextField = new JTextField();
        panel.add(coefCTextField);

        panel.add(new JLabel("Enter coefficient d:"));
        coefDTextField = new JTextField();
        panel.add(coefDTextField);

        JButton solveButton = new JButton("Solve");
        solveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveCubicEquation();
            }
        });
        panel.add(new JLabel());
        panel.add(solveButton);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void solveCubicEquation() {
        try {
            double a = Double.parseDouble(coefATextField.getText());
            double b = Double.parseDouble(coefBTextField.getText());
            double c = Double.parseDouble(coefCTextField.getText());
            double d = Double.parseDouble(coefDTextField.getText());
            if (a==0) {
            	if (b==0) {
            		if (c == 0) {
                        if (d == 0) {
                        	resultTextArea.setText("Phương trình có vô số nghiệm");
                        } else {
                        	resultTextArea.setText("Phương trình vô nghiệm");
                        }
                    } else {
                        double x = -d / c;
                        resultTextArea.setText("Phương trình có 1 nghiệm:\n x = " + x);
                    }
            	}
            	else {
            	double delta = c * c - 4 * b * d;

            	if (delta > 0) {
                    double root1 = (-c + Math.sqrt(delta)) / (2 * b);
                    double root2 = (-c - Math.sqrt(delta)) / (2 * b);
                    resultTextArea.setText("Phương trình có 2 nghiệm phân biệt:\nRoot 1 = " + root1 + "\nRoot 2 = " + root2);
                } else if (delta == 0) {
                    double root = -c / (2 * b);
                    resultTextArea.setText("Phương trình có nghiệm kép:\nRoot = " + root);
                } else {
                    double realPart = -c / (2 * b);
                    double imaginaryPart = Math.sqrt(Math.abs(delta)) / (2 * b);
                    resultTextArea.setText("Phương trình có 2 nghiệm ảo:\nRoot 1 = " + realPart + " + i" + imaginaryPart + "\nRoot 2 = " + realPart + " - i" + imaginaryPart);
                }
            	}
            }
            else {
            double delta = b * b * c * c - 4 * a * c * c * c - 4 * b * b * b * d - 27 * a * a * d * d + 18 * a * b * c * d;
            if (delta > 0) {
                double deltaCubed = Math.cbrt(delta + Math.sqrt(delta * delta - 4 * Math.pow(c, 3) * delta));
                double x1 = (-1 / (2 * a)) * (b + deltaCubed) + Math.cbrt(deltaCubed);
                double x2 = (-1 / (2 * a)) * (b - 0.5 * deltaCubed + (Math.sqrt(3) / 2) * Math.sqrt(4 * a * c - b * b + deltaCubed));
                double x3 = (-1 / (2 * a)) * (b - 0.5 * deltaCubed - (Math.sqrt(3) / 2) * Math.sqrt(4 * a * c - b * b + deltaCubed));

                resultTextArea.setText("Phương trình có 3 nghiệm phân biệt:\n");
                resultTextArea.append("x1 = " + x1 + "\n");
                resultTextArea.append("x2 = " + x2 + "\n");
                resultTextArea.append("x3 = " + x3 + "\n");
            } else if (delta == 0) {
                double x1 = (-1 / (2 * a)) * (b + Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));
                double x2 = (-1 / (2 * a)) * (b - Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));
                double x3 = (-1 / (2 * a)) * (b - Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));

                resultTextArea.setText("Phương trình có 3 nghiệm trong đó có 2 nghiệm kép:\n");
                resultTextArea.append("x1 = " + x1 + "\n");
                resultTextArea.append("x2 = " + x2 + "\n");
                resultTextArea.append("x3 = " + x3 + "\n");
            } else {
                double x1 = (-1 / (2 * a)) * (b + Math.cbrt(-1) * c / Math.cbrt(27 * a * a * a));
                double x2 = (-1 / (2 * a)) * (b - Math.cbrt(-1) * c / Math.cbrt(27 * a * a * a));
                double x3 = (-1 / (2 * a)) * (b - Math.cbrt(-1) * c / Math.cbrt(27 * a * a * a));

                resultTextArea.setText("Phương trình có 3 nghiệm trong đó có 2 nghiệm ảo:\n");
                resultTextArea.append("x1 = " + x1 + "\n");
                resultTextArea.append("x2 = " + x2 + " + i" + (Math.sqrt(3) / 2) * Math.cbrt(27 * a * a * a) + "\n");
                resultTextArea.append("x3 = " + x3 + " - i" + (Math.sqrt(3) / 2) * Math.cbrt(27 * a * a * a) + "\n");
            }
            }
        } catch (NumberFormatException ex) {
            resultTextArea.setText("Vui lòng nhập tham số hợp lệ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PTB3().setVisible(true);
            }
        });
    }
}
