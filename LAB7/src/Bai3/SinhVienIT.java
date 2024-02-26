package Bai3;
import Bai2.SinhVienPoly;
public class SinhVienIT extends SinhVienPoly{
	protected double diemJava, diemHtml, diemCss;

	public SinhVienIT(String hoten, String nganh, double diemJava, double diemHtml, double diemCss) {
		super(hoten, nganh);
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
	}

	@Override
	public double getDiem() {		
		return (2*diemJava+diemHtml+diemCss)/4;
	}	
}
