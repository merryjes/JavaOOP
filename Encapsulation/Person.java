package Encapsulation;
public class Person {
    private String race;
    private String name;
    private int age;
    

    //Setters
    public void setRace(String race){
        this.race = race;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >19){
            System.out.println("not an auntie hmp");

        }
        this.age = age;
    }   

    //getters
    public String getRace(){
        return "Race: " + race;
    }

    public String getName(){
        return "Name: " + name;
    }

    public  String getAge(){
        return "Age: " + age;
    }
}