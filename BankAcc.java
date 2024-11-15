public class BankAcc {
    private String owner;
    private double balance;
    private BankAcc(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public  String  getOwner(){
        return owner;

    }
    public double getBalance(){
        return  balance;
    }


    //Creating a class for Deposit 
    public double Deposit(double amt){
        if(amt>0){
            this.balance=this.balance + amt;
            return amt;
        }
        return 0;
    }
    //Creating a class for Withdrawal Method

    public double Withdrawal(double amt){
        if(amt<=this.balance){
            this.balance=this.balance - amt;
            return amt;
        }
        return 0;
    }
    public static void main(String[] args) {
        BankAcc bAcc = new BankAcc("Saurabh", 4000);
        System.out.println(bAcc.getOwner());
        bAcc.Deposit(5000);
        System.out.println(bAcc.getBalance());
    }

}

