class Kunal{
    String name;
    int rollno;
    Kunal(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
        System.out.println("Your name is: "+ name + "\nYour Roll Number is: "+ rollno);
    }
    Kunal(Kunal call){
        System.out.println("When copy constructor is called!!");

    }

}
public class Oops {
    public static void main(String[] args) {
    Kunal kk = new Kunal("Kunal",21);
    Kunal nn= new Kunal(kk);


    }
}
