import java.util.Scanner;
class Pattern12
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
                if(i==(rows+1)/2||j==(cols+1)/2||j==1&&i<=(rows+1)/2||i==1&&j>=(cols+1)/2||j==cols&&i>=(rows+1)/2||i==rows&&j<=(cols+1)/2)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
                
            }

            System.out.println(" ");
        }

        
    }
}