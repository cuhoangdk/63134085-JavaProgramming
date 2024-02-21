import java.util.*;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
                
        //Tìm vị trí của kí tự khoảng trắng đầu tiên và cuối cùng
        int firstSpaceIndex = hoTen.indexOf(' ');
        int lastSpaceIndex = hoTen.lastIndexOf(' ');
        
        // Lấy họ, tên đệm và tên từ chuỗi
        String ho = hoTen.substring(0, firstSpaceIndex).toUpperCase();
        String tenDem = hoTen.substring(firstSpaceIndex + 1, lastSpaceIndex);
        String ten = hoTen.substring(lastSpaceIndex + 1).toUpperCase();

        // Xuất kết quả
        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
        
        scanner.close();
	}

}