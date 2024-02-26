package Bai4;
import Bai2.SinhVienPoly;
import Bai3.SinhVienBiz;
import Bai3.SinhVienIT;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<SinhVienPoly> danhSachSv = new ArrayList<SinhVienPoly>();
		Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau khi nhập lựa chọn

            switch (choice) {
                case 1:
            		nhap(danhSachSv, scanner);
                    break;
                case 2:
                    xuat(danhSachSv);
                    break;
                case 3:
            		SVGioi(danhSachSv);
                    break;
                case 4:
                    SapXep(danhSachSv);		
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
	}

	public static void menu()
	{
        System.out.println("\t========================================");
		System.out.println("\t1. Nhập danh sách sinh viên");
		System.out.println("\t2. Xuất thông tin danh sách sinh viên");
		System.out.println("\t3. Xuất danh sách sinh viên có học lực giỏi");
		System.out.println("\t4. Sắp xếp danh sách sinh viên theo điểm");
		System.out.println("\t5. Kết thúc ");
        System.out.println("\t========================================");
        System.out.print("\tChọn chức năng: ");

	}
	
	public static void nhap(ArrayList<SinhVienPoly> danhSachSv, Scanner scanner)
	{
		boolean flag = true;
		while (true) {
			String check = "Y";
			if (flag == false)
			{
            System.out.print("Y: nhập tiếp, N:dừng lại.");
            check = scanner.nextLine();
			}
			flag = false;
            if (check.equalsIgnoreCase("N")) break;
            System.out.print("Ngành: 1.IT      2.BIZ\nLựa chọn: ");
            int nganh;
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Vui lòng nhập một số nguyên.");
                    System.out.print("Nhập 1 hoặc 2: ");
                    scanner.nextLine();                }

                nganh = scanner.nextInt();
                scanner.nextLine();
                if (nganh != 1 && nganh != 2) {
                    System.out.println("Số nhập không hợp lệ. Vui lòng nhập lại.");
                }

            } while (nganh != 1 && nganh != 2);

            if(nganh == 1)
            {
                System.out.print("Họ và tên: ");
            	String hoTen = scanner.nextLine();
                System.out.print("Điểm Java: ");
                double diemJava = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Điểm Html: ");
                double diemHtml = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Điểm Css: ");                
                double diemCss = scanner.nextDouble();
                scanner.nextLine();
                SinhVienPoly sv1 = new SinhVienIT(hoTen, "IT", diemJava,diemHtml,diemCss);
        		try {
					danhSachSv.add(sv1);
				} catch (Exception e) {					
					e.printStackTrace();
				}
            }
            if(nganh == 2)
            {
                System.out.print("Họ và tên: ");
            	String hoTen = scanner.nextLine();
                System.out.print("Điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Điểm Sales: ");
                double diemSales = scanner.nextDouble();
                scanner.nextLine();
                SinhVienPoly sv1 = new SinhVienBiz(hoTen, "BIZ", diemMarketing,diemSales);
        		try {
					danhSachSv.add(sv1);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }

    	}
        System.out.println("Nhập danh sách thành công.");
	}
	
	public static void xuat(ArrayList<SinhVienPoly> danhSachSv)
	{
		for (SinhVienPoly sv : danhSachSv)
		{
		System.out.print("Họ tên: " + sv.getHoten() + "    Ngành: " + sv.getNganh() + "    Điểm: " + sv.getDiem()  +"    Học lực: " +sv.getHocLuc() + "\n");
		}
	}
	public static void SVGioi(ArrayList<SinhVienPoly> danhSachSv)
	{
		for (SinhVienPoly sv : danhSachSv)
		{
			if (sv.getHocLuc().equalsIgnoreCase("Giỏi"))
			{
				System.out.print("Họ tên: " + sv.getHoten() + "    Ngành: " + sv.getNganh() + "    Điểm: " + sv.getDiem()  +"    Học lực: " +sv.getHocLuc() + "\n");
			}
		}
	}
	
	public static void SapXep(ArrayList<SinhVienPoly> danhSachSv) 
	{
        Collections.sort(danhSachSv, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });
        xuat(danhSachSv);
	}
	

}