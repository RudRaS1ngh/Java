package CIE;

import java.util.Scanner;

public class Internals extends Student{
    public int marksin[] = new int[5];

    public void CIEmarks(){
        Scanner scnr=new Scanner(System.in);
        int i;
        System.out.println("Enter CIE marks:");
        for(i=0;i<5;i++){
            System.out.print("Enter marks for subject "+(i+1)+":");
            marksin[i]=scnr.nextInt();
            scnr.nextLine();
        }
    }

}
