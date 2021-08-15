import java.util.*;

class pgm10_object {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,gend,addr,eid,cname,quali,sub,dept,tid,temp;
        int age,n;
        double salary;
        Teacher t[]=new Teacher[10];

        System.out.println("Enter the number of Teachers : ");
        n=sc.nextInt();
        temp=sc.nextLine();
        for(int i=0;i<n;i++){
            int m=i+1;
            System.out.println("Enter the details of Teacher:"+m);
            System.out.println();
            System.out.println("Enter the Name :");
            name=sc.nextLine();
            System.out.println("Enter the Gender :");
            gend=sc.nextLine();
            System.out.println("Enter the Address :");
            addr=sc.nextLine();
            System.out.println("Enter the Age :");
            age=sc.nextInt();
            temp=sc.nextLine();
            System.out.println("Enter the Employee ID :");
            eid=sc.nextLine();
            System.out.println("Enter the Company Name :");
            cname=sc.nextLine();
            System.out.println("Enter the Qualification :");
            quali=sc.nextLine();
            System.out.println("Enter the Salary :");
            salary=sc.nextDouble();
            temp=sc.nextLine();
            System.out.println("Enter the Subject :");
            sub=sc.nextLine();
            System.out.println("Enter the Department :");
            dept=sc.nextLine();
            System.out.println("Enter the Teacher ID :");
            tid=sc.nextLine();
            System.out.println();
            t[i]=new Teacher(name, gend, addr, age, eid, cname, quali, salary, sub, dept, tid);
        }
        for(int i=0;i<n;i++)
        {
            int m=i+1;
            System.out.println();
            System.out.println("Teacher Details"+m);
            t[i].display();
            System.out.println();
        }

        sc.close();
    }
}
