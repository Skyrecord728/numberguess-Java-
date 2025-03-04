package Dog;

public class Dog{
    String breed;
    int size;
    String color;
    int age;
    void eat(){
        System.out.println("The dog is eating");
    }
    void run(){
        System.out.println("The dog is running");
    }
    void sleep(){
        System.out.println("The dog is sleeping");
    }
}
class Main{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.run();
        myDog.size = 30;
        myDog.color = "brown";
        myDog.age = 5;
    }
}