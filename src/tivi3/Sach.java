/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tivi3;

public class Sach {
    private String tenSach;
    private double gia;
    private int namXuatBan;
    private TacGia tacGia;
    
    public Sach(String tenSach, double gia, int namXuatBan, TacGia tacGia){
        this.tenSach = tenSach;
        this.gia = gia;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }
    
    public void tenMotSach(){
        System.out.println("Ten cuon sach nay la: "+this.tenSach);
    }
    public boolean kiemTra(Sach sachKhac){
        return this.namXuatBan == sachKhac.namXuatBan;
    }
    public void sale(double x){
        System.out.println("Gia tien sale la: "+this.gia *(x/100));
    }
}
