package program03;

abstract public class Person {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name.toUpperCase().trim();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age) throws Exception{
        if (age < 18 || age > 80){
            throw new Exception("Age has to be between 18 an 80.");
        }
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }

}
