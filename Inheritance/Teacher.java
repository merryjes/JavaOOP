//Class Child - Teacher
package Abstraction; //Polymorphism

public class Teacher extends Person {
    @Override
    public void introduce() {
        System.out.println("Good day! I am a Teacher and I am preparing a lesson plan.");
    }
}