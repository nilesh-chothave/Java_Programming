import java.util.*;

class program1189
{
    public static void Dispaly()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 4; iCnt++)
        {
            System.out.print("*\t");
        }
            System.out.println();

        for(iCnt = 1; iCnt <= 4; iCnt++)
        {
            System.out.print("*\t");
        }
            System.out.println();
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