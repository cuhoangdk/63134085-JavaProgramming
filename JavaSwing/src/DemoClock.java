import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class DemoClock extends JFrame {
    private JLabel labelClock;
 
    public DemoClock() {
        setTitle("Đồng hồ trong Java Swing");
        labelClock = new JLabel();
        labelClock.setBounds(20, 20, 130, 50);
        labelClock.setForeground(Color.white); //Đặt màu chữ là trắng
        labelClock.setBackground(Color.BLACK); //Đặt màu nền là đen
        labelClock.setOpaque(true); // Đảm bảo rằng màu nền được hiển thị đúng
        Font font = new Font("Segoe UI", Font.BOLD, 30); //Tạo font chữ mới     
        labelClock.setFont(font); // Đặt font mới cho label
        add(labelClock);
        setSize(400, 200);
        setLayout(null);
        // dóng chương trình khi đóng của sổ
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        setVisible(true);
        // thiết lập lại đồng hồ sau mỗi 1 giây
        try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY); //lấy giờ theo 24 giờ
                int minute = calendar.get(Calendar.MINUTE); // lấy phút
                int second = calendar.get(Calendar.SECOND); // lấy giây

                String hourStr = (hour > 9) ? "" + hour : "0" + hour;
                String minuteStr = (minute > 9) ? "" + minute : "0" + minute;
                String secondStr = (second > 9) ? "" + second : "0" + second;
                labelClock.setText(hourStr + ":" + minuteStr + ":" + secondStr);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new DemoClock();
    }
}