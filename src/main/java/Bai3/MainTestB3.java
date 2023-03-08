package Bai3;

import java.util.Scanner;

public class MainTestB3 {
    public static void main(String[] args) {
        String message ;
        Scanner in = new Scanner(System.in);
        System.out.println("\nNhập văn bản: ");
        message = in.nextLine();

        if(message == null || message.length() == 0){
            System.out.println("Bạn chưa nhập gì");
        }else{
            VanBan vanBan = new VanBan(message);
            System.out.printf("---Số từ của văn bản: %d\n",vanBan.countTuVanBan());

            System.out.println("---Văn bản khi chuẩn hóa");
            System.out.println(vanBan.chuanHoa());

            System.out.println("---Văn bản khi viết hoa toàn bộ");
            System.out.println(vanBan.vietHoa());

            System.out.println("---Văn bản khi viết thường toàn bộ");
            System.out.println(vanBan.vietThuong());

            System.out.println("---Văn bản khi viết hoa chữ cái đầu");
            System.out.println(vanBan.vietHoaChuDauTien());
        }

    }
}
