package LAB1;
import java.util.Scanner;

public class LAB1 {
	public void Bai1(){
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner1.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner1.nextDouble();
		System.out.printf("%s %f điểm", hoTen, diemTB);
	}
	public void Bai2() {
		float dai, rong, chuVi, dienTich, canhNganNhat;
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("\nNhập chiều dài: ");
		dai = scanner2.nextFloat();
		System.out.print("Nhập chiều rộng: ");
		rong = scanner2.nextFloat();
		chuVi = (dai+rong)*2;
		dienTich = dai*rong;
		canhNganNhat = Math.min(dai, rong);
		System.out.printf("Chu vi hình chữ nhật: %f\n", chuVi);
		System.out.printf("Diện tích hình chữ nhật: %f\n", dienTich);
		System.out.printf("Cạnh nhỏ nhất: %f", canhNganNhat);
	}
	public void Bai3() {
		float canh, theTich;
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("\nNhập cạnh: ");
		canh = scanner3.nextFloat();		
		theTich= (float) Math.pow(canh,3);
		System.out.printf("Thể tích hình lập phương: %f", theTich);
	}
	public void Bai4() {
		float a,b,c,delta;
		Scanner scanner4 = new Scanner(System.in);
		System.out.print("\nNhập a: ");
		a = scanner4.nextFloat();		
		System.out.print("Nhập b: ");
		b = scanner4.nextFloat();		
		System.out.print("Nhập c: ");
		c = scanner4.nextFloat();		
		delta = (float) Math.pow(b, 2) - 4*a*c;
		if (delta >= 0) {
		    System.out.printf("Căn delta: %f%n", Math.sqrt(delta));
		} else {
		    System.out.println("Delta âm.");
		}
	}
	public static void main(String[] args) {
	    LAB1 lab = new LAB1();
	    //lab.Bai1();
	    //lab.Bai2();
	    //lab.Bai3();
	    lab.Bai4();
	}
}
