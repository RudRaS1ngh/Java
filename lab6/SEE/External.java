package SEE;

import CIE.Internals;
import java.util.Scanner;

public class External extends Internals{
    int i=0;
    public int marks[]=new int[5];
    public int finalMarks[]=new int[5];
    public void SEEmarks(){
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter SEE marks:");
        for(i=0;i<5;i++){
            System.out.print("Enter marks for subject "+(i+1)+":");
            marks[i]=scnr.nextInt();
            scnr.nextLine();
        }
    }
    public void Final_marks(External in){
        System.out.println("Final marks:");
        for(i=0;i<5;i++){
            finalMarks[i]=marks[i]+in.marksin[i];
        }
        for(i=0;i<5;i++){
            System.out.println("Marks for subject"+(i+1)+":"+finalMarks[i]);
        }
    }
}