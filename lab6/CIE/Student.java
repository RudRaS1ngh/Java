package CIE;
import java.util.Scanner;

public class Student {
    public String usn = new String(); 
    public String name = new String(); 
    public int sem;
    Scanner scnr=new Scanner(System.in);
    public void inputDetails(){
        System.out.print("Enter USN:");
        usn=scnr.nextLine();
        System.out.print("Enter Name:");
        name=scnr.nextLine();
        System.out.print("Enter Sem:");
        sem=scnr.nextInt();
        scnr.nextLine();
    }
    public void Details(){
        System.out.println("Name:"+name);
        System.out.println("Usn:"+usn);
        System.out.println("Sem:"+sem);
    }
}

