package LAB2;
import java.util.Scanner;
public class LAB2 {
	public void giaiPTB1() {
		float a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		a = scanner.nextFloat();		
		System.out.print("Nhập b: ");
		b = scanner.nextFloat();
		if(a == 0){
			if(b == 0){
				System.out.print("Phương trình có vô số nghiệm");
			}
			else{
				System.out.print("Phương trình vô nghiệm");
			}
		}
		else{
			System.out.printf("Phương trình có nghiệm là: %f", -b/a);
		}	
	}
	public void giaiPTB2() {
		float a,b,c, delta;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nNhập a: ");
		a = scanner.nextFloat();		
		System.out.print("Nhập b: ");
		b = scanner.nextFloat();		
		System.out.print("Nhập c: ");
		c = scanner.nextFloat();
		if (a==0) {
			if(b == 0){
				if(c == 0){
					System.out.println("Phương trình có vô số nghiệm");
				}
				else{
					System.out.println("Phương trình vô nghiệm");
				}
			}
			else{
				System.out.printf("Phương trình có nghiệm là: %f", -c/b);
			}
		}
		else {
			delta = (float) Math.pow(b, 2) - 4*a*c;
			if (delta <0) {
			    System.out.println("Phương trình vô nghiệm");
			}
			if (delta ==0){
			    System.out.printf("Phương trình có nghiệm kép: %f", -b/(2*a));
			}
			if (delta >0) {
			    System.out.println("Phương trình 2 nghiệm phân biệt");
			    System.out.printf("X1 = %f", (float) (-b+Math.sqrt(delta))/(2*a));
			    System.out.printf("X2 = %f", (float) (-b-Math.sqrt(delta))/(2*a));
			}
		}
	}
	public void tinhTienDien() {
		int soDien;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện: ");
		soDien= scanner.nextInt();		
		if(soDien < 50){
			System.out.printf("Số điện sử dụng: %d", soDien*1000);
		}
		else{
			System.out.printf("Số điện sử dụng: %d", 50*1000 + (soDien - 50)*1200);
		}	
	}
	public static void main(String[] args) {
	    LAB2 lab = new LAB2();
	    int choose;
	    System.out.println("+---------------------------------------------------+");
	    System.out.println("1. Giải phương trình bậc nhất");
	    System.out.println("2. Giải phương trình bậc 2");
	    System.out.println("3. Tính tiền điện");
	    System.out.println("4. Kết thúc");
	    System.out.println("+---------------------------------------------------+");
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập lựa chọn của bạn: ");
		choose = scanner.nextInt();	
		switch (choose)
		{
		case 1: lab.giaiPTB1(); break;
		case 2: lab.giaiPTB2(); break;
		case 3: lab.tinhTienDien(); break;
		case 4: System.exit(0); break;
		default: System.exit(0);
		} 
	}
}
