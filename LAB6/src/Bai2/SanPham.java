package Bai2;
import java.util.*;

public class SanPham {
	private String tenSP;
	private double donGia;
	private String hang; 
	
	public SanPham() {
		super();
	}
	public SanPham(String tenSP, double donGia, String hang) {
		super();
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.hang = hang;
	}
	public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSP = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        donGia = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng new line

        System.out.print("Nhập hãng sản phẩm: ");
        hang = scanner.nextLine();
        
        System.out.println("");
	}

	public void xuat() 
	{
		System.out.println("Tên: " + this.tenSP);
		System.out.println("Giá: " + this.donGia);
		System.out.println("Hãng: " + this.hang);
		System.out.println("");
	}
	public static void main(String[] args) {
		ArrayList<SanPham> danhSachSp = new ArrayList<SanPham>();
        
		for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSp.add(sp);
        }		
		
		for (SanPham sp : danhSachSp)
		{
            if (sp.getHang().equalsIgnoreCase("Nokia"))
			{
				sp.xuat();
			}
		}
		
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}

	
	
}
