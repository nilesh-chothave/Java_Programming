// input : 7
// output : 1 * 3 * 5 * 7
import java.util.*;

class program177
{
    public static void Dispaly(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print("*\t"+iCnt);
            }
            else
            {
                int icount = 1;
                
                System.out.print("*\t");
            }
        }
        System.out.println();
    }

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iVlaue = 0;

        System.out.println("Enter the number of elements : ");
        iVlaue = sobj.nextInt();

        Dispaly(iVlaue);
    }  
}