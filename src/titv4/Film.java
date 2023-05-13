/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv4;

public class Film {
    private String tenPhim;
    private Hang hangSanXuat;
    private int namSanXuat;
    private double giaVe;
    private date ngayChieu;
    
    public Film(String tenPhim, Hang hangSanXuat, int namSanXuat, double giaVe, date ngayChieu){
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }
    public String getTenPhim(){
        return this.tenPhim;
    }
    public boolean kiemGiaVe(Film hangKhac){
        return this.giaVe < hangKhac.giaVe;
    }
    
    public void tenHangPhim(){
        System.out.println("Ten cua hang phim la: "+ this.hangSanXuat.tenHangPhim());
    }
    
    public double giaVeSale(double x){
        double soTienDuocGiam = this.giaVe * (x/100);
        return this.giaVe - soTienDuocGiam;
    }
}
