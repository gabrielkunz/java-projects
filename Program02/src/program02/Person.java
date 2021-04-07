/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program02;

public class Person {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name.toUpperCase();
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age) throws Exception{
        if (age < 0){
            throw new Exception("Age cannot be negative");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}
