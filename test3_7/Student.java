package test3_7;

public class Student extends Parent{
    public Student(){
        super();//默认输入super();
        System.out.println("学生类无参构造方法");
    }

    public Student(int age){
        super(10);
        System.out.println("学生类有参构造方法");
    }
}
