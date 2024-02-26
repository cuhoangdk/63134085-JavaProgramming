package Bai1;

import java.util.Scanner;

public class Vuong extends ChuNhat{
	public Vuong(float canh) {
		super(canh, canh);
	}
	public Vuong() {
		super();
	}
	
	@Override
	public void xuat() {
		System.out.println("Hình vuông");
		System.out.println("Cạnh: "+ dai);
		System.out.println("Chu vi: " + this.getChuVi() +"cm, Diện tích: "+ this.getDienTich()+" cm^2");
		System.out.println();
	}	
}
