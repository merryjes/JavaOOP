package Encapsulation;
public class Main {
    
    public static void main(String[] args) {

        Person person = new Person();

        person.setRace("Asian");
        person.setName("Momo");
        person.setAge(30);
        
        System.out.println(person.getRace());
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }   
}

    