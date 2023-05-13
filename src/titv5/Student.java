/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv5;

public class Student extends People{
    private String msv;
    private float diem;
    
    public Student(String hoTen, String gioiTinh, int age, String msv, float diem){
        super(hoTen, gioiTinh, age);
        this.msv= msv;
        this.diem = diem;
    }
    public void chao(){
        System.out.println("Hello moi nguoi toi day");
    }
}
