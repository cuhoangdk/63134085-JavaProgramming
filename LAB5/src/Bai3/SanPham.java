package Bai3;
public class SanPham {
	private String tenSP;
	private double donGia;
	
	public SanPham(String tenSP, double donGia) {
		super();
		this.tenSP = tenSP;
		this.donGia = donGia;
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
	
}
