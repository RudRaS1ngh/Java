import java.util.Scanner;
class InputScanner{
    int l,b;
}
abstract class Shape extends InputScanner{
    abstract void printArea();
}

class Rectangle extends Shape{
    void printArea(){
        Scanner scnr=new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l=scnr.nextInt();
        System.out.print("Enter width of rectangle:");
        b=scnr.nextInt();
        scnr.nextLine();
        double a=l*b;
        System.out.println("Area of rectangle:"+a);
        System.out.println("");
    }
}

class Triangle extends Shape{
    void printArea(){
        Scanner scnr=new Scanner(System.in);
        System.out.print("Enter height of triangle:");
        l=scnr.nextInt();
        System.out.print("Enter base of triangle:");
        b=scnr.nextInt();
        scnr.nextLine();
        double a=0.5*l*b;
        System.out.println("Area of triangle:"+a);
        System.out.println("");
    }
}

class Circle extends Shape{
    void printArea(){
        Scanner scnr=new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        l=scnr.nextInt();
        scnr.nextLine();
        double a=Math.PI*l*l;
        System.out.println("Area of circle:"+a);
        System.out.println("");
    }
}

class abs{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Circle c=new Circle();
        Shape s;
        s=r;
        s.printArea();
        s=t;
        s.printArea();
        s=c;
        s.printArea();
    }
}