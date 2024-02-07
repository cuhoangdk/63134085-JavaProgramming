import java.util.*;
public class SanPham {
	String tenSp;
	double donGia;
	double giamGia;
	public SanPham() {
		super();
	}
	public SanPham(String tenSp, double donGia){
		this(tenSp, donGia, 0);
	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	double getThueNhapKhau(){
		return donGia*0.1;
	}
	void xuat() {
		System.out.println("Tên Sản Phẩm: "+tenSp);
		System.out.println("Đơn giá: "+donGia);
		System.out.println("Giảm giá: "+giamGia);
		System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
	}
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();

        scanner.nextLine();
        scanner.close();
	}
	public static void main(String[] args) {
        // Sử dụng lớp SanPham
        SanPham sp1 = new SanPham("Lipovitan", 10, 1);
        sp1.xuat();

        // Nhập thông tin từ người dùng
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
        
        // Không nhập giảm giá
        SanPham sp3 = new SanPham("MSI", 1000);
        sp3.xuat();

	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
}
