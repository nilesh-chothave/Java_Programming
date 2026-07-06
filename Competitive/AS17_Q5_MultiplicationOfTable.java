/* 
    5. Write a program to print the multiplication table of a number.
*/

class Logic
{
    void PrintTable(int num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(num * iCnt);
        }

    }
}


class AS17_Q5_MultiplicationOfTable 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
    }
}
