import java.util.*;

class pgm9_methodover
{
    public static void main(String[] args) 
{
        Scanner sc=new Scanner(System.in);
        overload o=new overload();
        int a;
        double x,y;
        System.out.println("Enter the length of square : ");
        a=sc.nextInt();
        o.area(a);
        System.out.println("Enter the length and breadth of rectangle : ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        o.area(x,y);
        System.out.println("Ether the radius of circle : ");
        x=sc.nextDouble();
        o.area(x);
        
        sc.close();
    }
}
