//Main
package Inheritance; //Polymorphism

public class Main {
    public static void main(String[] args) {
        Person myStudent = new Student();
        Person myTeacher = new Teacher();

        myStudent.introduce();
        myTeacher.introduce();
    }
}