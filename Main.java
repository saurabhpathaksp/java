class Emp {
    String name;
    double salary;
    int age;
    public void work(){
        System.out.println("I can Work Easily");
    }

}

class Analyst extends Emp{
    public void display(){
        System.out.println("My name is:" + name);
    }
}
public class Main {   
public static void main(String args[]){
    Analyst sau = new Analyst();
    sau.name = "Saurabh pathak";
    sau.display();

}
}