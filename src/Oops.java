class Kunal{
    String name;
    int rollno;
    Kunal(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    void print(){
        System.out.println("Your name is: "+ name + "\nYour Roll Number is: "+ rollno);
    }
}
public class Oops {
    public static void main(String[] args) {
        Kunal kk = new Kunal("Kunal",21);

        kk.print();

    }
}
