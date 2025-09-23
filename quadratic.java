import java.util.Scanner;
class quadratic{
    public static void main(String args[]){
        int a,b,c;
        double d,r1,r2;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the value of 'a' (in ax^2 + bx +c=0):");
        a=scnr.nextInt();
        if(a==0){
            System.out.println("Not a quadratic equation.");
        }
        else{
            System.out.println("Enter the value of 'b' (in ax^2 + bx +c=0):");
            b=scnr.nextInt();
            System.out.println("Enter the value of 'c' (in ax^2 + bx +c=0):");
            c=scnr.nextInt();
            d=(b*b)-4*a*c;
            if(d==0){
                System.out.println("Roots are real and equal.");
                r1=(-b)/(2*a);
                System.out.println("Value of both roots:");
                System.out.println(r1);
            }
            else if(d>0){
                System.out.println("Roots are real and unequal.");
                r1=((-b)-Math.sqrt(d))/(double)(2*a);
                r2=((-b)+Math.sqrt(d))/(double)(2*a);
                System.out.println("Value of root1:");
                System.out.println(r1);
                System.out.println("Value of root2:");
                System.out.println(r2);
            }
            else{
                System.out.println("Roots are imaginary.");
                r1=(-b)/(2*a);
                r2=Math.sqrt(-d)/2*a;
                System.out.println("Value of root1:");
                System.out.println(r1);
                System.out.println("Value of root2:");
                System.out.println(r2);
            }
        }
    }
}