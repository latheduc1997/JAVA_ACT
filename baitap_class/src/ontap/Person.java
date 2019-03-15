/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

/**
 *
 * @author Admin
 */
public class Person {
    private String ten;
    private int age;
    private double height;
    private double weight;
////ham tao
    public Person() {
    }

    public Person(String ten, int age, double height, double weight) {
        this.ten = ten;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
