public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Milagros", 1);

        System.out.println("Name: " + myCat.name);
        System.out.println("Age: " + myCat.age);

        myCat.speak();
        myCat.eat();
    }
}