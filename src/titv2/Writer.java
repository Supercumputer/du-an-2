/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv2;

import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten sach: ");
        String a = sc.nextLine();
        BookInfor texn = new BookInfor(a, 56.6, 2023, "bsfs sf", 10, 3, 2033);
        texn.tenMotSach();
        System.out.println("check: "+texn.kiemTraNam(10));
        System.out.println("Sale: "+texn.sale(10));
    }
}
