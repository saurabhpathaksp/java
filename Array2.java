import java.util.Scanner;


public class Array2 {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size");
    int size = sc.nextInt();
    System.out.println("Enter the Names");
    
    String Name[] = new String[size];
    
    

    for(int i=0; i<size; i++){
        Name[i]=sc.next();
    }
    for(int i=0; i<Name.length; i++){
        System.out.println(Name[i]);
    }

       
   }
}
