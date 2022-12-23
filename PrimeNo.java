import java.util.Scanner;
class PrimeNo
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=0;
        for(int i=1;i<=a; i++)
        {
           if(a%i==0)
           {
            fact++;
           }
        }
        if(fact==2)
        {
            System.out.println(a+" is prime number");
        }
        else if(a==1)
        {
            System.out.println(a+" is neither a prime nor a composite number");
        }
        else
        {
            System.out.println(a+" is not a prime number");
        }
    }
}