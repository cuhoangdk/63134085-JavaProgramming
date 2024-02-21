package Bai3;
import java.util.*;
import java.util.regex.*;

public class SinhVien {
	String ten;
	String email;
	String sdt;	
	String cmnd;
	public SinhVien() {
		super();
	}
	public SinhVien(String ten, String email, String sdt, String cmnd) {
		super();
		this.ten = ten;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}
	// Kiểm tra email
		public static boolean isValidEmail(String email) {
			String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		    Pattern pattern = Pattern.compile(regex);
		    Matcher matcher = pattern.matcher(email);
		    return matcher.matches();
		}

		// Kiểm tra sdt
		public static boolean isValidPhoneNumber(String phone) {
			String regex = "^0\\d{9,10}$";
		    Pattern pattern = Pattern.compile(regex);
		    Matcher matcher = pattern.matcher(phone);
		    return matcher.matches();
		}

		// Kiểm tra so CMND
		public static boolean isValidCMND(String cmnd) {
		    String regex = "^[0-9]{9}|[0-9]{12}$";
		    Pattern pattern = Pattern.compile(regex);
		    Matcher matcher = pattern.matcher(cmnd);
		    return matcher.matches();
		}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sinh viên: ");
		ten = scanner.nextLine();
		do {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();

            if (isValidEmail(email)) {                
            } else {
                System.out.print("\nEmail không hợp lệ. ");
            }
        } while (!isValidEmail(email));
        
        
        do {
            System.out.print("Nhập số điện thoại: ");
            sdt = scanner.nextLine();

            if (isValidPhoneNumber(sdt)) {
            } else {
                System.out.print("\nSố điện thoại không hợp lệ. ");
            }
        } while (!isValidPhoneNumber(sdt));
        
        do {
            System.out.print("Nhập số CMND: ");
            cmnd = scanner.nextLine();

            if (isValidCMND(cmnd)) {
            } else {
                System.out.print("\nSố CMND không hợp lệ. Vui lòng nhập lại: ");
            }
        } while (!isValidCMND(cmnd));       
	}
	public void xuat() 
	{
		System.out.println("Tên: " + ten);
		System.out.println("Email: " + email);
		System.out.println("Số điện thoại: " + sdt);
		System.out.println("CMND: " + cmnd);
		System.out.println("");
	}
	public static void main(String[] args) {
		ArrayList<SinhVien> danhSachSV = new ArrayList<SinhVien>();		
		for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSV.add(sv);
        }		
		
		for (SinhVien sv : danhSachSV)
		{
			sv.xuat();
		}
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
}
