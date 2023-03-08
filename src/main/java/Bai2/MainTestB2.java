package Bai2;

import java.util.Scanner;

public class MainTestB2 {
    public static void main(String[] args) {
        NhanVien nvKt1 = new KyThuat("1","KIEU VAN KIEN", "04/09/2000","Ha Nam", "CNTT");
        System.out.print("------Thong tin cua nhan vien thu 1------\n");
        System.out.println(nvKt1);
        System.out.printf("Công việc: "+nvKt1.moTaCongViec());

        System.out.print("\n---------Nhập thông tin của nhân viên thứ 2 theo format bên trên-------");
        Scanner in = new Scanner(System.in);
        System.out.print("\nNhập mã nhân viên: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();

        NhanVien nvKt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.print("------Thong tin cua nhan vien thu 2------\n");
        System.out.println(nvKt2);
        System.out.printf("Công việc: "+nvKt2.moTaCongViec());

    }
}
