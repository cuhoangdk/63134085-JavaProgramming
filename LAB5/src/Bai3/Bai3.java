package Bai3;
import java.util.*;
public class Bai3 {	
	static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
    static void menu() {
        System.out.println("===========================================");
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Kết thúc");
        System.out.println("===========================================");

        System.out.print("Chọn chức năng: ");
    }

    static void nhapDanhSachSanPham(Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập tên sản phẩm thứ %d: ",i+1);
            String tenSP = scanner.nextLine();
            System.out.print("Nhập đơn giá của sản phẩm"+tenSP+": ");
            double donGia = scanner.nextDouble();
            scanner.nextLine(); 

            SanPham sanPham = new SanPham(tenSP, donGia);
            danhSachSanPham.add(sanPham);
        }
        System.out.println("Nhập danh sách sản phẩm thành công.");
    }

    static void sapXepGiamDanTheoGia() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        };

        Collections.sort(danhSachSanPham, comp);

        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println("Tên: " + sanPham.getTenSP() + ", Đơn giá: " + sanPham.getDonGia());
        }
    }

    static void xoaSanPhamTheoTen(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenSanPhamCanXoa = scanner.nextLine();
        boolean found = false;

        Iterator<SanPham> iterator = danhSachSanPham.iterator();
        while (iterator.hasNext()) {
            SanPham sanPham = iterator.next();
            if (sanPham.getTenSP().equalsIgnoreCase(tenSanPhamCanXoa)) {
                iterator.remove();
                found = true;
                System.out.println("Đã xóa sản phẩm thành công.");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm cần xóa trong danh sách.");
        }
    }

    static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        double tongGia = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tongGia += sanPham.getDonGia();
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    nhapDanhSachSanPham(scanner);
                    break;
                case 2:
                    sapXepGiamDanTheoGia();
                    break;
                case 3:
                    xoaSanPhamTheoTen(scanner);
                    break;
                case 4:
                    xuatGiaTrungBinh();
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
}

