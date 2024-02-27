import java.util.Scanner;

public class XPoly {
	//Bài 1
	 public static final double sum(double... x) {
	        double total = 0.0;
	        // Tính tổng các tham số truyền vào
	        for (double value : x) {
	            total += value;
	        }
	        return total;
	    }
	//Bài 2

	 public static final double min(double... x) 
	 {
	        if (x.length == 0) {
	            throw new IllegalArgumentException("Phải có ít nhất một tham số.");
	        }
	        double min = x[0];
	        // Tìm số nhỏ nhất
	        for (double value : x) {
	            if (value < min) {
	                min = value;
	            }
	        }
	        return min;
	  }
	 
	  public static final double max(double... x) 
	  {
	        if (x.length == 0) {
	            throw new IllegalArgumentException("Phải có ít nhất một tham số.");
	        }
	        double max = x[0];
	        // Tìm số lớn nhất
	        for (double value : x) {
	            if (value > max) {
	                max = value;
	            }
	        }
	        return max;
	  }
	  
	  //Bài 3
	  public static String toUpperFirstChar(String s) {
	        // Tách chuỗi thành mảng các từ
	        String[] words = s.split(" ");
	        // Duyệt và chuyển đổi ký tự đầu tiên của mỗi từ sang ký tự hoa
	        for (int i = 0; i < words.length; i++) {
	            char firstChar = words[i].charAt(0);
	            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
	            words[i] = upperFirstChar + words[i].substring(1);
	        }
	        // Nối các từ lại thành chuỗi
	        return String.join(" ", words);
	  }
	 // Bài 4 
	 public static void menu()
	 {
	        System.out.println("\t========================================");
			System.out.println("\t1. Nhập vào dãy số");
			System.out.println("\t2. Tính tổng dãy số");
			System.out.println("\t3. Tìm số lớn nhất trong dãy số");
			System.out.println("\t4. Tìm nhỏ nhất trong dãy số");
			System.out.println("\t5. Viết hoa chữ cái đầu của một chuỗi chữ cái");
			System.out.println("\t6. Kết thúc");
	        System.out.println("\t========================================");
	        System.out.print("\tChọn chức năng: ");
	 }
	  
	// main
	  public static void main(String[] args)
	  {
		  	double[] a = {};
		  	int n;		  	
		  	Scanner scanner = new Scanner(System.in);
	        while (true) {
	            menu();
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng mới sau khi nhập lựa chọn

	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập số phần tử của mảng: ");
	        		  	n = scanner.nextInt();
	    	            a = new double[n];
	        		  	for (int i = 0; i<n; i++)
	        		  	{
		                    System.out.print("a[" +i+"] = ");
		                    a[i] = scanner.nextDouble();
	        		  	}
	                	break;
	                case 2:
	        	        System.out.println("Tổng các số là: " + sum(a));
	                    break;
	                case 3:
	        	        System.out.println("Min: " + min(a));
	                    break;
	                case 4:
	        	        System.out.println("Max: " + max(a));
	                    break;
	                case 5:
	                    System.out.println("Nhập vào một chuỗi: ");
	                    String inputString = scanner.nextLine();
	        	        System.out.println("Chuỗi sau khi chuyển đổi: " + toUpperFirstChar(inputString));
	                    break;
	                case 6:
	                    System.out.println("Kết thúc chương trình.");
	        	        scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	        }		  	
	  }
}