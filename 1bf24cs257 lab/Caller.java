import java.lang.*;
class A{
    private int p1,p2;
    protected float pf1,pf2;
    public int pi1,pi2;
    A(int a,int b){
        p1=a;
        p2=b;
    }
    A(float m,float n){
        pf1=m;
        pf2=n;
    }
    A(int u,int v,int w){
        pi1=u;
        pi2=v;
    }
    void pri_print(){
        System.out.println("Value of private int 1:"+p1);
        System.out.println("Value of private int 2:"+p2);
    }
    A(){
        System.out.println("In A");
    }
    void display(){
        System.out.println("In class A");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("In B");
    }
    B(float m,float n){
        super(m,n);
    }
    B(int x,int y,int z){
        super(x,y,z);
    }
    void display(){
        System.out.println("In class B");
    }
}
class C extends B{
    C(float m,float n){
        super(m,n);
    }
    void display(){
        super.display();
        System.out.println("In class C");
    }
    void show_float(){
        System.out.println("Value of protected float 1:"+pf1);
        System.out.println("Value of protected float 2:"+pf2);
    }
}
class D extends B{
    int pi1;
    int pi2;
    D(int m,int n,int nr){
        super(m,n,nr);
        this.pi1=m+10;
        this.pi2=n+10;
    }
    void display(){
        System.out.println("In class D");
    }
    void show_public(){
        System.out.println("Value of public int 1:"+super.pi1);
        System.out.println("Value of pi1 redefined in class D:"+this.pi1);
        System.out.println("Value of public int 2:"+super.pi2);
        System.out.println("Value of pi2 redefined in class D:"+this.pi2);
    }
}
class Caller{
    public static void main(String[] args) {
        A a1=new A();
        a1.display();
        B b1=new B();
        b1.display();
        C c2=new C(3,4);
        c2.display();
        c2.show_float();
        D d1=new D(3,4,5);
        d1.display();
        d1.show_public();
    }
}
