import java.util.Scanner;

class WrongAge extends Exception{
    public WrongAge(int i){
        if(i==1){
            System.out.println("Age cannot be negative or zero.");
        }
        else if(i==2){
            System.out.println("Father's age cannot be less than son's age.");
        }
    }  
}

class Father{
    int f_age;
    Scanner scnr=new Scanner(System.in);
    Father() throws WrongAge{
        System.out.print("Enter father's age:");
        f_age=scnr.nextInt();
        scnr.nextLine();

        if(f_age<=0){
            throw new WrongAge(1);
        }
    }
    void display(){
        System.out.println("Father's age:"+f_age);
    }
}

class Son extends Father{
    int s_age;
    Son() throws WrongAge{
        System.out.print("Enter son's age:");
        s_age=scnr.nextInt();
        scnr.nextLine();

        if(s_age<=0){
            throw new WrongAge(1);
        }
        else if(s_age>=f_age){
            throw new WrongAge(2);
        }
    }
    void display(){
        System.out.println("Son's age:"+s_age);
        super.display();
    }
}

public class age_taker {
    public static void main(String[] args) {
        try{
            Son s=new Son();
            System.out.println("Valid ages.");
            s.display();
        }
        catch(WrongAge w){
            System.out.println("Therefore, wrong age.");
        }
    }
}
