import java.util.Scanner;
class Pattern7
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int rows=sc.nextInt();
        System.out.println("enter the columns");
        int cols=sc.nextInt();
        for (int i = 1; i <=rows; i++) 
        {
            for (int j = 1; j <=cols; j++) 
            {
                if(i==j||j+i==rows+1)
                {
                    System.out.print("#"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
                
            }

            System.out.println(" ");
        }

        
    }
}