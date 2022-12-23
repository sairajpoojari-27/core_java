class PrimeNo1
{
    public static void main(String[] args) 
    {
        int count=0;
        int sl=1;
        for (int i = 1; i <=100; i++) 
        {
            int fact=0;
            for (int j = 1; j <=i; j++) 
            {
                if(i%j==0)
                {
                    fact++;
                }
            }
            if (fact==2) 
            {
                count++;
                System.out.println(sl+")"+i);
                sl++;
                if (count==10) 
                {
                 break;   
                }
            }
            
        }
    }
}
