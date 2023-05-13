/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv6;

public class Dog extends Animal{
    private String dacTrung;

    public Dog(double canNang, String dacTrung) {
        super("gogo", canNang);
        this.dacTrung = dacTrung;
    }
    
    public void sua(){
        System.out.println("go go");
    }
    
   
}
