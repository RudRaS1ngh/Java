interface A{
    int a=15;
    static void show(){
        System.out.println("Value of a:"+a);
    }
}

public class Static_caller {
    public static void main(String[] args){
        A.show();
    }
    
}
