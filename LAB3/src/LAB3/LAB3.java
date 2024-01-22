package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class LAB3 {
	void Bai1(){
		int n;
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Nhập số tự nhiên: ");
		n = scanner.nextInt();
		boolean ok = true;
		for(int i=2; i < n-1; i++){ // n là số nhập từ bàn phím
			if(n % i == 0){
				ok = false;
				break;
			}
			i++;
		}
		if (ok == true && n>=2) {
			System.out.printf("%d là số nguyên tố\n", n);
		}
		else
			System.out.printf("%d không là số nguyên tố\n", n);
	}
	void Bai2() {
		for(int i=1; i<=9;i++){
			for(int j=1; j<=10;j++){
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
			}
		}
	}
	void Bai3() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        double tong=0;
        int dem=0;
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) 
        {
            System.out.printf("Phần tử thứ %d: ", i+1);
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mảng sau khi được sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.printf("%d  ", arr[i]);
        }
        System.out.printf("\nPhần tử nhỏ nhất của mảng: %d", arr[0]);

        for (int i = 0; i < n; i++) 
        {
            if(arr[i]%3==0)
            {
            	tong+=arr[i];
            	dem++;
            }	
        }
        System.out.println("\nTrung bình cộng các phần tử chia hết cho 3: " + tong/dem);
	}
	void Bai4() {
		Scanner scanner = new Scanner(System.in);
		String sinhVien[];
		float diem[];
		int n;
		String hocLuc;
		System.out.print("Nhập vào số lượng sinh viên: ");
		n = scanner.nextInt();
        sinhVien = new String[n];
        diem = new float[n];
        for (int i = 0; i < n; i++) 
        {
        	scanner.nextLine();
            System.out.printf("Phần họ tên sinh viên thứ %d: ", i+1);
            sinhVien[i] = scanner.nextLine();
            System.out.printf("Phần điểm sinh viên thứ %d: ", i+1);
            diem[i] = scanner.nextFloat();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    float tempDiem = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempDiem;
                    String tempSinhVien = sinhVien[j];
                    sinhVien[j] = sinhVien[j + 1];
                    sinhVien[j + 1] = tempSinhVien;
                }
            }
        }
        for (int i = 0; i < n; i++)
		{
			if(diem[i]<5) hocLuc = "Yếu";
			else if(diem[i] < 6.5) hocLuc = "Trung Bình";
			else if(diem[i] < 7.5) hocLuc = "Khá";
			else if(diem[i] < 9) hocLuc = "Giỏi";
			else hocLuc = "Xuất sắc";
            System.out.println("Họ tên: " + sinhVien[i] + "\tĐiểm: " + diem[i] + "\tHọc Lực: " + hocLuc);
		}
	}
	public static void main(String[] args) {
		LAB3 lab = new LAB3();
		int choose;
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Kiểm tra số nguyên tố");
		System.out.println("2. In bảng cửu chương");
		System.out.println("3. Sắp xếp dãy số nguyên tăng dần");
		System.out.println("4. Sắp xếp danh sách sinh viên theo điểm tăng dần");
		System.out.println("Số bất kỳ: Kết thúc chương trình");
		System.out.println("+---------------------------------------------------+");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập lựa chọn của bạn: ");
		choose = scanner.nextInt();	
		switch (choose)
		{
			case 1: lab.Bai1(); break;
			case 2: lab.Bai2(); break;
			case 3: lab.Bai3(); break;
			case 4: lab.Bai4(); break;
			default: System.exit(0);
		} 
	}
}
