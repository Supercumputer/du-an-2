/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv4;

public class Main {

    public static void main(String[] args) {
        date ngayChieu = new date(10, 5, 2028);
        date ngayChieu2 = new date(15, 3, 2029);

        Hang maver = new Hang("Maver", "Mi");
        Hang dc = new Hang("dc", "hoaKi");

        Film daiNganHa = new Film("Nguoi sat iron man", maver, 2020, 65000, ngayChieu);
        Film anhHungDC = new Film("Supperman vs batman", dc, 2021, 80.000, ngayChieu2);
        
        
        System.out.printf("Gia ve cua phim %s re hon phim %s la %s\n", daiNganHa.getTenPhim(), anhHungDC.getTenPhim(), daiNganHa.kiemGiaVe(anhHungDC));
        daiNganHa.tenHangPhim();
        
        System.out.println("gia tien: "+daiNganHa.giaVeSale(10));
    }
}
