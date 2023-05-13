/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv6;

public class Animal {
    protected String name;
    protected double canNang;
    
    public Animal(String name, double canNang){
        this.name = name;
        this.canNang = canNang;
    }
    
    public void eatRice(){
        System.out.println("Cho tao an di ma");
    }
    
    public void goBed(){
        System.out.println("Di ngu thoi");
    }
    public void getName(){
        System.out.println(this.name);
    }
}
