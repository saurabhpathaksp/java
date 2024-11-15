public class Studarray {
    public int stud_id;
    public String name;
     Studarray (int stud_id, String name){
        this.stud_id=stud_id;
        this.name=name;

    }
    public static void main(String[] args) {
        Studarray[] arr;

    arr= new Studarray[2];
    arr[0]=new Studarray(12, "Saurabh");
    arr[1]=new Studarray(14, "Gaurav");
    for(int i=0; i<=arr.length; i++){
        System.out.println(arr[i]);
    }
    }

    
}
