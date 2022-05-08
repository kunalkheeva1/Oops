class Student{
    String name;
    int age;
    public void name(String name){
        System.out.println(name);
    }
    public void age(){
        System.out.println(age);
    }
    public void name(String name, int age){
        System.out.println(age + " "+ name);
    }
}

public class Oops {
    public static void main(String[] args) {
    Student kk = new Student();
    kk.name("Kunal", 21);

    }
}