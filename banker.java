import java.util.Scanner;
abstract class Account{
    Scanner scnr=new Scanner(System.in);
    String customer_name;
    int acc_no;
    String acc_type;
    int years;
    double balance=0;
    void customer(String name,int num,int type){
        customer_name=name;
        acc_no=num;
        if(type==1){
            acc_type="Savings Account";
            System.out.print("Enter number of years of deposit:");
            years=scnr.nextInt();
            scnr.nextLine();
        }
        else{
            acc_type="Current Account";
        }
    }
    abstract void display();
    abstract void withdraw(double wdr);
    abstract void deposit(double dep);
}

class Cur_acc extends Account{
    void min_bal(){
        if (balance<200) {
            System.out.println("Penalty imposed due to low balance.");
            balance-=50;
        }
    }
    void deposit(double dep){
        balance+=dep;
    }
    void display(){
        System.out.println("Balance:"+balance);
    }
    void withdraw(double wdr){
        if((balance-wdr)>0){
            System.out.println("Money withdrawn successfully.");
            balance=balance-wdr;
            min_bal();
            System.out.println("Available balance:"+balance);
        }
        else{
            System.out.println("Insufficient balance.");
            System.out.println("Available balance:"+balance);
        }
    }
}

class Sav_acc extends Account{
    void deposit(double dep){
        balance_tot+=dep+(balance_tot*Math.pow((1+0.3),(years)))-balance_tot;
    }
    double r=0.3;
    double ci=(balance*Math.pow((1+0.3),(years)))-balance;
    double balance_tot=balance+ci;
    void min_bal(){
        if (balance_tot<200){
            System.out.println("Penalty imposed due to low balance.");
            balance_tot-=50;
        }
    }
    void display(){
        System.out.println("Interest:"+((balance_tot*Math.pow((1+0.3),(years)))-balance_tot));
        System.out.println("Balance:"+balance_tot);
    }
    void withdraw(double wdr){
        if((balance_tot-wdr)>0){
            System.out.println("Money withdrawn successfully.");
            balance_tot=balance_tot-wdr;
            min_bal();
            System.out.println("Available balance:"+balance_tot);
        }
        else{
            System.out.println("Insufficient balance.");
            System.out.println("Available balance:"+balance_tot);
        }
    }
}

class Banker{
    public static void main(String args[]){
        String name;
        double dep,wdr;
        int num,type,choice=1,act;
        Scanner scnr=new Scanner(System.in);
        Account a;
        System.out.print("Enter customer name:");
        name=scnr.nextLine();
        System.out.print("Enter account number:");
        num=scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter type of account(1 for savings, 0 for current):");
        type=scnr.nextInt();
        scnr.nextLine();
        if(type==1){
            a=new Sav_acc();
        }
        else{
            a=new Cur_acc();
        }
        a.customer(name,num,type);
        while(choice==1){
            System.out.println("1)Display balance");
            System.out.println("2)Deposit money");
            System.out.println("3)Withdraw money");
            System.out.println("What would you like to do?(1,2,3)");
            act=scnr.nextInt();
            scnr.nextLine();
            switch(act){
                case 1:
                    a.display();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    dep=scnr.nextDouble();
                    scnr.nextLine();
                    a.deposit(dep);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    wdr=scnr.nextDouble();
                    scnr.nextLine();
                    a.withdraw(wdr);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
            System.out.print("Would you like to perform any other actions?(1 for yes,0 for no)");
            choice=scnr.nextInt();
            scnr.nextLine();
        }

    }
}