package Bai2;

public abstract class SinhVienPoly {
	protected String hoten, nganh;

	public SinhVienPoly(String hoten, String nganh) {
		super();
		this.hoten = hoten;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getHocLuc() {
        double diem = getDiem();

        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    
	
	public String getHoten() {
		return hoten;
	}
	
    
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	
}
