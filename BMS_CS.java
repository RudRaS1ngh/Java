class Typer extends Thread{
    public void run(){
        while (true){ 
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);
            } 
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
    }
}
class Typer2 extends Thread{
    public void run(){
        while (true){ 
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
    }
}


public class BMS_CS{
    public static void main(String args[]) {
        Typer t1=new Typer();
        Typer2 t2=new Typer2();
        t1.start();
        t2.start();
    }
    
}
