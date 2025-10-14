import java.util.Scanner;
class Student{
	int i;
	int subjectmarks[]=new int[10];
	int credits[]=new int[10];
	int grade[]=new int[10];
	String name;
	String usn;
	Scanner scnr=new Scanner(System.in);
	Student(String n,String u){
		name=n;
		usn=u;
	}
	void getmarks(){
		for(i=0;i<7;i++){
			int a;
			int j=i+1;
			System.out.println("Enter marks for subject "+j+":");
			a=scnr.nextInt();
			subjectmarks[i]=a;
			System.out.println("Enter credits for subject "+j+":");
			credits[i]=scnr.nextInt();
		}
		for(i=0;i<7;i++){
			grade[i]=(subjectmarks[i]/10)+1;
		}

	}
	int effectivescore(){
		int efscore=0;
		for(i=0;i<7;i++){
			efscore+=grade[i]*credits[i];
		}
		return efscore;
	}
	int totalcredits(){
		int creds=0;
		for(i=0;i<7;i++){
			creds+=credits[i];
		}
		return creds;
	}
	double sgpa(){
		double sg_pa=(double)effectivescore()/(double)totalcredits();
		return sg_pa;
	}
	
}

class Stud{
	public static void main(String args[]){
		Student s1[]=new Student[5];
		int i;
		String nm;
		String us;
        int j=0;
        int a;
		for(i=0;i<2;i++){
            Scanner scnr1=new Scanner(System.in);
            int k;
            k=i+1;
            System.out.println("");
			System.out.println("Enter name of student"+k+":");
			nm=scnr1.nextLine();
			System.out.println("Enter USN of student:");
			us=scnr1.nextLine();
			s1[i]=new Student(nm,us);
			s1[i].getmarks();
            j++;
		}
        for(i=0;i<j;i++){
            System.out.println("Name:"+s1[i].name);
			System.out.println("USN:"+s1[i].usn);
			System.out.println("Effective Score:"+s1[i].effectivescore());
			System.out.println("Total Credits:"+s1[i].totalcredits());
			System.out.println("SGPA:"+s1[i].sgpa());
            System.out.println("");
        }
	}
}
