class pgm3_oddeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        if(n % 2 == 0)
        
            System.out.println("The given number "+n+" is Even ");
        
        else
            System.out.println("The given number "+n+" is Odd ");
	    
    }
}
