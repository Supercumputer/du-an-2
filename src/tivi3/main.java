/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tivi3;

public class main {

    public static void main(String[] args) {
        ngay date1 = new ngay(26, 5, 2003);
        ngay date2 = new ngay(20, 8, 2003);

        TacGia tacGia1 = new TacGia("Ho Van Quang", date1);
        TacGia tacGia2 = new TacGia("Ho Van anh", date2);

        Sach sach1 = new Sach("Cuu am chan kinh", 250.000, 2023, tacGia1);
        Sach sach2 = new Sach("Cuu am bach cot chao", 300.000, 2024, tacGia2);

        sach1.tenMotSach();
        sach2.tenMotSach();
        boolean check = sach1.kiemTra(sach2);
        System.out.println("Kiem tra xuat ban: " + check);
        sach1.sale(20);
    } 

}
