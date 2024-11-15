/*Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. 
//Provide public getter and setter methods to access and modify these variables.*/

public class BankAccount {
    private String AcNumber;
    private int Balance;
    public String getAcNumber(){
        return AcNumber;
    }
    public void setNumber(String AcNumber){
        this.AcNumber = AcNumber;
    }
    public int getBalance(){
        return Balance;
    }

    public void setBalance(int Balance){
        this.Balance= Balance;
    }

    public static void main(String[] args) {
        BankAccount bd = new BankAccount();
        bd.setNumber("vjsj12345");
        bd.setBalance(13456532);
        System.out.println("Acc Number" + bd.getAcNumber());
        System.out.println("Acc Balance" + bd.getBalance());

    }
}
