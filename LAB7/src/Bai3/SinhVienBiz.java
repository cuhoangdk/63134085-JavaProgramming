package Bai3;
import Bai2.SinhVienPoly;
public class SinhVienBiz extends SinhVienPoly{
	protected double diemMarketing, diemSales;
	

	public SinhVienBiz(String hoten, String nganh, double diemMarketing, double diemSales) {
		super(hoten, nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	@Override
	public double getDiem() {		
		return (2*diemMarketing+diemSales)/3;
	}
	
}
