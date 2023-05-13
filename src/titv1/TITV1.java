/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv1;

public class TITV1 {
    public static void main(String[] args) {
        MyDate testDay = new MyDate(10, 5, 2023);
        System.out.println("Ngay: "+ testDay.getDay());
        testDay.setDay(0);
        System.out.println("Ngay update: "+ testDay.getDay());
        System.out.println(testDay);
    }
}
