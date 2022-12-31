import java.util.Scanner;
class New
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int row=sc.nextInt();
        System.out.println("enter the col: ");
        int col=sc.nextInt();
        
        for (int i = 1; i <=row; i++) 
        {
            for (int j = 1; j <=col; j++) 
            {
                if(j==1||j==col||i==(row+1)/2)
				{
                System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
				
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 1; i <=row; i++) 
        {
            for (int j = 1; j <=col; j++) 
            {
                if(j==1&&i!=1||j==col&&i!=1||i==1&&j!=1&&j!=col||i==(row+1)/2)
				{
                System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
				
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 1; i <=row; i++) 
        {
            for (int j = 1; j <=col; j++) 
            {
                if(j==1||i==1||i==(row+1)/2||j==col&&i<=(row+1)/2)
				{
                System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
				
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 1; i <=row; i++) 
        {
            for (int j = 1; j <=col; j++) 
            {
                if(j==1||i==1||i==(row+1)/2||j==col&&i<=(row+1)/2)
				{
                System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
				
            }
            System.out.println(" ");
        }

    }

}