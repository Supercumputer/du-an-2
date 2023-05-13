/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv2;

public class BookInfor {
    private String tenSach;
    private double gia;
    private int namXuatBan;
    private String tenTG;
    private int day;
    private int month;
    private int year;
    
    public BookInfor(String a, double b, int c, String d, int e, int g, int s){
        this.tenSach = a;
        this.gia = b;
        this.namXuatBan = c;
        this.tenTG = d;
        this.day = e;
        this.month = g;
        this.year = s;
    }
    
    public void tenMotSach(){
        System.out.println("Cuon sach nay ten la: "+this.tenSach);
    }
    public boolean kiemTraNam(int x){
        return this.namXuatBan == x;
    }
    public double sale(double h){
        return this.gia * (h/100);
    }
}
