import java.util.Scanner;
class Book{
    String name;
    String author;
    int price;
    int numpages;
    Book(String name,String author,int price,int numpages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.numpages=numpages;
    }
    public String toString(){
        String name;
        String author;
        String price;
        String numpages;
        name="Book name:"+this.name+"\n";
        author="Author:"+this.author+"\n";
        price="Price:"+this.price+"\n";
        numpages="Number of pages:"+this.numpages+"\n";
        return name+author+price+numpages;
    }
}
class Book_show{
    public static void main(String args[]){
        int n;
        int i;
        int k;
        String name;
        String author;
        int price;
        int numpages;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter number of books:");
        n=scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter data:");
        Book bks[]=new Book[n];
        for(i=0;i<n;i++){
            k=i+1;
            System.out.println("");
            System.out.println("Enter name of book"+k+":");
            name=scnr.nextLine();
            System.out.println("Enter name of author:");
            author=scnr.nextLine();
            System.out.println("Enter price of book:");
            price=scnr.nextInt();
            System.out.println("Enter number of pages:");
            numpages=scnr.nextInt();
            scnr.nextLine();
            bks[i]=new Book(name,author,price,numpages);
        }
        for(i=0;i<n;i++){
            k=i+1;
            System.out.println("");
            System.out.println("Entry for book"+k+":");
            System.out.println(bks[i]);
        }
    }
}