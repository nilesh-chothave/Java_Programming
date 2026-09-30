import java.util.*;

class program1191
{
    public static void Dispaly()
    {
        int i = 0;
        int j = 0;

        for(i = 1; i<=4; i++)
        {
            for(j = 1; j <= 4; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iVlaue = 0;

        // System.out.println("Enter the number of element : ");
        // iVlaue = sobj.nextInt();

        Dispaly();
    }  
}