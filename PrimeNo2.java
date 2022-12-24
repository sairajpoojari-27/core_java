class PrimeNo2
{
    public static void main(String[] args) 
    {
        int count=0;
       for (int i = 9999; i >=1000; i--) 
       {
        int fact=0;
        for (int j = 1; j <=i; j++) 
        {
            if(i%j==0)
            {
                fact++;
            }   
        }
        if(fact==2)
        {
            count++;
            System.out.println(i+" is the 1st 10 heigest prime number ");
            if(count==10)
            {
                break;
            }
        }
        
       } 
    }
}