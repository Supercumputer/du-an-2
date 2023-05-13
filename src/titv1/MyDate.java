/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv1;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int a) {
        if (a >= 1 && a <= 31) {
            this.day = a;
        } else {
            this.day = 1;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int b) {
        this.month = b;
    }
    
    public String toString(){
        return this.day + "/" +this.month;
    }
}
