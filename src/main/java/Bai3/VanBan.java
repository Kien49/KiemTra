package Bai3;

public class VanBan {
    private String noiDung;

    public VanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getVanBan() {
        return noiDung;
    }

    public void setVanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    public int countTuVanBan(){
        String vanBan = noiDung;
        int count = 0;
        boolean notCounted = true;
        for (int i = 0; i < vanBan.length(); i++) {
            if (vanBan.charAt(i) != ' ') {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
    public String chuanHoa(){
        String vanBan= noiDung.trim();
        vanBan = vanBan.replaceAll("\\s+"," ");
        return vanBan;
    }

    public String vietHoa(){
        String vanBan = noiDung.toUpperCase();
        return  vanBan;
    }
    public String vietThuong(){
        String vanBan = noiDung.toLowerCase();
        return  vanBan;
    }
    public String vietHoaChuDauTien(){
        String vanBan = noiDung;
        char[] arr = vanBan.toCharArray();
        boolean space = true;
        for(int i = 0; i < arr.length; i++) {
            if(Character.isLetter(arr[i])) {
                if(space) {
                    arr[i] = Character.toUpperCase(arr[i]);
                    space = false;
                }
            }
            else {
                space = true;
            }
        }
        vanBan = String.valueOf(arr);
        return vanBan;
    }


}
